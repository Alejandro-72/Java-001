/* Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia03teoriaej08;

import java.util.Scanner;

public class Guia03TeoriaEj08 {

    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        int nota = -100;

        System.out.println("Ingrese una nota entre 0 y 10");
        while (nota < 0 || nota > 10) {
            nota = variable.nextInt();
        }
    }
}
