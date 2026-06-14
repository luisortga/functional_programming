package functional_programming.invincible;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiCoreTasks {

    // Simula una tarea pesada (cálculo de números primos)
    static long calcularPrimos(int limite) {
        long count = 0;
        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) count++;
        }
        return count;
    }

    static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {

        // 1) Crear un pool con exactamente 4 hilos (uno por core físico)
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // 2) Definir 4 tareas como Callable (pueden devolver un valor)
        List<Callable<String>> tareas = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            final int taskId = i;
            final int limite = 50_000 * taskId; // cada tarea trabaja distinto volumen

            tareas.add(() -> {
                String thread = Thread.currentThread().getName();
                System.out.printf("Tarea %d iniciada en %s%n", taskId, thread);

                long inicio = System.currentTimeMillis();
                long resultado = calcularPrimos(limite);
                long tiempo = System.currentTimeMillis() - inicio;

                return String.format("Tarea %d [%s]: %d primos hasta %d (%d ms)",
                        taskId, thread, resultado, limite, tiempo);
            });
        }

        // 3) Enviar todas las tareas al pool → se ejecutan en paralelo
        List<Future<String>> futures = executor.invokeAll(tareas);

        // 4) Recoger resultados (Future.get() bloquea hasta que cada tarea termina)
        System.out.println("\n=== Resultados ===");
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        // 5) Cerrar el pool limpiamente
        executor.shutdown();
        executor.awaitTermination(30, TimeUnit.SECONDS);
        System.out.println("\nTodas las tareas completadas.");
    }
}