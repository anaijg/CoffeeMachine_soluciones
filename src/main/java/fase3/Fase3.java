package fase3;

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

    // TODO método que escriba el resultado en función de los datos que tenemos return String (o directamente que lo imprima dentro del métodos

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

    public static void main(String[] args) {

        // INPUT Primero, leer los ml de agua, leche y café.
        int agua = pedirDatos("cuántos ml de agua tiene la máquina:");
        int leche = pedirDatos("cuántos ml de leche tiene la máquina:");
        int café = pedirDatos("cuántos gramos de café tiene la máquina:");
        int tazas = pedirDatos("cuántas tazas de café necesitas hacer:");

        // OUTPUT
//        System.out.println("Para " + tazas + " de café necesitas: ");
//        System.out.println(agua + " ml de agua");
//        System.out.println(leche + " ml de leche");
//        System.out.println(café + " g de café");
        int tazasPosibles = determinarNumeroMaximoTazas(agua, leche, café);
        System.out.println(tazasPosibles);

    }
}
