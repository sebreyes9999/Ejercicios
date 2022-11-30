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
public class Ejercicio23 {
    
    public static void main(String[] args){
        
        float numero;
        int cantNumeros;
        int cantPares;
        int cantImpares;
        cantNumeros =0;
        cantPares =0;
        cantImpares =0;
        
        System.out.println("Cantidad de pares e impares");
        Scanner numeros = new Scanner(System.in);
        
         System.out.println("Introduzca la cantidad de numeros: ");
         cantNumeros = numeros.nextInt();
        
        for(int i=0; i<cantNumeros; i++){
            
            System.out.println("Introduzca un numero: ");
            numero = numeros.nextInt();
            
            if(numero %2 == 0){
                
                cantPares++;
                
            }else{
                    
                    cantImpares++;  
            }
        
        }
        System.out.println("Cantidad de pares: " +cantPares);
        System.out.println("Cantidad de impares: " +cantImpares);
        
                
    }
}
    

