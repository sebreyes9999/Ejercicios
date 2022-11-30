/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio22 {
    
    public static void main(String[] args){
        
        float numero;
        int cantNumeros;
        int cantPositivos;
        int cantNegativos;
        cantNumeros =0;
        cantPositivos =0;
        cantNegativos =0;
        
        System.out.println("Cantidad de positivos y negativos");
        Scanner numeros = new Scanner(System.in);
        
         System.out.println("Introduzca la cantidad de numeros: ");
         cantNumeros = numeros.nextInt();
        
        for(int i=0; i<cantNumeros; i++){
            
            System.out.println("Introduzca un numero: ");
            numero = numeros.nextInt();
            
            if(numero>0){
                
                cantPositivos++;
                
            }else{
                
                if(numero<0){
                    
                    cantNegativos++;
                }
            }
        
        }
        System.out.println("Cantidad de positivos: " +cantPositivos);
        System.out.println("Cantidad de negativos: " +cantNegativos);
        
                
    }
    
}
