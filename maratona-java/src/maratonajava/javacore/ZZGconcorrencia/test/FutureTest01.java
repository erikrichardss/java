package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Double> dollar = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 4.35D;
        });
        System.out.println(doSomething());
        Double dollarResponse = dollar.get();
        System.out.println("Dollar: " + dollarResponse);
        doSomething();
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += 1;
        }
        return sum;
    }
}
