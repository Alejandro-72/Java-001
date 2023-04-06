/*
3. Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
*/

package guia04ej03;

import java.util.Scanner;

public class Guia04Ej03{
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienbenido al conversor de Moneda.");
        System.out.println("Para cambiar a Libras oprima (L).");
        System.out.println("Para cambiar a Pesos oprima (P).");
        System.out.println("Para cambiar a Yenes oprima (Y).");
        System.out.print("Elija opcion: ");
        String opcion = leer.nextLine();
        while(!opcion.equalsIgnoreCase("L") && !opcion.equalsIgnoreCase("P") && !opcion.equalsIgnoreCase("Y")){
            System.out.println("Elija una opcion valida, (L), (P), (Y): ");
            opcion = leer.nextLine();
        }
        
        System.out.print("Ingrese la cantidad que desea cambiar: ");
        int cantidad = leer.nextInt();
        
        
        conversion(opcion, cantidad);  
    }
    
    public static void conversion(String opcion, int cantidad){
               
        switch(opcion){
            case "L":
            case "l":
                System.out.println("Hola");
        }
                
        
    }
}