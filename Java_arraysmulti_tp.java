/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_arraysmulti_tp;

import java.util.Scanner;

/**
 *
 * @author juampi
 */


public class Java_arraysmulti_tp {
    

    public static void main(String[] args) {
        int i;
        int num1 = 0;
        boolean opcion;
        Scanner scanner = new Scanner (System.in);
        opcion = false;
        
        do {
        System.out.println("ingrese un entero mayor o igual a 3 y menor o igual a 10");
        num1 = scanner.nextInt();
        if (num1>=3 && num1<=10)
                opcion = true;
        else {
           System.out.println("Número inválido");
                opcion = false; 
        }
                
        } while (opcion == false);
        
        int[][] arregloMulti = new int[num1][num1];
       
        int fila;
        int columna;
        for (fila=0; fila < arregloMulti.length; fila++) {
            for (columna=0; columna < arregloMulti[fila].length; columna++) {
                System.out.println("ingrese un valor para "+ fila +","+ columna);
                arregloMulti[fila][columna] = scanner.nextInt();
            }
            
            
                
                
            }
        
        System.out.println("---------------------------------------------------");
        for (fila=0; fila < arregloMulti.length; fila++) {
                for (columna=0; columna < arregloMulti[fila].length; columna++) {
                    System.out.print(arregloMulti[fila][columna] + "\t");
                    
                }
                System.out.println();
                
                
                
        }
        
     int[] sumaColumnas = new int[num1];
     
      for (columna = 0; columna < num1; columna++) {
            for (fila = 0; fila < num1; fila++) {
                sumaColumnas[columna] += arregloMulti[fila][columna];
            }
                
         
     }
     int sumaColumnas2 = 0;
    for (i=0; i < sumaColumnas.length; i++) {
        System.out.print(sumaColumnas[i] + " ");
        sumaColumnas2 += sumaColumnas[i];
    }
        
    System.out.println("");
    System.out.println("TOTAL: " + sumaColumnas2);
    
        
    }
}
