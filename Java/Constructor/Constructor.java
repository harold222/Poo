/*
 *Esta clase crea los objetos a invocar por parte
 *de la clase nomina la cual lleva los atributos del empleado 
 *y su salario
 */

package constructor;

/**
 * @author Harold Pedraza
 * 15 de noviembre de 2017 a las 2:22 pm
 */

public class Constructor {
    
    public static void main(String[] args) {
        //creando mis objetos
        Nomina empleado1 = new Nomina("juan", "alimaña", 300300300, 750000);
        Nomina empleado2 = new Nomina("Cesar", "perez", 107896578, 850000);
        Nomina empleado3 = new Nomina("Alberto", "cesares", 185755521, 900000);
        Nomina empleado4 = new Nomina("anna", "pedraza", 35897421, 1000000);
        Nomina empleado5 = new Nomina("Camilo", "suarez", 278541000, 50000);
        //referencia a la otra clase con sus objetos
        RecursosHumanos primero = new RecursosHumanos("casado", "masculino", 2);//paso los valores de los atributos
        RecursosHumanos segundo = new RecursosHumanos("casado", "masculino", 5);
        RecursosHumanos tercero = new RecursosHumanos("soltero", "masculino", 1);
        RecursosHumanos cuarto = new RecursosHumanos("casado", "femenino", 0);
        RecursosHumanos quinto = new RecursosHumanos("soltero", "masculino", 3);
        
        empleado1.Datos();//imprimo el metodos creados
        primero.mostrar();//metodo creado en la clase recursos humanos
        empleado2.Datos();
        segundo.mostrar();
        empleado3.Datos();
        tercero.mostrar();
        empleado4.Datos();
        cuarto.mostrar();
        empleado5.Datos();
        quinto.mostrar();
    }
}
