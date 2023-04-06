/*3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia02ej03;

import java.util.Scanner;

public class Guia02Ej03 {

    public static void main(String args[]) {
        String frace;
        String fMayuscula;
        String fMinuscula;
        System.out.println("Ingrese su Frase: ");
        Scanner leer = new Scanner(System.in);
        frace = leer.nextLine();
        System.out.println("La frase en MAYUSCULA es: " + frace.toUpperCase());
        System.out.println("La frase en minuscula es: " + frace.toLowerCase());
    }
}
