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
public class Ejercicio3 {
    
    public static void main(String[] args) {
    
        int numer;
        
        System.out.println("Definir si es par o impar");
        Scanner parimp = new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        numer = parimp.nextInt();
        
        if(numer % 2 == 0 ){
            
            System.out.println(numer+ "es par");
        
        }else{
            
            System.out.println(numer+ " es impar");
        
        }
    
    }
    
}
