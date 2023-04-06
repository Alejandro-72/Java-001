/*
 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package guia03extra01;

import java.util.Scanner;

public class Guia03Extra01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos: ");

        int tiempo = leer.nextInt();

        int minutos = tiempo % 60;
        int horas = tiempo / 60;
        int dias = horas / 24;
        horas = horas % 24;

        System.out.println(tiempo + " minutos equivalen a: " + dias + " dias, " + horas + " horas y " + minutos + " minutos.");

    }

}
