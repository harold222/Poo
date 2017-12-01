/*Programa hecho por Harold Esteban Pedraza segundo programa documentado hecho en netbeans el dia 05/10/2017 hora 21:10 pm
 *Este programa esta hecho para aprender a como crear variables globales asignandoles un valor, en el metodo main
 *se hace el ejemplo de como se imprimiria estas variables, creando consigo una instancia con costructor para cada barco 
 *que desee.
 */

package atributos;

/**Declaracion de la clase AtributosBarco
 * @author Harold Pedraza
 * @version 05/10/2017
 */

public class AtributosBarco {
    
    //atributos de la clase, variables publicas en cualquier clase, debidamente inicializadas
    String marca = "Trinnity", color ="Naranja", modelo = "2018";
    double precio = 9800000;
      
    String marcaB = "Princess", colorB ="Gris", modeloB = "2011";
    double precioB = 4550000;
    
    String marcaC = "Sunceker", colorC ="Gris", modeloC = "2012";
    double precioC = 2400050;
    
    /**Metodo main
     * Definicion de nuestra clase main en donde interactuara con las variables publicas
     */
    
    public static void main(String[] args) {
        //Exponer el barco que cree, instanciando la clase o creando un objeto
    
        //variables creadas dentro de una clase, las cuales solo sirviran en esta clase y no podran ser ejecutadas desde otra.
        String marca1= "Astroman",color1 ="Naranja", modelo1 = "2015";
        double precio1 = 3550000;
        String marca2= "Tiara",color2 ="Rojo", modelo2 = "2005";
        double precio2 = 3550000;
        String marca3= "Nautic",color3 ="Cafe", modelo3 = "2008";
        double precio3 = 1830000;
        
        /*
        En la primera parte del codigo imprimo las variables creadas dentro del main con sus datos, una
        de sus principales difencias es que ya no necesito instanciar nada ya que estan dentro de la misma
        clase, ademas estas variables solo se pueden imprimir en esta clase.
        */
        System.out.println(                      "Bienvenido...!\n");
        System.out.println("/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/");
        System.out.println("1) Variables creadas desde el metodo main:\n ");
        System.out.println("Estas son las caracteristicas de el barco1\n");
        System.out.println("Esta es la marca de el barco: "+marca1);
        System.out.println("Este es el color de el barco: "+color1);
        System.out.println("Este es el modelo de el barco: "+modelo1);
        System.out.println("Este es el precio de el barco: "+precio1);
        System.out.println(" ");
        
        System.out.println("Estas son las caracteristicas de el barco2\n");
        System.out.println("Esta es la marca de mi barco: "+marca2);
        System.out.println("Este es el color de mi barco: "+color2);
        System.out.println("Este es el modelo de mi barco: "+modelo2);
        System.out.println("Este es el precio de mi barco: "+precio2);
        System.out.println(" ");
        
        System.out.println("Estas son las caracteristicas de el barco3\n");
        System.out.println("Esta es la marca de mi barco: "+marca3);
        System.out.println("Este es el color de mi barco: "+color3);
        System.out.println("Este es el modelo de mi barco: "+modelo3);
        System.out.println("Este es el precio de mi barco: "+precio3+"\n");
        
        /*
        En esta parte del codigo imprimo las variables creadas fuera del main con sus datos, creando asi
        una instancia por cada barco, en este caso son tres instancias y a cada una de ellas las diferencio
        con letras. 
        */
        System.out.println("/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/");
        System.out.println("2) Variables creadas fuera del metodo main:\n");
        AtributosBarco barcoA = new AtributosBarco();
        System.out.println("Estas son las caracteristicas de el barcoA\n");
        System.out.println("Esta es la marca de el barco: "+barcoA.marca);
        System.out.println("Este es el color de el barco: "+barcoA.color);
        System.out.println("Este es el modelo de el barco: "+barcoA.modelo);
        System.out.println("Este es el precio de el barco: "+barcoA.precio);
        System.out.println(" ");
        
        AtributosBarco barcoB = new AtributosBarco();
        System.out.println("Estas son las caracteristicas de el barcoB\n");
        System.out.println("Esta es la marca de mi barco: "+barcoB.marcaB);
        System.out.println("Este es el color de mi barco: "+barcoB.colorB);
        System.out.println("Este es el modelo de mi barco: "+barcoB.modeloB);
        System.out.println("Este es el precio de mi barco: "+barcoB.precioB);
        System.out.println(" ");
        
        AtributosBarco barcoC = new AtributosBarco();
        System.out.println("Estas son las caracteristicas de el barcoC\n");
        System.out.println("Esta es la marca de mi barco: "+barcoC.marcaC);
        System.out.println("Este es el color de mi barco: "+barcoC.colorC);
        System.out.println("Este es el modelo de mi barco: "+barcoC.modeloC);
        System.out.println("Este es el precio de mi barco: "+barcoA.precioC);
    }
}
