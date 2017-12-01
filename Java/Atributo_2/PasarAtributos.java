/*
 *Estte proyecto es para aprender a pasar atributos a los objetos atravez de los metodos 
 *que se creen en la clase Barcos, creado por Harold Pedraza el dia 25/10/2017
 */
package fundamentospoo;

/**
 * @author Harold Pedraza
 * @version 25/10/2017
 */

public class PasarAtributos {

    public static void main(String[] args) {
       //aqui crearemos nuestras instancias o objetos  
        System.out.println("Bienvenido..!");
        System.out.println(" ");
        System.out.println("----------------------------------------");
        System.out.println("Primer Barco: ");
        //creacion de los constructores
        Barcos primerBarco = new Barcos();
        primerBarco.prenderBarco("Nautic","2017", "Rojo", 1500000);
        primerBarco.arrancarBarco("Ninco", "2005", "blanco", 350000);
        primerBarco.acelerarBarco("Honda", "2003", "dorado", 220000);
        primerBarco.frenarBarco("spice", "2001", "verde", 1800000);
        primerBarco.apagarBarco("old", "2006", "plata", 12500000);
        //4 atributos para 5 objetos Harold_pedraza_primer_punto_parcial_segundo_corte_18163
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Segundo Barco:");
        Barcos segundoBarco = new Barcos();//segundo conscructor
        segundoBarco.prenderBarco("spice", "2003", "negro", 0);
        segundoBarco.arrancarBarco("BMW", "2017", "Verde", 4500000);
        segundoBarco.acelerarBarco("nautic", "2008", "naranja", 820000);
        segundoBarco.frenarBarco("capelli", "2009", "azul", 650400);
        segundoBarco.apagarBarco("geleon", "2016", "azulado", 785000);
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Tercer Barco: ");
        Barcos tercerBarco = new Barcos();
        tercerBarco.prenderBarco("Le boat","2008","",1540000);
        tercerBarco.arrancarBarco("ford","2013","blanco",189000);//parametros utilizados para cada metodo
        tercerBarco.acelerarBarco("Le boat", "2010","gris", 380000);
        tercerBarco.frenarBarco("nautic","2005","cafe",1350020);
        tercerBarco.apagarBarco("valli","1999","negro",4950000);
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.println("Cuarto Barco: ");
        Barcos cuartoBarco = new Barcos();
        cuartoBarco.prenderBarco("Astromar","2007","negro",1000000);
        cuartoBarco.arrancarBarco("nautic","2013","blanco",1540000);
        cuartoBarco.acelerarBarco("valli","2005","azul",1900000);
        cuartoBarco.frenarBarco("Astromar", "2015", "negro", 1805000);
        cuartoBarco.apagarBarco("leboat","2016","cafe", 45000000);
        System.out.println("----------------------------------------");
    }  
}
