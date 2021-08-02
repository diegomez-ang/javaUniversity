
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        //crear objetos
        //el tipo debe ser igual al nombre de la clase
        Persona persona1, persona2;
      
        
        //persona1 hace parte de la clase persona, es como si fuera una variable
        // se toma la variable y se usa la palabra new para agregar a la clase Persona()
        persona1 = new Persona(); //con esa linea se accede a los atributos
        persona1.nombre = "Katherine"; // con el . (punto) se accede a los atributos de la clase lamado nombre
        persona1.apellido =  "Mayorga";
        persona1.Informacion();
        System.out.println("persona1= " + persona1);
        persona2 = new Persona();
        persona2.nombre = "Diego";
        persona2.apellido = "Gómez";
        persona2.Informacion();
      
        
    }
    
}
