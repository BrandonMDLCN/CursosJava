/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.cursojava;

/**
 *
 * @author brandon.delacruz
 */
public class M1_15_CaracteresEspeciales {
    public static void main(String[] args) {
        //MOSTRAR CARACTERES ESPECIALES
        //Para mostrar texto, es necesario usar comillas, pero como se muestran 
        //estas comillas
        
        //Esto nos generaria un error, si lo hacemos de forma conencional, por ejemplo
        //Strign oracion = "Hola a "todos"";
        
        //Utilizaremos el contra slash \ par mostar los caracteres especiales
        
        //Comillas dobles 
        System.out.println("**********Comillas Dobles**********");
        String oracion="Hola a \"Todos\"";
        System.out.println(oracion);
        
        //Comillas simples 
        System.out.println("**********Comillas Simples**********");
        String oracion2="Hola a \'Todos\'";
        System.out.println(oracion2);
    }
}
