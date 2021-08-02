/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego.gomez
 */
public class ConvTipos {
    public static void main (String rgs[]){
//        //conversion de tipo string a entero y viceversa
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad+1)); // resultado 22
//        var edadString = "22";
//        System.out.println("edadString = " + (edadString+1)); // resultado 221 por que no esta convertido a int
//        //convertir a double
//        var valorPi = Double.parseDouble("3.141622");
//        System.out.println("valorPi = " + valorPi);
        
        // convertir a string
//        var edadText = String.valueOf(25);
//        System.out.println("edadText = " + edadText);
//        
//        //recuperar un caracter
//        var caracter = "Hola".charAt(3);
//        System.out.println(caracter);
//        
//        String color= "morado";
//        System.out.println(color);
//        color = "rojo";
//        

//    var resultado = (3 > 6) ? "condicion a mostrar si es verdadero" : "condicion a mostrar si es falso" ;
//        System.out.println("resultado = " + resultado);

        var x = 5;
        var y = 10;
        var z = ++x + y--; //se incrementa primero x y despues se utiliza la variable, y primero se usa y luego se decrementa
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        //la multipilicacion y la división tienen la misma importancia, se evalua de izquierda a derecha.
        var resultado = 4 + 5 * 6 / 3; 
        /* pasos
        1. 6/2.
        2. 5 * (6/2)
        3. 4 + (5 * (6/2))  
        */
        System.out.println("resultado = " + resultado);
        
        var resultado2 = (4 + 5) * 6 / 3; //sigue teniendo precedencia la division y la multiplicacion pero como el (4+5) estan entre ( ) se debe realizar primero la suma y luego multiplicar
        /*
           (4+5) * 2
            9 * 2
            = 18
        */
        System.out.println("resultado2 = " + resultado2);
    }
    
}
