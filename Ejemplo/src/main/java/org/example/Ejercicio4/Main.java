package org.example.Ejercicio4;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<Integer> futuro1 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());
        CompletableFuture<Integer> futuro2 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());
        CompletableFuture<Integer> futuro3 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());
        CompletableFuture<Integer> futuro4 = CompletableFuture.supplyAsync(() -> GenararNumeroRandomDormir());

        CompletableFuture<Object> primeraFinalizada = CompletableFuture.anyOf(futuro1, futuro2, futuro3, futuro4);
        primeraFinalizada.thenAccept(result -> {
            System.out.println("El valor de la tarea más rápida es: " + result);
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