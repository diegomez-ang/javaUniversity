/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego.gomez
 */
public class SentenciasDeControl {

    public static void main(String args[]) {
//        var condicion = true;
//        
//        if (condicion == false){ // no es necesario en el caso de que sea true, se puede dejar solo 'condicion'
//            System.out.println("condicion verdadera");
//        }
//        else{
//            System.out.println("condicion falsa");
//        }
//        var mes = 6;
//
//        if (mes == 1 || mes == 2 || mes == 12) {
//            System.out.println("Invierno");
//        } else if (mes == 3 || mes == 4 || mes == 5) {
//            System.out.println("Primavera");
//        } else if (mes == 6 || mes == 7 || mes == 8) {
//            System.out.println("Verano");
//        } else if (mes == 9 || mes == 10 || mes == 11) {
//            System.out.println("Otoño");
//        }
//

        var numero = 7;
        var numeroTexto = "Valor desconocido";
        
        numeroTexto = switch (numero) {
            case 1 -> "numero uno";
            case 2 -> "numero Dos";
            case 3 -> "numero Tres";
            case 4 -> "numero cuatro";
            default -> "Caso invalido";
        };
        System.out.println("numeroTexto = " + numeroTexto);

 }

    

}
