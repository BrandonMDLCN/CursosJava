/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.cursojava;

/**
 *
 * @author brandon.delacruz
 */
public class M1_25_0_ArraysUnidimensionales {
    public static void main(String[] args) {
        //ARRAYS
        /*
        Tambien llamadas, matrices, arreglos o vectores. Nos sirven
        para almacenar múltiples datos en una sola variable
        */
        
        //Creación y asignación de forma automática
        System.out.println("***********ARRAY ASIGNADO DE FORMA AUTOATICA***********");
        //Array de cadenas de textos
        String[] frutas = {"Naranjas","Manzanas","Fresas"};
        System.out.println(frutas[1]);
        
        System.out.println("***********ARRAY ASIGNADO DE FORMA MANUAL***********");
        //Creación y asignación manual
        String[] autos = new String[4];
        autos[0]="Toyota";
        autos[1]="Subaru";
        autos[2]="Mazda";
        autos[3]="Mitsubishi";
        System.out.println(autos[2]);
        
        System.out.println("***********CAMBIAR UN ELEMENTO DE UN ARRAY***********");
        //Cambiar un elemento de un array
        //Vamos a cambiar el tercer elemento del array carro
        autos[2]="Suzuki";
        System.out.println(autos[2]);
        
        System.out.println("***********LONGITUD DE UN ARRAY***********");   
        //Haller la longitud del array autos
        System.out.println(autos.length);
        
        System.out.println("***********MOSTRAR ELEMENTOS DE UN ARRAY***********");   
        //Existen muchas formas para mostrar un elemento de un array, veamos cuales son
        System.out.println("****Mostrar elementos de un array con for****");
        String[] colores ={"Azul","Amarillo","Celeste","Verde"};
        System.out.println("***Mostar en forma vertical***");
        for (int i = 0; i < colores.length; i++) {
            System.out.println(colores[i]);            
        }
        System.out.println("***Mostar en forma horizontal***");
        for (int i = 0; i < colores.length; i++) {
            System.out.print(colores[i]+" ");            
        }
        
        System.out.println("\n****Mostrar elementos de un array con For Each****");
        for(String i:colores){
            System.out.println(i);
        }
        
        //Mayor y menor número de un array
        int[] vector = {5,6,25,3,2,6,1,90};
        int mayor = vector[0];
        int menor = vector[0];
        
        System.out.println("*****Vector*****");
        for(int i = 0; i<vector.length;i++){
            System.out.println(vector[i]);
        }
        System.out.println("*****VECTORES RESULTANTES*****");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>mayor){
                mayor=vector[i];
            }
            if(vector[i]<menor){
                menor=vector[i];
            }
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
        
    }
}
