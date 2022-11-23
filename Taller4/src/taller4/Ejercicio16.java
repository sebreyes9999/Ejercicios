/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import java.util.Scanner;

/**
 *
 * Dada las horas trabajadas por un empleado determinar cuanto gana semanalmente
 * y mensualmente, si el trabajador debe trabajar minimo 38 horas semanales y un
 * maximo de 56 horas. Se debe pedir la cantidad de horas trabajadas y verificar
 * que este dentro del rango permitido, tambien se debe pedir el precio de la hora
 * Imprimir la cantidad de horas trabajadas y el pago
 * 
 * DE: horas trabajadas y su valor
 * DS: cantidad de horas con el pago
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horaSemana;
        int valorHora;
        int horaMensual;
        int precioSemana;
        int precioMensual;
        horaMensual = 0;
        precioSemana = 0;
        precioMensual = 0;
       
        
     Scanner read = new Scanner(System.in);
     System.out.println("Introduzca el numero de horas");
     horaSemana = read.nextInt();
     
     System.out.println("Introducir el valor de la hora");
     valorHora = read.nextInt();
     
     if ((horaSemana>=38) && (horaSemana<=56)) {
        System.out.println("El empleado trabajo en la semana:"+horaSemana);
        horaSemana = horaSemana * 4;
        
        System.out.println("El empleado trabajo en el mes:"+horaMensual);
        horaMensual = horaSemana * 30;
        
        System.out.println("Al empleado le pagaron en la semana:"+precioSemana);
        precioSemana = precioSemana * 4;
        
        System.out.println("Al empleado le pagaron en el mes:"+precioMensual);
        precioMensual = precioSemana * 30;

        
    
     }
    }
    
}
