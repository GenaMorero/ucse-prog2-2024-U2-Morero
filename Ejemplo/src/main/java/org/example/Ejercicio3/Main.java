package org.example.Ejercicio3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<Integer> futuro1 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());
        CompletableFuture<Integer> futuro2 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());
        CompletableFuture<Integer> futuro3 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());
        CompletableFuture<Integer> futur4 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());

        CompletableFuture<Void> EsperaTarea = CompletableFuture.allOf(futuro1, futuro2, futuro3, futur4);
        EsperaTarea.thenRun(() -> {
            try {
                int suma = futuro1.get() + futuro2.get() + futuro3.get() + futur4.get();
                System.out.println("La suma de los valores es: " + suma);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).join();
    }

    private static int GenararNumeroRandomDormir() {
        int valorAleatorio = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(valorAleatorio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valorAleatorio;
    }
}