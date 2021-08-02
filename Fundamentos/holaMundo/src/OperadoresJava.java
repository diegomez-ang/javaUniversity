/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego.gomez
 */
public class OperadoresJava {
    public static void main(String args[]){
//        float a= 3, b =2;
//        //con var no se puede declarar varios elementos en una sola linea, toca por separado.
//        float resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//        
//        resultado = a-b;
//        System.out.println("resultado resta = " + resultado);
//        
//        resultado = a*b;
//        System.out.println("resultado multiplicación = " + resultado );
//        
//        //importante que todo sea flotante si no lo es el sistema no tomara decimales
//        resultado = a / b;
//        System.out.println("resultado division = " + resultado );
//        
//        resultado = a % b;
//        System.out.println("resultado modulo = " + resultado );
            var a = 3;
            var b = -a;
            System.out.println("b = " + b);
            System.out.println("a = " + a); //cambia el signo de la variable
            
            var c = true;
            var d = !c; // aplica solo para boleanos
            System.out.println("c = " + c); // true
            System.out.println("d = " + d);// false
            
            //unitariode incremento
            //1 - preincremento, lo tiene antes de la variable.
            
            var e = 3;
            var f = ++e; //primero se incrementa y luego usa su valor
            System.out.println("e = " + e);
            System.out.println("f = " + f);
            
            //2 - postincremento operador despues de la variable
            
            var g = 5;
            var h = g++; //primero se usa el valor de la variable y luego se incrementa
            System.out.println("g = " + g); //6 primero lo incrementa y luego lo muestra
            System.out.println("h = " + h);// 5
            
            // **** funciona igual para el decremento ****
            
            var i = 2;
            var j = --i;
            System.out.println("i = " + i);
            System.out.println("j = " + j);
      
    }
    
}
