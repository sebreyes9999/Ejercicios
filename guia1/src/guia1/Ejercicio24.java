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
public class Ejercicio24 {
    
     public static void main(String[] args){
        
        int nota;
        int cantNotas;
        float suma;
        float promedio;
        cantNotas =0;
        suma =0;
        promedio =0;
        
        System.out.println("Calculo de notas de un estudiante");
        Scanner notas = new Scanner(System.in);
        
         System.out.println("¿cuantas notas tiene el estudiante?: ");
         cantNotas = notas.nextInt();
        
        for(int i=0; i<cantNotas; i++){
            
            System.out.println("Introduzca la nota: ");
            nota = notas.nextInt();
            
            if((nota>=0)&& nota<=5){
                
                suma = suma + nota;
                System.out.println("La suma de las notas es: " +suma);
                promedio = suma/cantNotas;
                System.out.println("El promedio del estudiante es: "+promedio);
                
            }else{ 
              System.out.println("Nota invalida");
            }

        }
    }
}    
