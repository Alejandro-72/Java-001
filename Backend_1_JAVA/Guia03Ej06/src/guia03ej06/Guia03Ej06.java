/*
6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

            MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. salir
            Elija Opcion:
 */
package guia03ej06;

import java.util.Scanner;

public class Guia03Ej06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean fin = false;

        System.out.println("Ingrese dos numeros enteros positivos");

        /* do {
            /* Si el do/while comienza aca, siempre se deben ingresar valores nuevos
             para luego hacer los calculos.
         */
        System.out.println("Ingrese el Primer numero: ");
        int num1 = leer.nextInt();
        while (num1 <= 0) {
            System.out.println("Por favor un entero mayor que cero: ");
            num1 = leer.nextInt();
        }
        System.out.println("Ingrese el Segundo numero: ");
        int num2 = leer.nextInt();
        while (num2 <= 0) {
            System.out.println("Por favor un entero mayor que cero: ");
            num2 = leer.nextInt();
        }

        do {
            /* Si el do/while comienza aca, el programa ejecuta cualquier calculo
            utilizando siempre los mismos valores de num1 y num2.
             */
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opcion:\n");

            int opcion = leer.nextInt();
            /* System.out.println("\n");
            /* Realiza un salto de linea*/

            switch (opcion) {
                case 1:
                    int sumar = num1 + num2;
                    System.out.println("\nOpcion 1: SUMA. " + num1 + " + " + num2 + " = " + sumar + "\n");
                    break;
                case 2:
                    int restar = num1 - num2;
                    System.out.println("\nOpcion 2: RESTA. " + num1 + " - " + num2 + " = " + restar + "\n");
                    break;
                case 3:
                    int multiplicar = num1 * num2;
                    System.out.println("\nOpcion 3: MULTIPLICACION. " + num1 + " * " + num2 + " = " + multiplicar + "\n");
                    break;
                case 4:
                    int dividir = num1 / num2;
                    System.out.println("\nOpcion 4: DIVISION. " + num1 + " / " + num2 + " = " + dividir + "\n");
                    break;
                case 5:
                    String confirmacion;
                    System.out.println("\n¿Está seguro que desea salir del programa (S/N)?");
                    confirmacion = leer.next();
                    while (!confirmacion.equalsIgnoreCase("s") && !confirmacion.equalsIgnoreCase("n")) {
                        System.out.println("Presione S para salir o N para continuar en el programa.");
                        confirmacion = leer.next();
                    }
                    if (confirmacion.equalsIgnoreCase("s")) {
                        fin = true;
                        System.out.println("Gracias por usar este programa.");
                    } else {
                        fin = false;
                    }
                    break;
                default:
                    System.out.println("\n ELIJA UNA OPCION VALIDA. \n");
            }
        } while (fin == false);

        System.out.println("Fin.");
    }
}
