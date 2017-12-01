/*
 *Esta clase la creo para explicar como usar los metodos en java
 */

package metodos;

/**
 * @author Harold Pedraza
 * @version 18/10/2017
 */

public class Barcos {
    
    /*
    Para comenzar creamos esta clase para crear los metodos que utilizaran los barcos encender, frenar, acelerar y apagarse
    los hacemos de tipo void o vacio ya que no necesitamos que nos retorne nada, solo queremos que nos muestre que actividad
    esta realizando el barco deseado.
    */
    void arrancarBarco (){//funcion tipo void que no retorna nada
        System.out.println("* Arrancar el barco");//Actividad que esta realizando
    }
    
    void prenderBarco (){
        System.out.println("* Prender el barco y prenden los motores");//Actividad que realiza
    }
    
    void acelerarBarco (){
        System.out.println("* Acelerar el barco");
    }
    
    void frenarBarco (){
        System.out.println("* Frenar el barco");
    }
    
    void apagarBarco (){
        System.out.println("* Apagar el barco");
    }
    
    /*
    En esta parte se podia de otras maneras como que no tuviera parametros y que mostrara solo el mensaje= el color es y este se le
    concatenaria la variable de la otra clase; En este caso eh creado las funciones con parametro ya que me parece que se ve mejor organizado
    el parametro que reciben estas funciones seran las variables que creamos en la clase main y en estas funciones solo me imprime ese parametro
    tambien se puede que las funciones me retornen un valor en eeste caso que retornen String y int y retorno el parametro creado. 
    */
    void color (String color){//parametro que me llegara desde la clase main
        System.out.println(color);//imprimo el parametro para que me aparezca en forma de mensaje en la clse main
    }
    
    void marca (String marca){ 
        System.out.println(marca);
    }
    
    void precio (int precio){
        System.out.println(precio);
    }
    
    void modelo(int modelo){
        System.out.println(modelo);
    }
}
