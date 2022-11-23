/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import java.util.Scanner;

/**
 * Realizar un programa que calcule el valor a pagar por algunos galones de 
 * gasolina si sabemos que cada litro de gasolina vale 9.500. Imprimir la cantidad
 * de galones, precio por galon, cantidad de litros y precio a pagar.
 * DE: Cantidad de galones de gasolina.
 * DS: Cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float cantiGalon;
        float preciGalon;
        float litro;
        float totalPrecio;
        
        
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca numero de galones");
        cantiGalon = read.nextFloat();
        
        litro = (float) (cantiGalon * 3.78);
        preciGalon = litro * 9500;
        totalPrecio = (float) (9500 / 0.26);
        
        System.out.println("La cantidad de galones es:"+cantiGalon);
        System.out.println("El precio por galon es:"+preciGalon);
        System.out.println("La cantidad de litros es:"+litro);
        System.out.println("El precio total a pagar es:"+totalPrecio);
        
    }
    
}
