/*
2. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package guia04ej02;

import java.util.Scanner;

public class Guia04Ej02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de personas del muestreo: ");
        int nPersonas = leer.nextInt();

        edad(nPersonas);
    }

    public static void edad(int nPersonas) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String salir;

        for (int i = 1; i <= nPersonas; i++) {

            System.out.print("Ingrese el nombre del sujeto " + i + " : ");
            nombre = leer.nextLine();

            System.out.print("\nIngrese la edad: ");
            edad = leer.nextInt();

            if (edad >= 18) {
                System.out.println("\n" + nombre + " es MAYOR de edad.");
            } else {
                System.out.println("\n" + nombre + " es menor de edad.");
            }
            System.out.println("\nQuiere seguir mostrando personas? Oprima (N) para salir.");
            salir = leer.nextLine();
            salir = leer.nextLine();
            if (salir.equalsIgnoreCase("n")) {
                i = nPersonas + 1;
            }
        }
    }
}
