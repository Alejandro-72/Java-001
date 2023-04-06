/* Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package guia03teoriaej10;

import java.util.Scanner;

public class Guia03TeoriaEj10 {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        /*int num1, num2, num3, num4;*/
        System.out.println("Ingrese 4 numeros entre 1 y 20");

        for (int j = 1; j < 5; j++) {

            int num = variable.nextInt();

            while (num < 0 || num > 20) {
                System.out.println("Ingreso un numero incorrecto");
                num = variable.nextInt();
            }
            System.out.print(num +" ");
            for (int i = 0; i < num; i++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
