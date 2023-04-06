/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package guia02ej01;

import java.util.Scanner;

/**
 *
 * @author Deposito
 */
public class Guia02Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int resultado;
        System.out.println("Ingrese numero 1:");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2:");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("La suma de los numeros ingresados da:" + resultado);
    }

}

