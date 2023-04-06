/*
 3. Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Length() en Java.
 */
package guia03ej03;

import java.util.Scanner;

public class Guia03Ej03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 cracyeres: ");

        String palabra = leer.nextLine(); /*nextline() toma en cuenta los espacios.*/
                                          /*nextln() lee la variable ingresada hasta el primer espacio.*/

        if (palabra.length() == 8) {
            System.out.println("La palabra o frase ingresada es CORRECTA");
        } else {
            System.out.println("La palabra o frase ingresada es INCORRECTA");
        }

    }

}
