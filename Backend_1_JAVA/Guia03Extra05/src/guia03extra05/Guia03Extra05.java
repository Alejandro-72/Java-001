/*
5. Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package guia03extra05;

import java.util.Scanner;

public class Guia03Extra05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la clase de socio.");
        System.out.println("Clase A");
        System.out.println("Clase B");
        System.out.println("Clase C");
        System.out.println("Elija Opcion: ");

        String claseSocio = leer.next();
        while (!claseSocio.equalsIgnoreCase("a") && !claseSocio.equalsIgnoreCase("b") && !claseSocio.equalsIgnoreCase("c")) {
            System.out.println("Ingrese una opcion valida, A, B o C");
            claseSocio = leer.next();
        }
        System.out.println("Ingrese el costo del tratamiento: ");
        int costo = leer.nextInt();
        while (costo <= 0) {
            System.out.println("El dato ingresado no es correcto. Por favor ingrese el costo del tratamiento:");
            costo = leer.nextInt();
        }
        if (claseSocio.equalsIgnoreCase("a")) {
            System.out.println("El costo del tratamiento es de $" + costo + ". Por ser socio clase A solo debe abonar el 50%: $" + (costo * 0.5));
        } else if (claseSocio.equalsIgnoreCase("b")) {
            System.out.println("El costo del tratamiento es de $" + costo + ". Por ser socio clase B tiene un descuento del 35%. Solo debe abonar: $" + (costo * 0.65));
        } else {
            System.out.println("El costo del tratamiento es de $" + costo + ". Lo Lamentamos los socio clase C no tienen descuentos en los tratamientos.");
        }
    }
}
