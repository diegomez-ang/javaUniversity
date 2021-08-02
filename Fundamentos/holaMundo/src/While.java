/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego.gomez
 */
public class While {

    public static void main(String args[]) {
//        var contador = 0;
//        
//        while(contador < 3){
//            System.out.println("contador = " + contador);
//            contador ++;
//        }
//        var contador2 = 5;
//        do{
//            System.out.println("contador2 = " + contador2);
//            contador2 ++ ;
//        }while(contador2 < 3);

        /*  
        for(int i=0; i<10;i++){
            System.out.println("i = " + i);
        }
        System.out.println("Fin del Programa");
         */
//      for(int i = 0; i<10; i++){
//          if(i % 2 == 0){
//              System.out.println("El numero " + i + " es par" );
//              break; //Rompe el ciclo una vez que encuentre una coincidencia.
//          }
//      }
inicio: // etiqueta
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                
                continue inicio; // se coloca despues de la palabra continue y corresponde al nombre de la etiqueta.
            }System.out.println("El numero " + i + " es par");
        }
    }

}
