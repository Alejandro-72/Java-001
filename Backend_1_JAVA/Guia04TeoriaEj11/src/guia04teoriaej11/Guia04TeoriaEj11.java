/*
Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package guia04teoriaej11;

import java.util.Scanner;

public class Guia04TeoriaEj11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase a codificar y termine con un punto: ");
        String frase = leer.nextLine();

        String retorno = codificacion(frase);
        System.out.println("\n" + retorno);
    }

    public static String codificacion(String frase) {

        String codificado = " ";

        int j = frase.length();
        for (int i = 0; i < j; i++) {
            String letra = (frase.substring(i, (i + 1)));
            System.out.print(" " + letra);

            switch (letra) {
                case "a":
                case "A":
                    letra = "@";
                    break;
                case "e":
                case "E":
                    letra = "#";
                    break;
                case "i":
                case "I":
                    letra = "$";
                    break;
                case "o":
                case "O":
                    letra = "%";
                    break;
                case "u":
                case "U":
                    letra = "*";
                    break;
                default:
                    break;
            }
            codificado = codificado + letra + " ";
        }
        return codificado;
    }
}
