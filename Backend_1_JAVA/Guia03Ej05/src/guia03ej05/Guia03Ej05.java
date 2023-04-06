/*
5. Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
package guia03ej05;

import java.util.Scanner;

public class Guia03Ej05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingrese un valor limite: ");
        int numLimite = leer.nextInt();

        System.out.println("Comience a ingresar numeros hasta superar el limite: ");

        /* Lineas 23 a 27 ejecutan el programa con bucle WHILE.
        while (suma <= numLimite) {
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("Falta sumar " + ((numLimite + 1) - suma) + " para superar el valor limite.");
        }
         */
 /* Lineas 30 a 34 ejecutan el programa con bucle DO/WHILE.*/
        do {
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("Falta sumar " + ((numLimite + 1) - suma) + " para superar el valor limite.");
        } while (suma <= numLimite);
    }
}
