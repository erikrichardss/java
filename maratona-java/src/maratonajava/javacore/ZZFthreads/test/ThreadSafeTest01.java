package maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames {
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void removeFirst() {
        if (!names.isEmpty()) {
            System.out.println(getThreadName());
            System.out.println(names.remove(0));
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Junkrat");

        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
