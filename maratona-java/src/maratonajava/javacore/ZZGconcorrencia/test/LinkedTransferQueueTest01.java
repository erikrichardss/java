package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Erik"));
        System.out.println(tq.offer("Richard"));
        System.out.println(tq.offer("Richard", 10, TimeUnit.SECONDS));
        tq.put("Erik");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Erik");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());
    }
}
