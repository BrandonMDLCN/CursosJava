/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursos.cursojava;

/**
 *
 * @author brandon.delacruz
 */
public class M1_14_MetodosMatematicos {
    public static void main(String[] args) {
        //Principales metodos matematicos
        
        //Metodo del Numero Mayor
        int numero1=10;
        int numero2=18;
        System.out.println("************METODO DEL NUMERO MAYOR************");
        System.out.println("El mayor entre: "+numero1 +" y "+numero2+" es: "+Math.max(numero1, numero2));
        
        //Metodo del Numero Menor
        int numero3=10;
        int numero4=18;
        System.out.println("************METODO DEL NUMERO MENOR************");
        System.out.println("El menor entre: "+numero3 +" y "+numero4+" es: "+Math.min(numero1, numero2));
        
        //Metodo para la raiz cuadrada
        int numeroParaRaizCuadrada=64;
        System.out.println("************METODO PARA RAIZ CUADRADA************");
        System.out.println("La raiz cuadrada de: "+numeroParaRaizCuadrada +" es: "+Math.sqrt(numeroParaRaizCuadrada));

        //Metodo para la raiz cubica
        int numeroParaRaizCubica=64;
        System.out.println("************METODO PARA RAIZ CUBICA************");
        System.out.println("La raiz cubica de: "+numeroParaRaizCubica +" es: "+Math.cbrt(numeroParaRaizCuadrada));
        
        //Metodo para el valor absoluto
        int numeroParaValorAbsoluto = -15;
        System.out.println("************METODO PARA VALOR ABSOLUTO************");
        System.out.println("El valor absoluto de: "+numeroParaValorAbsoluto+" es "+Math.abs(numeroParaValorAbsoluto));
        
        //Metodo para redondear
        double numeroParaRedondear = 12.3;
        System.out.println("************METODO PARA REDODEAR************");
        System.out.println("Valor sin redondear: "+numeroParaRedondear);
        System.out.println("Valor redondeado:" +Math.round(numeroParaRedondear));
        
        //Metodo para la potencia
        double numeroParaPotencia=5;
        System.out.println("************METODO PARA POTENCIA************");
        System.out.println("Valor sin procesar: "+numeroParaPotencia);
        System.out.println("Valor procesado:" +Math.pow(numeroParaPotencia,3));
        
        //Metodo para hallar el Sgino
        //Devuelve 0 si es cero, si es positivo 1 y si es negativo -1
        double numeroParaSigno=-5;
        double numeroParaSigno2=5;
        double numeroParaSigno3=0;
        
        System.out.println("************METODO PARA HALLAR EL SIGNO************");
        System.out.println("Valor sin procesar: "+numeroParaSigno);
        System.out.println("Valor procesado:" +Math.signum(numeroParaSigno));
        System.out.println("Valor sin procesar: "+numeroParaSigno2);        
        System.out.println("Valor procesado:" +Math.signum(numeroParaSigno2));
        System.out.println("Valor sin procesar: "+numeroParaSigno3);
        System.out.println("Valor procesado:" +Math.signum(numeroParaSigno3));
        
        //Metodo para hallar el valor maximo de un numero
        double numeroParaHallarMaximoValor =10.3;
        System.out.println("************METODO PARA HALLAR EL MAXIMO NUMERO************");
        System.out.println("Valor sin procesar: "+numeroParaHallarMaximoValor);
        System.out.println("Valor procesado:" +Math.ceil(numeroParaHallarMaximoValor));
        
        //Metodo para copiar el signo de un numero
        double numeroParaCopiarSigno=-10;
        double numeroParaCopiarSigno2=25;
        System.out.println("************METODO PARA COPIAR EL SIGNO************");
        System.out.println("Valor 1: "+numeroParaCopiarSigno);
        System.out.println("Valor 2: "+numeroParaCopiarSigno2);
        System.out.println("Resultado:" +Math.copySign(numeroParaCopiarSigno,numeroParaCopiarSigno2));
        
        //Metodo para redondear hacia abajo un número
        double numeroParaRedondearAbajo =10.56;
        System.out.println("************METODO PARA REDONDEAR HACIA ABAJO************");
        System.out.println("Valor sin procesar: "+numeroParaRedondearAbajo);
        System.out.println("Valor procesado:" +Math.floor(numeroParaRedondearAbajo));
        
        //Metodo para redondear al numero entero matematico mas cercano
        double numeroParaValorEnteroMatematico = 9.56;
        System.out.println("************METODO PARA REDONDEAR ENTERO MATEMATICO************");
        System.out.println("Valor sin procesar: "+numeroParaValorEnteroMatematico);
        System.out.println("Valor procesado:" +Math.rint(numeroParaValorEnteroMatematico));
        
        //Metodos para valores aleatorios
        //El metodo random nos mostrará valores entre 0.0 y 1.0
        System.out.println("************METODO PARA VALORES ALEATORIOS************");
        System.out.println("Valor aleatorio convencional: "+Math.random());
        
        //Numero aleatorios en un rango determinado de numeros
        //Numeros aleatorios entre 7 y 10
        
        int numeroInferior=7;
        int numeroSuperior=10;
        int numeroAleatorio;
        numeroAleatorio=(int)(Math.random()*((numeroSuperior+1)-(numeroInferior)+numeroInferior));
        System.out.println("Valor aleatorio entre: "+numeroInferior+" y "+numeroSuperior+" : "+numeroAleatorio);
        
        //Metodo para hallar la hipotenusa
        //H^2 = X^2 + Y^2
        double numeroX=8;
        double numeroY=6;
        System.out.println("************METODO PARA HALLAR LA HIPOTENUSA************");
        System.out.println("Valor de X: "+numeroX);
        System.out.println("Valor de Y: "+numeroY);
        System.out.println("Hipotenusa: "+Math.hypot(numeroX, numeroY));
        
        //Metodo para obtener el resto o residuo de una division
        int numeroDivision1=38;
        int numeroDivision2=12;
        System.out.println("************METODO PARA OBTENER RESIDUO O RESTO DE UNA DIVISION************");
        System.out.println("Valor 1 a dividir: "+numeroDivision1);
        System.out.println("Valor 2 a dividir: "+numeroDivision2);
        System.out.println("Residuo: "+Math.IEEEremainder(numeroDivision1, numeroDivision2));
        
        //Metodo logaritmico
        double numeroLogaritmoNatural=38.5;
        System.out.println("************METODO PARA OBTENER LOGARITMO NATURAL************");
        System.out.println("Valor del numero: "+numeroLogaritmoNatural);
        System.out.println("Logaritmo natural: "+Math.log(numeroLogaritmoNatural));
        

    }
}
