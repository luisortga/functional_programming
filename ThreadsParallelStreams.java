package functional_programming;

import java.util.Arrays;

public class ThreadsParallelStreams {

    public static void main(String[] args) {

        /* parallel Streams

         * Threads: multiprocesos */

        // fibonacci
        int[] nums = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };

        /* Stream secuencial */

        Long timeStart = System.nanoTime();
        Arrays.stream(nums)
                .forEach(n -> System.out.println("Secuencial: " + n));
        Long timeEnd = System.nanoTime();
        System.out.println("Tiempo secuencial: " + (timeEnd-timeStart) + " nanosegundos.");

        /* Parallel Stream: utilizar mas de un núcleo del procesador */

        /* En Parallel no es secuencial, se divide las task en diferentes threads, no tiene un orden, se ordenan como van terminando los hilos las tareas.  */
        timeStart = System.nanoTime();
        Arrays.stream(nums)
                .parallel()
                .forEach(n -> System.out.println("Paralelo: " + n));
        timeEnd = System.nanoTime();
        System.out.println("Tiempo paralelo: " + (timeEnd-timeStart) + " nanosegundos.");
    }
}
