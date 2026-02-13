package aplicacion;

public class Main {

    public static void main(String[] args) {

        // Tribonacci
        int n = 10;
        System.out.println("Tribonacci de " + n + " = " + TribonacciDP.tribonacci(n));

        System.out.println("\nSoluciones para 4 Reinas:");
        NReinas.resolver();
    }
}