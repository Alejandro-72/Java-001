/*2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/

package guia02ej02;
        
import java.util.Scanner;

public class Guia02Ej02{

public static void main(String args[]){
    String Nombre;
    System.out.println("Ingrese su nombre y apellido: ");
    Scanner leer=new Scanner(System.in);
    Nombre = leer.nextLine();
    System.out.println("Su nombre y apellido es: " + Nombre);
}
}
