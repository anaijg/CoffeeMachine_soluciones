package fase4;

import java.util.Scanner;

public class Fase3 {
    // ponemos estático lo que vaya a ser utilizado en cualquier méto-do de la clase
    static Scanner scanner = new Scanner(System.in);
    static final int AGUA_POR_TAZA = 200;
    static final int LECHE = 50;
    static final int CAFÉ = 15;

    public static int pedirDatos(String texto) {
        System.out.print("Escribe " + texto + " ");
        return scanner.nextInt();
    }

    public static int determinarNumeroMaximoTazas(int agua, int leche, int café) {
        int tazasAgua = agua / AGUA_POR_TAZA; // 300 -> 1 taza
        int tazasLeche = leche / LECHE; // 65 -> 1 taza
        int tazasCafe = café / CAFÉ; // 100 -> 6 tazas

        int min = tazasAgua; // ponemos las tazas de agua como mínimo temporal
        if (tazasLeche < min) {
            min = tazasLeche;
        }
        if (tazasCafe < min) {
            min = tazasCafe;
        }
        return min;
    }

    public static void imprimirRespuesta(int t, int tP) {
        if (t == tP) {
            System.out.println("Sí, puedo hacer esa cantidad de café.");
        } else if ( t > tP) {
            System.out.println("No, sólo puedo hacer " + tP + " taza(s) de café.");
        } else { // esto implica el 3er caso: tazas < tazasPosibles
            System.out.println("Sí, puedo hacer esa cantidad de café e incluso " + (tP - t) + " tazas más.");
        }
    }

    public static void main(String[] args) {

        // INPUT Primero, leer los ml de agua, leche y café.
        int agua = pedirDatos("cuántos ml de agua tiene la máquina:");
        int leche = pedirDatos("cuántos ml de leche tiene la máquina:");
        int café = pedirDatos("cuántos gramos de café tiene la máquina:");
        int tazas = pedirDatos("cuántas tazas de café necesitas hacer:");

        // PROCESAMIENTO
        int tazasPosibles = determinarNumeroMaximoTazas(agua, leche, café);

        // OUTPUT
        imprimirRespuesta(tazas, tazasPosibles);



    }
}
