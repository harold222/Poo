/*
 * Clase recursos humanos donde creare los metodos y atributos del los empleados creados en la clase nomina
 */
package constructor;

/**
 * @author Harold Pedraza
 * @version 15 de noviembre del 2017
 */
public class RecursosHumanos {
    //atributos de la clase
    String civil, sexo;
    int numeroHijos;

    RecursosHumanos(String civil, String sexo, int numeroHijos) {
        //que el empleado estado civil, hombre o mujer, soltero o casado ,si tiene hijos o no
        this.civil = civil;
        this.sexo = sexo;//paso el valor desde el metodo constructor
        this.numeroHijos = numeroHijos;
    }

    void mostrar() {
        System.out.println("* Su estado civil es: " + civil);
        System.out.println("* Su sexo es: " + sexo);//imprimo los datos de las variables que luego seran llenados
        System.out.println("* Posee " + numeroHijos + " hijos");
        System.out.println("------------------------------------------------------");
    }
}
