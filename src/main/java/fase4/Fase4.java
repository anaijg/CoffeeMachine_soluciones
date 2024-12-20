package fase4;

import java.util.Scanner;

public class Fase4 {
    // ponemos estático lo que vaya a ser utilizado en cualquier méto-do de la clase
    static Scanner scanner = new Scanner(System.in);
    // ** CANTIDADES NECESARIAS PARA HACER UNA TAZA DE CAFÉ
    static final int AGUA_POR_TAZA = 200;
    static final int LECHE = 50;
    static final int CAFÉ = 15;

    // ** CANTIDADES INICIALES EN LA CAFETERA
    static final int AGUA_INICIAL = 400;
    static final int LECHE_INICIAL = 540;
    static final int CAFÉ_INICIAL = 120;
    static final int VASOS_INICIALES = 9;
    static final int EFECTIVO_INICIAL = 550;

    public static void presentacion() {
        System.out.println("La máquina de café tiene: ");
        System.out.println(AGUA_INICIAL + " ml de agua");
        System.out.println(LECHE_INICIAL + " ml de leche");
        System.out.println(CAFÉ_INICIAL + " g de café");
        System.out.println(VASOS_INICIALES + " vasos desechables");
        System.out.println("$" + EFECTIVO_INICIAL + " en efectivo");
    }

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
        presentacion();
        // INPUT
        System.out.println("Escribe la acción a realizar (buy, fill, take):");
        String accion = scanner.nextLine();
        switch (accion.toLowerCase()) {
            case "buy" -> { // comprar café
                //TODO comprar()
                System.out.println("¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int tipoCafe = scanner.nextInt();
                switch (tipoCafe) {
                    case 1 -> {
                        // TODO sacar a método/s
                        // Para preparar un espresso, la cafetera necesita 250 ml de agua y 16 g de café. Cuesta 4 dólares .
                        int agua = AGUA_INICIAL - 250;
                        int leche = LECHE_INICIAL;
                        int café = CAFÉ_INICIAL - 16;
                        int vasos = VASOS_INICIALES - 1;
                        int efectivo = EFECTIVO_INICIAL + 4;

                        System.out.println("La máquina de café tiene: ");
                        System.out.println(agua + " ml de agua");
                        System.out.println(leche + " ml de leche");
                        System.out.println(café + " g de café");
                        System.out.println(vasos + " vasos desechables");
                        System.out.println("$" + efectivo + " en efectivo");

                    }
                    case 2 -> {
                        // todo sacar a método/s
                        // Para preparar un café con leche, la máquina de café necesita 350 ml de agua, 75 ml de leche y 20 g de café. Cuesta 7 dólares .
                        int agua = AGUA_INICIAL - 350;
                        int leche = LECHE_INICIAL -75;
                        int café = CAFÉ_INICIAL - 20;
                        int vasos = VASOS_INICIALES - 1;
                        int efectivo = EFECTIVO_INICIAL + 7;

                        System.out.println("La máquina de café tiene: ");
                        System.out.println(agua + " ml de agua");
                        System.out.println(leche + " ml de leche");
                        System.out.println(café + " g de café");
                        System.out.println(vasos + " vasos desechables");
                        System.out.println("$" + efectivo + " en efectivo");
                    }
                    case 3 -> {
                        // todo capuccino
                        // Y para un capuchino, la cafetera necesita 200 ml de agua, 100 ml de leche y 12 g de café. Cuesta 6 dólares .
                        int agua = AGUA_INICIAL - 200;
                        int leche = LECHE_INICIAL -100;
                        int café = CAFÉ_INICIAL - 12;
                        int vasos = VASOS_INICIALES - 1;
                        int efectivo = EFECTIVO_INICIAL + 6;

                        System.out.println("La máquina de café tiene: ");
                        System.out.println(agua + " ml de agua");
                        System.out.println(leche + " ml de leche");
                        System.out.println(café + " g de café");
                        System.out.println(vasos + " vasos desechables");
                        System.out.println("$" + efectivo + " en efectivo");

                    }
                }
            }
            case "fill" -> { // rellenar suministros de la máquina
                // TODO rellenar()
            }
            case "take" -> { //  sacar el dinero
                // TODO retirarEfectivo()
            }
        }


    }
}
