package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.domain.Category;
import maratonajava.javacore.ZZEstreams.domain.LightNovel;
import maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest16 {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num) {

        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {

            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (init - end) + "ms");
    }

    private static void sumStreamIterate(long num) {

        System.out.println("Sum StreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (init - end) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {

        System.out.println("Sum sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (init - end) + "ms");
    }

    private static void sumLongStreamIterate(long num) {

        System.out.println("Sum sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (init - end) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num) {

        System.out.println("Sum sumParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (init - end) + "ms");
    }
}
