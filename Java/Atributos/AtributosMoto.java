/*
 * Creacion de primer proyecto de fundamento poo manejando atributos dentro de una clase main
 * creando variables para tres diferentes motos con diferentes caracteristicas.
 */

package atributos;

/**Declaracion de la clase AtributosMoto
 * @author Harold Pedraza
 * @version 05/10/2017
 */
public class AtributosMoto {

    //atributos de la clase inicializadas, en programacion se recomienda crear variables aparte
    String marca = "Ducatti", color ="Verde cielo", modelo = "2016";
    double precio = 1200000;
      
    String marcaB = "AKT", colorB ="Azul", modeloB = "2018";
    double precioB = 1500000;
    
    String marcaC = "Ferrari", colorC ="Rojo", modeloC = "2010";
    double precioC = 3800000;
    
    /**Metodo main donde imprimo las variables creadas.
     * Definimos nuestros atributos de clases
     */
    public static void main(String[] args) {
    
        //Voy a exponer la moto que cree, instanciando la clase o creando un objeto
    
        String marca1= "Akt",color1 ="Amarillo", modelo1 = "2018" ;
        double precio1=500000;
        String marca2= "Akt",color2 ="Marron", modelo2 = "2016" ;
        double precio2=3500000;
        String marca3= "Yamaha",color3 ="Verde", modelo3 = "2017" ;
        double precio3=400000;
        
        System.out.println(                      "Bienvenido...!\n");
        System.out.println("/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/");
        System.out.println("1) Variables creadas desde el metodo main:\n ");
        System.out.println("Estas son las caracteristicas de la moto1\n");
        System.out.println("Esta es la marca de la moto: "+marca1);
        System.out.println("Este es el color de la moto: "+color1);
        System.out.println("Este es el modelo de la moto: "+modelo1);
        System.out.println("Este es el precio de la moto: "+precio1);
        System.out.println(" ");
        
        System.out.println("Estas son las caracteristicas de la moto2\n");
        System.out.println("Esta es la marca de mi moto: "+marca2);
        System.out.println("Este es el color de mi moto: "+color2);
        System.out.println("Este es el modelo de mi moto: "+modelo2);
        System.out.println("Este es el precio de mi moto: "+precio2);
        System.out.println(" ");
        
        System.out.println("Estas son las caracteristicas de la moto3\n");
        System.out.println("Esta es la marca de mi moto: "+marca3);
        System.out.println("Este es el color de mi moto: "+color3);
        System.out.println("Este es el modelo de mi moto: "+modelo3);
        System.out.println("Este es el precio de mi moto: "+precio3+"\n");
        
        /*
        Desde esta parte del codigo creo instancias o constructores para poder visualizar y imprimir 
        las variables globales, instancio cada una A, B, C.
        */
        System.out.println("/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/");
        System.out.println("2)Variables creadas desde fuera del metodo main:\n");
        AtributosMoto motoA = new AtributosMoto();
        System.out.println("Estas son las caracteristicas de mi motoA\n");
        System.out.println("Esta es la marca de mi moto: "+motoA.marca);
        System.out.println("Este es el color de mi moto: "+motoA.color);
        System.out.println("Este es el modelo de mi moto: "+motoA.modelo);
        System.out.println("Este es el precio de mi moto: "+motoA.precio);
        System.out.println(" ");
        
        AtributosMoto motoB = new AtributosMoto();
        System.out.println("Estas son las caracteristicas de mi motoB\n");
        System.out.println("Esta es la marca de mi moto: "+motoB.marcaB);
        System.out.println("Este es el color de mi moto: "+motoB.colorB);
        System.out.println("Este es el modelo de mi moto: "+motoB.modeloB);
        System.out.println("Este es el precio de mi moto: "+motoB.precioB);
        System.out.println(" ");
        
        AtributosMoto motoC = new AtributosMoto();
        System.out.println("Estas son las caracteristicas de mi motoC\n");
        System.out.println("Esta es la marca de mi moto: "+motoC.marcaC);
        System.out.println("Este es el color de mi moto: "+motoC.colorC);
        System.out.println("Este es el modelo de mi moto: "+motoC.modeloC);
        System.out.println("Este es el precio de mi moto: "+motoC.precioC);
    }
    
}
