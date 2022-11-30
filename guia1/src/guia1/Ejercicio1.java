/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float num1;
        float num2;
        float suma;
        float resta;
        float multi;
        float divi;
        
        System.out.println("Las 4 principales operaciones aritmeticas");
        
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        num1 = numero1.nextInt();
  
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Introdusca el segundo numero: ");
        num2 = numero2.nextInt();
        
        suma = num1 + num2;
        System.out.println("La suma de los numeros es: "+suma);
        
        resta = num1 - num2;
        System.out.println("La resta de los numeros es: "+resta);
        
        multi = num1 * num2;
        System.out.println("La multiplicación de los numeros es: "+multi);
        
        divi = num1 / num2;
        System.out.println("La division de los numeros es: "+divi);
        
        
    }
    
}
