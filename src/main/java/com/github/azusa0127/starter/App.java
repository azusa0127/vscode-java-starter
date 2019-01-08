package com.github.azusa0127.starter;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static boolean isPrime(int n) {
        if (n < 1) return false;
        for (int i = 2; i <= Math.floor(Math.sqrt((double)n)); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
