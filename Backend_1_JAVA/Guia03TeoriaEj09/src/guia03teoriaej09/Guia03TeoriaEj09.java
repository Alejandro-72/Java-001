/* Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package guia03teoriaej09;

import java.util.Scanner;

public class Guia03TeoriaEj09 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int suma = 0;
        int contador = 20;
        System.out.println("Ingrese 20 numeros para realizar su suma o 0, para interrumpir la suma: ");

        do {
            System.out.println("Restan ingresar " + contador + " numeros");
            int num = numero.nextInt();
            contador--;

            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                System.out.println("Ha ingresado un 0.");
                break;
            } else {

            }
        } while (contador > 0);

        System.out.println("La suma de los " + (20 - contador) + " numeros ingresados da: " + suma);
    }
}
