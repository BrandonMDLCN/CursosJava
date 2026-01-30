/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.cursojava;

import java.util.Scanner;

/**
 *
 * @author brandon.delacruz
 */
public class M1_20_1_EscaleraDeAsteriscosFOR {
    public static void main(String[] args) {
       /*
       ESCALERA DE ASTERISCOS ASCENDENTES

       *
       **
       ***
       ****
       *****
       */
       Scanner entrada = new Scanner(System.in);

       int numeroLimite;
        System.out.println("Ingresar el limite de la escalera ascendente");
        numeroLimite = entrada.nextInt();
        System.out.println("___________________");
        for (int numerosAsteriscos = 1; numerosAsteriscos <= numeroLimite; numerosAsteriscos++) {
            //Este bucle pinta los asteriscos en cada fila
            for (int i = 0; i < numerosAsteriscos; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        /*
           ESCALERA DE ASTERISCOS DECENDENTE

           *****
            ****
            ***
            **
            *
        */
        System.out.println("___________________");
        //For para los escalones
        for (int numerosAsteriscos = numeroLimite; numerosAsteriscos > 0; numerosAsteriscos--) {
            //Este bucle pinta los asteriscos en cada fila
            for (int i = numerosAsteriscos; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Piramides de asteriscos
        /*
          *
         ***
        *****
        */
        
        //Piramide Ascendente
        System.out.println("___________________");
        //For para los pisos
        for (int altura = 1; altura <= numeroLimite; altura++) {
            //Espacios en blanco
            for (int blancos = 1; blancos <= numeroLimite-altura; blancos++) {
                System.out.print(" ");
            }
            
            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (altura*2)-1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Piramides de asteriscos decendiente
        /*
        *****
         ***
          *
        */
        
        //Piramide Decendiente
        System.out.println("___________________");
        //For para los pisos
        for (int altura = numeroLimite; altura >= 0; altura--) {
            //Espacios en blanco
            for (int blancos = 1; blancos <= numeroLimite-altura; blancos++) {
                System.out.print(" ");
            }
            
            //Asteriscos
            for (int asteriscos = 1; asteriscos <= (altura*2)-1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Cuadrilatero de asteriscos
        /*
        ***     ****
        ***     ****
                ****
        */
        int altura=3;
        int ancho=5;
        for (int h = 1; h <= altura; h++) {
            for (int base = 1; base <= ancho; base++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
