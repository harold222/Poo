#Esta clase es la que va a llevar el constructor, con sus atributos y la invocacion de los mismos

__author__="Harold Pedraza"

class Nomina:

    def __init__(self, nombre, apellido, cedula, salario):
        self.nombre = nombre
        self.apellido = apellido
        self.cedula = cedula
        self.salario = salario

    def datos(self):
        print(" ")
        print("El empleado es: ")
        print(" ")
        print("El nombre del empleado es: ",self.nombre)
        print("El apellido del empleado es: ", self.apellido)
        print("La cedula del empleado es: ", self.cedula)
        print("El salario del empleado es: ", self.salario)

    """Meotodos get and set """
    def get_nombre(self):
        return self.nombre

    def get_apellido(self):
        return self.apellido

    def get_cedula(self):
        return self.cedula

    def get_salario(self):
        return self.salario


    def set_nombre(self,nom):
        self.nombre = nom

    def set_apellido(self,ape):
        self.apellido = ape

    def set_cedula(self,cedu):
        self.cedula = cedu

    def set_salario(self,sala):
        self.salario = sala