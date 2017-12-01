/*
 * Esta clase va a manejar los metodos gett and sett
 */
package obteneryasignar;

/**
 * @author Harold Pedraza
 */

public class ObteneryAsignar {

    public static void main(String[] args) {
        // creando objetos
        Nomina empleado1 = new Nomina("juan", "alimaña", 300300300, 750000);
        Nomina empleado2 = new Nomina("Cesar", "perez", 107896578, 850000);//le asigno sus valores a cada metodo
        Nomina empleado3 = new Nomina("Alberto", "cesares", 185755521, 900000);
        Nomina empleado4 = new Nomina("anna", "pedraza", 35897421, 1000000);
        Nomina empleado5 = new Nomina("Camilo", "suarez", 278541000, 50000);
        //referencia a la otra clase con sus objetos
        // traigo el valor de los nombres
        System.out.println("Valores dados en la clase Nomina: ");
        System.out.println(" ");
        System.out.println("Traer el nombre del empleado 1: "+empleado1.getnombres());
        System.out.println("Traer el nombre del empleado 2: "+empleado2.getnombres());
        System.out.println("Traer el nombre del empleado 3: "+empleado3.getnombres());
        System.out.println("Traer el nombre del empleado 4: "+empleado4.getnombres());
        System.out.println("Traer el nombre del empleado 5: "+empleado5.getnombres());
        System.out.println(" ");//traigo los valores dados en los objetos creados
        System.out.println("Traer el apellido del empleado 1: "+empleado1.getapellidos());
        System.out.println("Traer el apellido del empleado 2: "+empleado2.getapellidos());
        System.out.println("Traer el apellido del empleado 3: "+empleado3.getapellidos());
        System.out.println("Traer el apellido del empleado 4: "+empleado4.getapellidos());
        System.out.println("Traer el apellido del empleado 5: "+empleado5.getapellidos());  
        System.out.println(" ");
        System.out.println("Traer la cedula del empleado 1: "+empleado1.getcedula());
        System.out.println("Traer la cedula del empleado 2: "+empleado2.getcedula());
        System.out.println("Traer la cedula del empleado 3: "+empleado3.getcedula());
        System.out.println("Traer la cedula del empleado 4: "+empleado4.getcedula());
        System.out.println("Traer la cedula del empleado 5: "+empleado5.getcedula());
        System.out.println(" ");
        System.out.println("Traer el salario del empleado 1: "+empleado1.getsalario());
        System.out.println("Traer el salario del empleado 2: "+empleado2.getsalario());
        System.out.println("Traer el salario del empleado 3: "+empleado3.getsalario());
        System.out.println("Traer el salario del empleado 4: "+empleado4.getsalario());
        System.out.println("Traer el salario del empleado 5: "+empleado5.getsalario());
        //Asignar un nombre al que antes era juan 

        empleado1.setnombres("Pedro");//cambio el nombre con el metodo sett
        empleado2.setnombres("Rodrigo");
        empleado3.setnombres("Luis");
        empleado4.setnombres("Carlos");
        empleado5.setnombres("harold");
        
        empleado1.setapellidos("Pedro");//cambio el apellido con el metodo sett
        empleado2.setapellidos("Rodrigo");
        empleado3.setapellidos("Salamandra");//le asigno un nuevo valor que el dado en los objetos
        empleado4.setapellidos("Pedraza");
        empleado5.setapellidos("Murcia");
        
        empleado1.setcedula(150000);//cambio la cedula con el metodo sett
        empleado2.setcedula(3500000);
        empleado3.setcedula(1890000);
        empleado4.setcedula(1700000);
        empleado5.setcedula(500000);
        
        empleado1.setcedula(135890000);//cambio la cedula con el metodo sett
        empleado2.setcedula(650650650);
        empleado3.setcedula(700700700);
        empleado4.setcedula(1735489362);
        empleado5.setcedula(1477822369);
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Los nuevos valores dados en el metodo set: ");
        System.out.println(" ");//imprimo los nuevos valores dados desde el metodo set
        System.out.println("* El nuevo nombre del empleado 1 es: "+empleado1.getnombres());
        System.out.println("* El nuevo nuevo nombre del empleado 2: "+empleado2.getnombres());
        System.out.println("* El nuevo nuevo nombre del empleado 3: "+empleado3.getnombres());
        System.out.println("* El nuevo nuevo nombre del empleado 4: "+empleado4.getnombres());
        System.out.println("* El nuevo nuevo nombre del empleado 5: "+empleado5.getnombres());
        System.out.println(" ");
        System.out.println("* Traer el nuevo apellido del empleado 1: "+empleado1.getapellidos());
        System.out.println("* Traer el nuevo apellido del empleado 2: "+empleado2.getapellidos());
        System.out.println("* Traer el nuevo apellido del empleado 3: "+empleado3.getapellidos());
        System.out.println("* Traer el nuevo apellido del empleado 4: "+empleado4.getapellidos());
        System.out.println("* Traer el nuevo apellido del empleado 5: "+empleado5.getapellidos());
        System.out.println(" ");
        System.out.println("* Traer la nueva cedula del empleado 1: "+empleado1.getcedula());
        System.out.println("* Traer la nueva cedula del empleado 2: "+empleado2.getcedula());
        System.out.println("* Traer la nueva cedula del empleado 3: "+empleado3.getcedula());
        System.out.println("* Traer la nueva cedula del empleado 4: "+empleado4.getcedula());
        System.out.println("* Traer la nueva cedula del empleado 5: "+empleado5.getcedula());
        System.out.println(" ");
        System.out.println("* Traer el nuevo salario del empleado 1: "+empleado1.getsalario());
        System.out.println("* Traer el nuevo salario del empleado 2: "+empleado2.getsalario());
        System.out.println("* Traer el nuevo salario del empleado 3: "+empleado3.getsalario());
        System.out.println("* Traer el nuevo salario del empleado 4: "+empleado4.getsalario());
        System.out.println("* Traer el nuevo salario del empleado 5: "+empleado5.getsalario()); 
    }
    
}
