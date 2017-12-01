import Barcos#Hago la importacion de la otra clase

color1 = "Blanco"#variables inicializadas que luego utilizare
color2 = "Verde"
color3 = "Azul"
color4 = "Rojo"
marca1 = "Nautic"
marca2 = "Blue"
marca3 = "Old"
marca4 = "Stack"
#creacion de los atributos para los barcos que utilizare
precio1= 100000
precio2= 500000
precio3= 200000
precio4= 150000
modelo1 = 2017
modelo2 = 2013
modelo3 = 2015
modelo4 = 2000

print(" ")
print("Bienvenido...!")#mensaje de bienvenido
print("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-")
print(" ")

primerBarco = Barcos.Barco("")#Creacion de constructor para la invocacion del primer barco
segundoBarco = Barcos.Barco("")
tercerBarco = Barcos.Barco("")
cuartoBarco = Barcos.Barco("")

print("Primer Barco = ")
print(" ")
print("El barco de marca")#imprimo el mensaje
primerBarco.marca(marca1)
print("de color")
primerBarco.color(color1)
print("con el precio")
primerBarco.precio(precio1)
print("de modelo")
primerBarco.modelo(modelo1)
print("                Realiza las siguientes operaciones: ")
print(" ")
print("-------------------------------------------------------------------------------------------")
primerBarco.prenderBarco()
primerBarco.arrancarBarco()
primerBarco.acelerarBarco()
primerBarco.frenarBarco()
primerBarco.apagarBarco()

print(" ")
print("Segundo Barco = ")
print(" ")
print("El barco de marca")
segundoBarco.marca(marca2)
print("de color")
segundoBarco.color(color2)
print("con el precio")
segundoBarco.precio(precio2)
print("de modelo")
segundoBarco.modelo(modelo2)

print("                Realiza las siguientes operaciones: ")
print(" ")
print("-------------------------------------------------------------------------------------------")

segundoBarco.prenderBarco()
segundoBarco.arrancarBarco()
segundoBarco.acelerarBarco()
segundoBarco.frenarBarco()
segundoBarco.apagarBarco()

print(" ")
print("Tercer Barco = ")
print(" ")
print("El barco de marca")
tercerBarco.marca(marca3)
print("de color")
tercerBarco.color(color3)
print("con el precio")
tercerBarco.precio(precio3)
print("y el modelo")
tercerBarco.modelo(modelo3)

print("                Realiza las siguientes operaciones: ")
print(" ")
print("--------------------------------------------------------------------------------------------")

tercerBarco.prenderBarco()
tercerBarco.arrancarBarco()
tercerBarco.acelerarBarco()
tercerBarco.frenarBarco()
tercerBarco.apagarBarco()

print(" ")
print("Cuarto Barco = ")
print(" ")
print("El barco de marca")#imprimo la variable creda
cuartoBarco.marca(marca4)
print("de color")
cuartoBarco.color(color4)
print("con el precio")
cuartoBarco.precio(precio4)
print("y el modelo")
cuartoBarco.modelo(modelo4)

print("                Realiza las siguientes operaciones: ")
print(" ")
print("----------------------------------------------------------------------------------------------")

cuartoBarco.prenderBarco()
cuartoBarco.arrancarBarco()
cuartoBarco.acelerarBarco()
cuartoBarco.frenarBarco()
cuartoBarco.apagarBarco()

