/* 1. Crear un programa que dado un número determine si es par o impar.
 */
package guia03ej01;

import java.util.Scanner;

public class Guia03Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");

        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es PAR.");
        } else {
            System.out.println("El numero ingresado es IMPAR.");
        }

    }
}
