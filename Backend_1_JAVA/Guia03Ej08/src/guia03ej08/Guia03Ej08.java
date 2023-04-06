/*
8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia03ej08;

import java.util.Scanner;

public class Guia03Ej08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del cuadrado: ");
        int lado = leer.nextInt();

        for (int i = 0; i < lado; i++) {
            if (i == 0 || i == (lado - 1)) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < lado; j++) {
                    if (j == 0 || j == (lado - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
