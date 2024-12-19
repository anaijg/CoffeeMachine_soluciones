package fase2;

import java.util.Scanner;

public class Fase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUT Primero, lea el número de bebidas de café de la entrada.
        System.out.println("Escribe cuántas tazas de café vas a necesitar:");
        int tazas = scanner.nextInt();

        // TODO Calcula la cantidad de cada ingrediente que necesitará la máquina.
        //  Ten en cuenta que una taza de café preparada en esta cafetera contiene 200 ml de agua, 50 ml de leche y 15 g de granos de café. Devuelva al usuario las cantidades requeridas de ingredientes.
        // PROCESAMIENTO
        // creamos una constante por cada ingrediente para una taza de café
        final int AGUA_POR_TAZA = 200;
        final int LECHE = 50;
        final int CAFÉ = 15;

        // creamos una variable para cada ingrediente para calcular la cantidad según las tazas que queramos preprar
        int agua = AGUA_POR_TAZA * tazas;
        int leche = LECHE * tazas;
        int café = CAFÉ * tazas;

        // OUTPUT
        System.out.println("Para " + tazas + " de café necesitas: ");
        System.out.println(agua + " ml de agua");
        System.out.println(leche + " ml de leche");
        System.out.println(café + " g de café");

    }
}
