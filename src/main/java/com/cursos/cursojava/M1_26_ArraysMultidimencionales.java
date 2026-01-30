/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.cursojava;

/**
 *
 * @author brandon.delacruz
 */
public class M1_26_ArraysMultidimencionales {
    public static void main(String[] args) {
        //ARRAYS MULTIDIMENSIONALES
        //tAMBIEN LLAMODS, MATRICES MULTIDIMENCIONALES
        System.out.println("********ARRAY Multidimensionales asignado de forma automatica********");
        //Creación y asignación de forma automatica
        
        //Aqui tenemos una matriz de dos dimensiones
        int[][]numeros = {{1,2,3},{4,5,6}};
        
        //Primero debemos indicar la matriz y luego la posición
        System.out.println(numeros[0][2]);
        
        System.out.println("********MOSTRAR ARRAY MULTIDIMENSIONAL CON FOR********");
        for(int i = 0; i<numeros.length;i++){
            System.out.print("\n");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]);
            }
        }
        
        
        System.out.println("********SUMA / RESTA ARRAY MULTIDIMENSIONAL********");
        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matriz2 ={{9,8,7},{6,5,4},{3,2,1}};
        int[][]matrizSuma=new int [3][3];
        int[][]matrizResta=new int[3][3];
        int mayor=matriz1[0][0];
        int menor=matriz1[0][0];
        
        System.out.println("Matriz 1");
        for(int i = 0; i<matriz1.length;i++){
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]+", ");
                if(mayor<matriz1[i][j]){
                    mayor=matriz1[i][j];
                }
                if(menor>matriz1[i][j]){
                    menor=matriz1[i][j];
                }
            }
        System.out.print("\n");
        }
        System.out.println("Numero menor en Matriz 1: "+menor);
        System.out.println("Numero mayor en Matriz 1: "+mayor);
        
        System.out.println("\nMatriz 2");
        for(int i = 0; i<matriz2.length;i++){
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j]+", ");
                if(mayor<matriz2[i][j]){
                    mayor=matriz2[i][j];
                }
                if(menor>matriz2[i][j]){
                    menor=matriz2[i][j];
                }
            }
        System.out.print("\n");
        }
        System.out.println("Numero menor en Matriz 2: "+menor);
        System.out.println("Numero mayor en Matriz 2: "+mayor);
        
        for(int i = 0; i<matriz2.length;i++){
            for (int j = 0; j < matriz2[i].length; j++) {
                matrizSuma[i][j]=matriz1[i][j]+matriz2[i][j];
                matrizResta[i][j]=matriz1[i][j]-matriz2[i][j];                
            }
        }
        System.out.println("\nMatriz Suma");
        menor=matrizSuma[0][0];
        for(int i = 0; i<matrizSuma.length;i++){
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print(matrizSuma[i][j]+", ");
                if(mayor<matrizSuma[i][j]){
                    mayor=matrizSuma[i][j];
                }
                if(menor>matrizSuma[i][j]){
                    menor=matrizSuma[i][j];
                }
            }
        System.out.print("\n");
        }
        System.out.println("Numero menor en Matriz Suma: "+menor);
        System.out.println("Numero mayor en Matriz Suma: "+mayor);
        
        System.out.println("\nMatriz Resta");
        menor=matrizResta[0][0];
        for(int i = 0; i<matrizResta.length;i++){
            for (int j = 0; j < matrizResta[i].length; j++) {
                System.out.print(matrizResta[i][j]+", ");
                if(mayor<matrizResta[i][j]){
                    mayor=matrizResta[i][j];
                }
                if(menor>matrizResta[i][j]){
                    menor=matrizResta[i][j];
                }
            }
        System.out.print("\n");
        }
        System.out.println("Numero menor en Matriz Resta: "+menor);
        System.out.println("Numero mayor en Matriz Resta: "+mayor);
    }
}
