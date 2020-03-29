/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author naomi
 */
public class EJERCICIOSjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num,num2,sor,num1;
        num1 = (int)(Math.random()*11+1);
        System.out.println("Introduce numero 1:");
        num = teclado.nextInt();
        System.out.println("Introduce numero 2:");
        num2 = teclado.nextInt();
        System.out.println("La multiplicacion + numero sorpresa es:"+ num*num2*num1);
        System.out.println("¿Cual es el numero sorpresa x5?, si este es resultado de multiplicacion");
        sor = teclado.nextInt();
        num1=num1*5;
        if(num1==sor)
            System.out.println("Has encontrado el numero sorpresa");
        else System.out.println("No es el numero sorpresa");
    }
    
}
