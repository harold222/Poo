/*
 * Esta clase es la que va a llevar el constructor, con sus atributos 
 * y la invocacion de los mismos
 */
package constructor;
/**
 * 
 * @author Harold Pedraza
 * @version 15 de noviembre del 2017
 */

public class Nomina {
    //crear atributos
    String nombres, apellidos;
    int cedula, salario;
    
    //creando un metodo constructor
    
    Nomina(String nombre, String apellido, int cedula, int salario){
        //inicializando los atributos
        this.nombres = nombre ;
        this.apellidos = apellido;
        this.cedula = cedula ;
        this.salario = salario;
    }
    

    
    void Datos(){
        System.out.println(" ");
        System.out.println("El empleado siguiente es ");
        System.out.println(" ");
        System.out.println("* El nombre del empleado es: "+nombres);
        System.out.println("* El apellido del empleado es: "+apellidos);
        System.out.println("* La cedula del empleado es: "+cedula);
        System.out.println("* El salario del empleado es: "+salario);
    }  
}
