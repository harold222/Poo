import Barcos#Hago la importacion de la otra clase llamada barcos para ejecutar los procesos
#Esta clase lleva los metodos que accionan el Barco

print(" ")
print("Bienvenido...!")#mensaje de bienvenido
print("----------------------------------------------------")
print("Primer Barco: ")

primerBarco = Barcos.Barco("")#Creacion de constructor para la invocacion del primer barco
segundoBarco = Barcos.Barco("")
tercerBarco = Barcos.Barco("")#Constructores para 4 barcos diferentes
cuartoBarco = Barcos.Barco("")

primerBarco.prenderBarco("Nautic","2017", "Rojo", 1500000)#primer barco con sus parametros 
primerBarco.arrancarBarco("Ninco", "2005", "blanco", 350000)#se diferencia ed sus otros por las variables
primerBarco.acelerarBarco("Honda", "2003", "dorado", 220000)
primerBarco.frenarBarco("spice", "2001", "verde", 1800000)
primerBarco.apagarBarco("old", "2006", "plata", 12500000)#parametros de los barcos
#Paso los cuatro parametros de el primer barco a las funciones creadas en la otra clase
print(" ")
print("-------------------------------------------------------------------------------------------")

print(" ")
print("Segundo Barco = ")
print(" ")
segundoBarco.prenderBarco("spice", "2003", "negro", 3500000)
segundoBarco.arrancarBarco("BMW", "2017", "Verde", 4500000)#Construccion del segundo constructor
segundoBarco.acelerarBarco("nautic", "2008", "naranja", 820000)
segundoBarco.frenarBarco("capelli", "2009", "azul", 650400)
segundoBarco.apagarBarco("geleon", "2016", "azulado", 785000)#Llamo a todas sus funciones correspondientes
print("-------------------------------------------------------------------------------------------")

print(" ")
print("Tercer Barco = ")
print(" ")
tercerBarco.prenderBarco("Le boat","2008","",1540000)
tercerBarco.arrancarBarco("ford","2013","blanco",189000)#parametros utilizados para cada metodo
tercerBarco.acelerarBarco("Le boat", "2010","gris", 380000)
tercerBarco.frenarBarco("nautic","2005","cafe",1350020)
tercerBarco.apagarBarco("valli","1999","negro",4950000)
print("--------------------------------------------------------------------------------------------")

print(" ")
print("Cuarto Barco = ")
print(" ")
cuartoBarco.prenderBarco("Astromar","2007","negro",1000000)
cuartoBarco.arrancarBarco("nautic","2013","blanco",1540000)
cuartoBarco.acelerarBarco("valli","2005","azul",1900000)
cuartoBarco.frenarBarco("Astromar", "2015", "negro", 1805000)
cuartoBarco.apagarBarco("leboat","2016","cafe", 45000000)
print("----------------------------------------------------------------------------------------------")


