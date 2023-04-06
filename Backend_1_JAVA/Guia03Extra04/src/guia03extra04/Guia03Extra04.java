/*
 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
 */
package guia03extra04;

import java.util.Scanner;

public class Guia03Extra04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero Arabigo entre 1 y 10");
        int num = leer.nextInt();

        switch (num) {
            case 1: {
                System.out.println("El equivalente en numero Romanoes I");
                break;
            }
            case 2: {
                System.out.println("El equivalente en numero Romanoes II");
                break;
            }
            case 3: {
                System.out.println("El equivalente en numero Romanoes III");
                break;
            }
            case 4: {
                System.out.println("El equivalente en numero Romanoes IV");
                break;
            }
            case 5: {
                System.out.println("El equivalente en numero Romanoes V");
                break;
            }
            case 6: {
                System.out.println("El equivalente en numero Romanoes VI");
                break;
            }
            case 7: {
                System.out.println("El equivalente en numero Romanoes VII");
                break;
            }
            case 8: {
                System.out.println("El equivalente en numero Romanoes VIII");
                break;
            }
            case 9: {
                System.out.println("El equivalente en numero Romanoes IX");
                break;
            }
            case 10: {
                System.out.println("El equivalente en numero Romanoes X");
                break;
            }
            default: {
                System.out.println("El valor ingresado no esta dentro de los parametros.");
            }

        }

    }
}
