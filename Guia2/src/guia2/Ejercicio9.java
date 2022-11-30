/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio9 {
    
    public static void main(String[] args ){
        
        int[] arreglo = new int[10];
        
        System.out.println("Un arreglo de 1 y 0");
        
        arreglo[0]=1;
        arreglo[1]=0;
        arreglo[2]=1;
        arreglo[3]=0;
        arreglo[4]=1;
        arreglo[5]=0;
        arreglo[6]=1;
        arreglo[7]=0;
        arreglo[8]=1;
        arreglo[9]=0;

        
        
        for(int j=0; j<arreglo.length; j++){
            System.out.println("Arreglo["+j+"] = " +arreglo[j]);
        
        }

        
        
    }
    
}
