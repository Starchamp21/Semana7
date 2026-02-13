package aplicacion;

public class NReinas {

    private static final int N = 4;

    public static void resolver() {
        int[] tablero = new int[N]; // tablero[fila] = columna
        colocarReina(tablero, 0);
    }

    private static void colocarReina(int[] tablero, int fila) {

        if (fila == N) {
            imprimirSolucion(tablero);
            return;
        }

        for (int col = 0; col < N; col++) {

            if (esValido(tablero, fila, col)) {
                tablero[fila] = col;
                colocarReina(tablero, fila + 1);
            }
        }
    }

    private static boolean esValido(int[] tablero, int filaActual, int colActual) {

        for (int i = 0; i < filaActual; i++) {

            // Misma columna.
            if (tablero[i] == colActual) {
                return false;
            }

            // Diagonal.
            if (Math.abs(tablero[i] - colActual) == Math.abs(i - filaActual)) {
                return false;
            }
        }

        return true;
    }

    private static void imprimirSolucion(int[] tablero) {

        System.out.println("Solución:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (tablero[i] == j)
                    System.out.print(" Q ");
                else
                    System.out.print(" . ");
            }
            System.out.println();
        }

        System.out.println();
    }
}