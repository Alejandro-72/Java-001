/*
1. Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package guia04ej01;

import java.util.Scanner;

public class Guia04Ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean fin = false;

        System.out.println("Ingrese dos numeros enteros positivos");

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
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opcion:\n");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int resultadoSuma = sumar(num1, num2);
                    System.out.println("\nEligio SUMAR: " + num1 + " + " + num2 + " = " + resultadoSuma + "\n");
                    break;
                case 2:
                    int resultadoResta = restar(num1, num2);
                    System.out.println("\nEligio RESTAR: " + num1 + " - " + num2 + " = " + resultadoResta + "\n");
                    break;
                case 3:
                    int resultadoMultiplicacion = multiplicar(num1, num2);
                    System.out.println("\nEligio MULTIPLICAR: " + num1 + " * " + num2 + " = " + resultadoMultiplicacion + "\n");
                    break;
                case 4:
                    int resultadoDivision = dividir(num1, num2);
                    System.out.println("\nEligio DIVIDIR: " + num1 + " / " + num2 + " = " + resultadoDivision + "\n");
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
    }

    public static int sumar(int num1, int num2) {
        int resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

    public static int restar(int num1, int num2) {
        int resultadoResta = num1 - num2;
        return resultadoResta;
    }

    public static int multiplicar(int num1, int num2) {
        int resultadoMultiplicacion = num1 * num2;
        return resultadoMultiplicacion;
    }

    public static int dividir(int num1, int num2) {
        int resultadoDivision = num1 / num2;
        return resultadoDivision;
    }
}
