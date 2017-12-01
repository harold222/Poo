import Nomina
__author__="Harold Pedraza"

def main():
    empleado1 = Nomina.Nomina("juan", "alimana", 300300300, 750000)
    empleado2 = Nomina.Nomina("Cesar", "perez", 107896578, 850000)# le asigno sus valores a cada metodo
    empleado3 = Nomina.Nomina("Alberto", "cesares", 185755521, 900000)
    empleado4 = Nomina.Nomina("anna", "pedraza", 35897421, 1000000)
    empleado5 = Nomina.Nomina("Camilo", "suarez", 278541000, 50000)#referencia a la otra clase con sus objetos
    # traigo el valor de los nombres

    print("Valores dados en la clase Nomina: ");
    print(" ")
    print("Traer el nombre del empleado 1: ", empleado1.get_nombre())
    print("Traer el nombre del empleado 2: ", empleado2.get_nombre())
    print("Traer el nombre del empleado 3: ", empleado3.get_nombre())
    print("Traer el nombre del empleado 4: ", empleado4.get_nombre())
    print("Traer el nombre del empleado 5: ", empleado5.get_nombre())
    print(" ");# traigo los valores dados en los objetos creados

    print("Traer el apellido del empleado 1: ", empleado1.get_apellido())
    print("Traer el apellido del empleado 2: ", empleado2.get_apellido())
    print("Traer el apellido del empleado 3: ", empleado3.get_apellido())
    print("Traer el apellido del empleado 4: ", empleado4.get_apellido())
    print("Traer el apellido del empleado 5: ", empleado5.get_apellido())
    print(" ")
    print("Traer la cedula del empleado 1: ", empleado1.get_cedula())
    print("Traer la cedula del empleado 2: ", empleado2.get_cedula())
    print("Traer la cedula del empleado 3: ", empleado3.get_cedula())
    print("Traer la cedula del empleado 4: ", empleado4.get_cedula())
    print("Traer la cedula del empleado 5: ", empleado5.get_cedula())
    print(" ")
    print("Traer el salario del empleado 1: " , empleado1.get_salario())
    print("Traer el salario del empleado 2: " , empleado2.get_salario())
    print("Traer el salario del empleado 3: " , empleado3.get_salario())
    print("Traer el salario del empleado 4: " , empleado4.get_salario())
    print("Traer el salario del empleado 5: " , empleado5.get_salario())
    # Asignar un nombre al que antes era juan

    empleado1.set_nombre("Pedro")# cambio el nombre con el metodo set
    empleado2.set_nombre("Rodrigo")
    empleado3.set_nombre("Luis")
    empleado4.set_nombre("Carlos")
    empleado5.set_nombre("harold")

    empleado1.set_apellido("Pedro") # cambio el apellido con el metodo set
    empleado2.set_apellido("Rodrigo")
    empleado3.set_apellido("Salamandra")# le asigno un nuevo valor que el dado en los objetos
    empleado4.set_apellido("Pedraza")
    empleado5.set_apellido("Murcia")

    empleado1.set_cedula(150000) # cambio la cedula con el metodo set
    empleado2.set_cedula(3500000)
    empleado3.set_cedula(1890000)
    empleado4.set_cedula(1700000)
    empleado5.set_cedula(500000)

    empleado1.set_salario(135890000) # cambio la cedula con el metodo set
    empleado2.set_salario(650650650)
    empleado3.set_salario(700700700)
    empleado4.set_salario(1735489362)
    empleado5.set_salario(1477822369)

    print("-------------------------------------------------------------------")
    print("Los nuevos valores dados en el metodo set: ")
    print(" "); # imprimo los nuevos valores dados desde el metodo set
    print("* El nuevo nombre del empleado 1 es: ", empleado1.get_nombre())
    print("* El nuevo nuevo nombre del empleado 2: ", empleado2.get_nombre())
    print("* El nuevo nuevo nombre del empleado 3: " , empleado3.get_nombre())
    print("* El nuevo nuevo nombre del empleado 4: " , empleado4.get_nombre())
    print("* El nuevo nuevo nombre del empleado 5: " , empleado5.get_nombre())
    print(" ")
    print("* Traer el nuevo apellido del empleado 1: " , empleado1.get_apellido())
    print("* Traer el nuevo apellido del empleado 2: " , empleado2.get_apellido())
    print("* Traer el nuevo apellido del empleado 3: " , empleado3.get_apellido())
    print("* Traer el nuevo apellido del empleado 4: " , empleado4.get_apellido())
    print("* Traer el nuevo apellido del empleado 5: " , empleado5.get_apellido())
    print(" ")
    print("* Traer la nueva cedula del empleado 1: " , empleado1.get_cedula())
    print("* Traer la nueva cedula del empleado 2: " , empleado2.get_cedula())
    print("* Traer la nueva cedula del empleado 3: " , empleado3.get_cedula())
    print("* Traer la nueva cedula del empleado 4: " , empleado4.get_cedula())
    print("* Traer la nueva cedula del empleado 5: " , empleado5.get_cedula())
    print(" ")
    print("* Traer el nuevo salario del empleado 1: " , empleado1.get_salario())
    print("* Traer el nuevo salario del empleado 2: " , empleado2.get_salario())
    print("* Traer el nuevo salario del empleado 3: " , empleado3.get_salario())
    print("* Traer el nuevo salario del empleado 4: " , empleado4.get_salario())
    print("* Traer el nuevo salario del empleado 5: " , empleado5.get_salario())
main()