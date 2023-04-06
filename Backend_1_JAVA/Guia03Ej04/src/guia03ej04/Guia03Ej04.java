/* 
4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package guia03ej04;

import java.util.Scanner;

public class Guia03Ej04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String letra = leer.nextLine();

        String inicial = letra.substring(0, 1);

        if (inicial.equalsIgnoreCase("a")) {
            System.out.println("Correcto, la primer letra de la frase o palabra es una A.");
        } else {
            System.out.println("Incorrecto, la primer letra de la frase o palabra NO es una A. Es una " + inicial);
        }
    }

}
