/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego.gomez
 */
public class TareaCalificaciones {
    public static void main(String args[]){
        var calificacion = 2;
        
        if(calificacion >= 9 ){
            System.out.println("A");
        }
        else if(calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }
        else if(calificacion >= 7 && calificacion <8){
            System.out.println("C");
        }
        else if(calificacion >= 6 && calificacion <7){
            System.out.println("D");
        }
        else if (calificacion < 6){
            System.out.println("D");
        }
        else{
            System.out.println("error");
        }
    }
}
