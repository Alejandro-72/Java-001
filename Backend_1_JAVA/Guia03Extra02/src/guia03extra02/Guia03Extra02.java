/*
 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package guia03extra02;

import java.util.Scanner;

public class Guia03Extra02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux;
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d = (int) (Math.random() * 10);

        System.out.println(" a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);

        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println("\n a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " + d);

    }

}
