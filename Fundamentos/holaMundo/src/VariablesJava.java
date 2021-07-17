
import java.util.Scanner;

/**
 *
 * @author diego.gomez
 */


public class VariablesJava {
    public static void main (String args[ ]){
       /*
        //las variables inician su nombre con minuscula las clases con mayuscula
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //las variables solo se pueden declarar una vez, pero puede cambiar su valor durante la ejecución
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        //sout + tab genera la linea de imprimir;
        
        String miVariableString = "Diego Gómez Angarita";
        //ctrl + espacio muestra variables creadas
        System.out.println(miVariableString);
        
        miVariableString = "Chao putos";
        System.out.println(miVariableString);
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableString2 ="String";
        System.out.println("miVariableString2 = " + miVariableString2);
        
        //Concatenacion 
      var variable1 = "Diego Alejandro ";
        var variable2 = "Gómez Angarita";
        var nombreCompleto = variable1 + variable2;
        System.out.println("nombreCompleto = " + nombreCompleto);
        System.out.println(nombreCompleto);
       
        var i = 3;
        var j = 5;
        System.out.println( i + j); // se suman los datos numericos
        System.out.println(i + j + variable1); //opera los valores que tengan el mismo tipo de datos
        //por el contrario si se pone una variable de tipo string primero va a tomar todo como si fuera una variable string (contexto cadena)
        System.out.println(variable1 +i + j );
        //si se ponen parentesis realizara la operacion 
        System.out.println(variable1 +(i + j) );*/
       /*
       var nombre = "Chica cafeteria";
       
       //salto de linea -> \n
        System.out.println("nueva linea: \n" + nombre);
        //tabulador -> \t
        System.out.println("Tabulador \t" + nombre);
        // retroceso -> \b
        System.out.println("Retroceso: \b\b" + nombre);
        //comilla simple -> \' no simpre es necesrario usar el \
        System.out.println("Comilla simple : \'" + nombre + " \' ");
        //comilla doble \" es obligatorio usar el "
        System.out.println("Comilla doble : \" " + nombre + " \" ");
        */
       /*
        System.out.println("Ingrese su nombre: ");
        Scanner consola = new Scanner (System.in);
        var usuario = consola.nextLine();
        System.out.println("Ingrese su titulo");
        var titulo = consola.nextLine();
        System.out.println("el nombre es: " + usuario + " y el titulo es: " + titulo);
       */
        System.out.println("ingresa el titulo del libro");
        Scanner consola = new Scanner (System.in);
        var titulo = consola.nextLine();
        System.out.println("Ingresa el autor");
        var autor = consola.nextLine();
        System.out.println(titulo + " Fue escrito por: " + autor);
       
    }
    
}
