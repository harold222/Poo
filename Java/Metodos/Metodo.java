/*Programa hecho por Harold Esteban Pedraza tercer programa documentado para fundamento poo, hecho en netbeans el dia 18/10/2017 hora 21:30 pm
 *Este ejercisio tiene como proposito crear acciones de las clases
 *que finalmente puede hacer todos los objetos de la clase
 */
package metodos;

/**Declaracion de la clase Metodo
 * @author Harold Pedraza
 * @version 18/10/2017
 */

public class Metodo {

    public static void main(String[] args) {
        /*
        Crear objetos para usar los metodos que estan en la clase barcos
        Primeramente para poder utilizar los atributos y metodos en conjunto, en este caso debemos crear variables de atributos de los barcos
        en este caso color, marca, precio y modelo y cada uno de ellas cambia los valores independientemente de cuantos barcos requiera
        */
        String color1= "Blanco", color2 ="negro", color3 = "azul", color4 = "verde";
        String marca1= "nautic", marca2 = "nau", marca3 = "blue", marca4 = "stack";
        int precio1 = 10000, precio2 = 15000, precio3 = 75000, precio4 = 80000;//ATRIBUTOS DE LOS BARCOS CREADOS
        int modelo1 = 2017, modelo2 = 2010, modelo3 = 2007, modelo4 = 2000;
        /*
        Con las variables ya creadas eh inicializadas, solo falta agrupar cada una de estas a el barco que deseemos
        Luego creamos constructores en este caso necesito los atributos de cuatro barcos entonces necesito igualmente cuatro constructores
        que me premitan abrir lo creado en la clase Barcos
        */
        Barcos primerBarco = new Barcos();
        System.out.println("Bienvenido...!");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Primer Barco = ");
        System.out.println(" ");
        System.out.print("El barco de marca ");
        primerBarco.marca(marca1);//En esta parte ya que en las funciones creadas en la otra clase coloque parametro utilizo eso para que ese paramentro sea mi variables creada
        System.out.print("De color ");
        primerBarco.color(color1);
        System.out.print("Con el precio de ");
        primerBarco.precio(precio1);//De igual manera paso el parametro de la variable inicializada a la funcion correspondiente
        System.out.print("De modelo ");
        primerBarco.modelo(modelo1);
        System.out.println("         HACE ");
        /*
        En esta parte utilizo el constructor para abrir las funciones y ejecutar lo que tiene cada uno de ellas.
        */
        primerBarco.prenderBarco();
        primerBarco.arrancarBarco();
        primerBarco.acelerarBarco();
        primerBarco.frenarBarco();
        primerBarco.apagarBarco();
        
        Barcos segundoBarco = new Barcos();
        /*
        De la misma manera que el anterior solo que este sera mi segundo barco y ya que es el segundo necessito diferentes precios
        marcas, color entonces lo diferencio del anterior con numeros 1,2,3,4, igualmente creo el constructor y llamo funcion por
        funcion y a los atributos les paso el paramentro de mi variables creada para que see ejecute bien el metodo
        */
        System.out.println(" ");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Segundo Barco = ");
        System.out.println();
        System.out.print("El barco de marca ");
        segundoBarco.marca(marca2);
        System.out.print("De color ");
        segundoBarco.color(color2);
        System.out.print("Con el precio de ");
        primerBarco.precio(precio2);
        System.out.print("De modelo ");
        primerBarco.modelo(modelo2);
        System.out.println("         HACE ");
        segundoBarco.prenderBarco();
        segundoBarco.arrancarBarco();
        segundoBarco.acelerarBarco();
        segundoBarco.frenarBarco();
        segundoBarco.apagarBarco();
        
        Barcos tercerBarco = new Barcos();//De igual manera tercer constructor creado con diferentes variables inicializadas
        System.out.println(" ");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Tercer Barco = ");
        System.out.println();
        System.out.print("El barco de marca ");
        tercerBarco.marca(marca3);
        System.out.print("De color ");
        tercerBarco.color(color3);
        System.out.print("Con el precio de ");
        primerBarco.precio(precio3);
        System.out.print("De modelo ");
        primerBarco.modelo(modelo3);
        System.out.println("         HACE");
        tercerBarco.prenderBarco();
        tercerBarco.arrancarBarco();
        tercerBarco.acelerarBarco();
        tercerBarco.frenarBarco();
        tercerBarco.apagarBarco();
        
        Barcos cuartoBarco = new Barcos();
        System.out.println(" ");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("Cuarto Barco = ");
        System.out.println();
        System.out.print("El barco de marca ");
        tercerBarco.marca(marca4);
        System.out.print("De color ");
        tercerBarco.color(color4); 
        System.out.print("Con el precio de ");
        primerBarco.precio(precio4);
        System.out.print("De modelo ");
        primerBarco.modelo(modelo4);
        System.out.println("         HACE ");
        cuartoBarco.prenderBarco();
        cuartoBarco.arrancarBarco();
        cuartoBarco.acelerarBarco();
        cuartoBarco.frenarBarco();
        cuartoBarco.apagarBarco();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    }  
}
