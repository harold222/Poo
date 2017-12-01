/*
 * Esta clase lleva los metodos que accionan el Barco
 */
package fundamentospoo;

/**
 * @author Harold Pedraza
 * @version 25/10/2017
 */
public class Barcos {

    /*
    Variables no necesarias ya que cada atributo posee su parametro el cual se imprimira en el metodo main
    String marca, modelo, color;
    Double precio;
    */
    
    void prenderBarco(String marca, String modelo, String color, double precio) {//metodo vacio que posee cuatro parametros el cual se dara desde el metodo main
        System.out.println("* El barco de marca "+marca+" de modelo "+modelo+ " con el color "+color+ " posee un precio de $"+precio+" este se esta prendiendo.");//concateno la variable con el valor dado
    }

    void arrancarBarco(String marca, String modelo, String color, int precio) {
        System.out.println("* El barco de marca "+marca+" de modelo "+modelo+ " con el color "+color+ " posee un precio de $"+precio+" este se esta arrancando.");
    }
    
    void frenarBarco (String marca, String modelo, String color, int precio){
        System.out.println("* El barco de marca "+marca+" de modelo "+modelo+ " con el color "+color+ " posee un precio de $"+precio+" este se esta frenando.");
    }
    
    void acelerarBarco(String marca, String modelo, String color, int precio) {
        System.out.println("* El barco de marca "+marca+" de modelo "+modelo+ " con el color "+color+ " posee un precio de $"+precio+" este se esta acelaerando.");
    }

    void apagarBarco(String marca, String modelo, String color, int precio) {
        System.out.println("* El barco de marca "+marca+" de modelo "+modelo+ " con el color "+color+ " posee un precio de $"+precio+" este se esta apagando.");
    }
}
