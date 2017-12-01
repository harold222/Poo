/*
 * Esta clase es la que va a llevar el constructor, con sus atributos 
 * y la invocacion de los mismos
 */
package obteneryasignar;
/**
 * 
 * @author Harold Pedraza
 * @version 16 de noviembre del 2017
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
        System.out.println("El empleado es ");
        System.out.println(" ");
        System.out.println("* El nombre del empleado es: "+nombres);
        System.out.println("* El apellido del empleado es: "+apellidos);
        System.out.println("* La cedula del empleado es: "+cedula);
        System.out.println("* El salario del empleado es: "+salario);
    }
    
    String getnombres(){
        return this.nombres; 
    }
    
    String getapellidos(){
        return this.apellidos;
    }
    
    int getcedula(){
        return this.cedula;
    }
    
    int getsalario(){
        return this.salario;
    }
    
    //metodos set
    void setnombres(String NOM){
        this.nombres = NOM;
    }
    
    void setapellidos(String APE){
        this.apellidos = APE;
    }
    
    void setcedula(int CEDU){
        this.cedula = CEDU;
    }
    
    void setsalario(int SALA){
        this.salario = SALA;
    }
}

