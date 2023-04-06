/* Ejercicio 6:
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */
package guia03teoriaej06;

import java.util.Scanner;

public class Guia03TeoriaEj06 {

    public static void main(String args[]) {
        Scanner variable = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = variable.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = variable.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25.");
        } else if (num1 > 25 && num2 <= 25) {
            System.out.println("Solo el primer numero ingresado es mayor a 25");
        } else if (num1 <= 25 && num2 > 25) {
            System.out.println("solo el segundo numero ingresado es mayor a 25.");
        } else {
            System.out.println("Ambos numeros son menores a 25.");
        }
    }
}
