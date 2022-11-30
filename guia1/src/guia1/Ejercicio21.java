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
public class Ejercicio21 {
    
    public static void main(String[] args){
        
        float suma;
        float numero;
        int cantNumeros;
        suma =0;
        
        System.out.println("Suma con cantidad que se pide");
        Scanner cantidad = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de numeros: ");
        cantNumeros = cantidad.nextInt();
        
        for(int i = 1; i<cantNumeros; i++){
            
            System.out.println("Introduzca el numero # " + i + " : ");
            numero = cantidad.nextInt();
            
            suma = suma + numero;
        
        }
        System.out.println("La suma es: "+suma);
    }
    
}
