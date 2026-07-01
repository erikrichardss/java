package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new HashMap<>();
    private final ReentrantReadWriteLock rrw;


    public MapReadWrite(ReentrantReadWriteLock rrw) {
        this.rrw = rrw;
    }

    public void put(String key, String value) {
        rrw.writeLock().lock();
        try {
            if (rrw.isWriteLocked()) {
                System.out.printf("%s obteve o WRITE lock \n", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rrw.writeLock().unlock();
        }
    }

    public Set<String> allKeys() {
        rrw.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rrw.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                mapReadWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if (rwl.isWriteLocked()) {
                System.out.printf("WRITE LOCKED \n");
            }
            rwl.readLock().lock();
            System.out.printf("FINALLY I GOT THE DAMN LOCK \n");
            try {
                System.out.printf("%s %s ", Thread.currentThread().getName(), mapReadWrite.allKeys());
            } finally {
                rwl.readLock().unlock();
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);

        t1.start();
        t2.start();
        t3.start();
    }
}
