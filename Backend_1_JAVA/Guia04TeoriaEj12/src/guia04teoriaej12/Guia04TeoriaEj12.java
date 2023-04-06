/*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package guia04teoriaej12;

import java.util.Scanner;

public class Guia04TeoriaEj12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Debe ingresar dos numeros para poder calcular si el primero es multiplo del segundo."
                + "\n Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();

        EsMultiplo(num1, num2);
    }
    
    

    public static void EsMultiplo(int num1, int num2) {

        if ((num1 % num2) == 0) {
            System.out.println(num1 + " Es multiplo de " + num2);
        } else {
            System.out.println(num1 + " NO es multiplo de " + num2);
        }
    }
}
