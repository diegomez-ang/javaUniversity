
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
public class NumeroMayor {
    public static void main(String args []){
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número:");
        int numero1 = Integer.parseInt(lectura.nextLine());
        System.out.println("Ingresa el segundo número: ");
        int numero2 = Integer.parseInt(lectura.nextLine());
        
        if (numero1 > numero2)
            System.out.println("El numero: " + numero1 + " es mayor");
        else
            System.out.println("El numero: " + numero2 + " es   mayor");
    }
}
