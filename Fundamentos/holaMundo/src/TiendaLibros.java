
import java.util.Scanner;

/**
 *
 * @author diego.gomez
 */
public class TiendaLibros {
    public static void main (String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Proporciona el ID: ");
        int id = Integer.parseInt(consola.nextLine()) ;
        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Envio gratuito");
        boolean envioGratuito = consola.nextBoolean();
        
        System.out.println(nombre + " #  " +  id);
        System.out.println("precio: $ "+ precio);
        System.out.println("Envio gratuito: "+ envioGratuito);
    }
    
}
