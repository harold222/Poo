#Esta clase es la que va a llevar el constructor, con sus atributos y la invocacion de los mismos
class Nomina:

    def __init__(self, nombre, apellidos, cedula, salario):#self referencia a la instancia actual
        self.nombre = nombre
        self.apellidos = apellidos
        self.cedula = cedula#referencia al self
        self.salario = salario

    def dato(self):#metodo el cual imprimire los datos
        print(" ")
        print("El empleado siguiente es ")
        print(" ")
        print("* El nombre del empleado es: ", self.nombre)#concateno con las variables
        print("* El apellido del empleado es: ", self.apellidos)
        print("* La cedula del empleado es: ", self.cedula)
        print("* El salario del empleado es: ", self.salario)
