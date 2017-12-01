import Nomina

__author__="Harold Pedraza"

def main():
    print("Bienvenido")
    print(" ")

    #Creando atributos

    empleado1 = Nomina.Nomina("juan", "alimaña", 300300, 75000)
    empleado2 = Nomina.Nomina("Cesar", "perez", 107896578, 850000)#paso los parametros creados
    empleado3 = Nomina.Nomina("Alberto", "cesares", 185755521, 900000)#hago referencia al nombre de la clase y al archivo
    empleado4 = Nomina.Nomina("anna", "pedraza", 35897421, 1000000)
    empleado5 = Nomina.Nomina("Camilo", "suarez", 278541000, 50000)

    empleado1.dato()
    empleado2.dato()
    empleado3.dato()#Imprimo los metodos creados
    empleado4.dato()
    empleado5.dato()
main()

