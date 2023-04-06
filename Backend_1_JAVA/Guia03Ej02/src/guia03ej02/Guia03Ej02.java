/*  2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia03Ej02;

import java.util.Scanner;

public class Guia03Ej02 {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        System.out.println("Ingrese la palabra `eureka` para validar: ");
        String palabra = variable.next();

        if (palabra.equalsIgnoreCase("eureka")) {
            System.out.println("Palabra CORRECTA");
        } else {
            System.out.println("Palabra INCORRECTA");
        }

    }
}
