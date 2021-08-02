
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego.gomez
 */
public class TareaPerimetro {
    public static void main(String args[]){
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Proporciona el alto");
        int alto = Integer.parseInt(lectura.nextLine());
        System.out.println("Proporciona el ancho");
        int ancho = Integer.parseInt(lectura.nextLine());
        int area = alto * ancho;
        int perimetro = (alto * ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        
    }
    
}
