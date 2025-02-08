package org.UMG.principal;

public class Ejercicio1Progra3 {

    public static int calcularPuntuacion(int[] aporte) {
        int puntuacionTotal = 0;

        for (int numero : aporte) {
            // Si el número es par (incluyendo 0)
            if (numero % 2 == 0) {
                puntuacionTotal += 1;
            }
            // Si el número es impar y no es 5
            else if (numero != 5) {
                puntuacionTotal += 3;
            }
            // Si el número es 5
            if (numero == 5) {
                puntuacionTotal += 5;
            }
        }

        return puntuacionTotal;
    }

    public static void main(String[] args) {
        // Ejemplos
        int[] aporte1 = {1, 2, 3, 4, 5};
        System.out.println("Producción 1: " + calcularPuntuacion(aporte1));

        int[] aporte2 = {17, 19, 21};
        System.out.println("Producción 2: " + calcularPuntuacion(aporte2));

        int[] aporte3 = {5, 5, 5};
        System.out.println("Producción 3: " + calcularPuntuacion(aporte3));
    }
}
