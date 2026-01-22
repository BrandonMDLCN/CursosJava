package com.cursos.cursojava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brandon.delacruz
 */
public class MetodosCadenasDeTexto {
    public static void main(String[] args) {
        //Mostar la subcadena en un determinado rango
        System.out.println("*****DETERMINAR EL CONTENIDO DE UN TEXTO EN UN RANGO*****");
        String textoRango = "Curso de Java desde Cero";
        System.out.println("Texto procesado: "+textoRango);
        System.out.println("Resultado: "+textoRango.substring(2, 8));
        
        //Determinar si el incio de un texto coincide con el valor ingresado
        System.out.println("*****DETERMINAR SI EL INICIO DEL TEXTO COINCIDE CON OTRO TEXTO*****");
        String textoConicdeInicio = "Curso de Java desde Cero";
        System.out.println("Resultado: "+textoConicdeInicio.startsWith("Curso"));
        
        //Determinar si el final de un texto coincide con el valor ingresado
        System.out.println("*****DETERMINAR SI EL FINAL DEL TEXTO COINCIDE CON OTRO TEXTO*****");
        String textoConicdeFinal = "Curso de Java desde Cero";
        System.out.println("Resultado: "+textoConicdeFinal.endsWith("ro"));

        //Determinar si dos cadenas de texto son iguales, es sensible conminusculas y mayusculas
        System.out.println("*****DETERMINAR DOS TEXTOS SON EXACTAMENTE IGUALES*****");
        String textoComparar1="Java";
        String textoComparar2="Java";
        
        System.out.println("Texto procesado 1: "+textoComparar1);
        System.out.println("Texto procesado 1: "+textoComparar2);
        System.out.println("Resultado: "+textoComparar1.equals(textoComparar2));
        
        //Determinar si dos cadenas de texto son iguales sin importar minusculas o minusculas
        System.out.println("*****DETERMINAR DOS TEXTOS SON EXACTAMENTE IGUALES sin importar minusculas o minusculas*****");
        String textoComparar3="JAVa";
        String textoComparar4="javA";
        System.out.println("Texto procesado 1: "+textoComparar3);
        System.out.println("Texto procesado 1: "+textoComparar4);
        System.out.println("Resultado: "+textoComparar3.equalsIgnoreCase(textoComparar4));
        
        //Eliminar espacios en blanco de una cadena de texto (EXTREMOS)
        System.out.println("*****ELIMINAR ESPACIOS EN BLANCO DE LOS EXTREMOS DE UNA CADENA DE TEXTO*****");
        String textoConEspacios = "  Beinvenidos al curso de java     ";
        System.out.println("Texto procesado: "+textoConEspacios);
        System.out.println("Resultado: "+textoConEspacios.trim());
        
        //Reemplazar un caracter por otro
        System.out.println("*****REMPLAZAR UN CARACTER ESPECIFICO DE UN TEXTO*****");
        String textoParaReemplazar = "Bienvenido al curso de java";
        System.out.println("Texto procesado: "+textoParaReemplazar);
        System.out.println("Resultado: "+textoParaReemplazar.replace("a", "o"));
        
        //Transformar diferentes tipos de datos en cadenas de texto
        System.out.println("*****CONVERTIR CADENAS DE TETO A DIFERENTES TIPOS DE DATOS*****");
        int numeroEntero=15;
        double numeroDouble = 15.6;
        float numeroFloat=10.8f;
        boolean valorBoolean=false;
        
        System.out.println("Numero entero: "+numeroEntero);
        System.out.println("Numero double: "+numeroDouble);
        System.out.println("Numero float: "+numeroFloat);
        System.out.println("Numero boolean: "+valorBoolean);
        
        System.out.println("************************");
        System.out.println("*************Resultados convertidos*************");
        System.out.println("Resultado Numero Entero: "+String.valueOf(numeroEntero));
        System.out.println("Resultado Numero Douable: "+String.valueOf(numeroDouble));
        System.out.println("Resultado Numero Float: "+String.valueOf(numeroFloat));
        System.out.println("Resultado Valor Boolean: "+String.valueOf(valorBoolean));


    }
}
