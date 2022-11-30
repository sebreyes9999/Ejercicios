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
public class Ejercicio14 {
    
    public static void main(String[] args){
        
        double gradosFah;
        double gradosCen;
        int opcion;
        
        System.out.println("Pasar de grados Centigrados a Fahrenheit o de Fahrenheit a Centigrados");
        
        Scanner grados = new Scanner(System.in);
        System.out.println("Escribir 1 para pasar de Cen a Fah o escribir 2 para pasar de Fah a Cen: ");
        opcion = grados.nextInt();
        
        if(opcion == 1 ){
            
            System.out.println(" Cantidad de Cen a conventir a Fah");
            gradosCen = grados.nextInt();
            gradosFah = (gradosCen * 1.8);
            System.out.println(gradosCen + "Cen equivalen a " + gradosFah + "Fah");
            
        
        }else if(opcion == 2 ){
            
            System.out.println(" Cantidad de Fah a conventir a Cen");
            gradosFah = grados.nextInt();
            gradosCen = (gradosFah - 32)* 5/9;
            System.out.println(gradosFah + " Fah equivalen a " + gradosCen + " Cen");
        
        }
    }
    
}
