#Creacion de la clase donde creare las funciones de  los barcos que utilizare
class Barco:#creacion de la clase con dos puntos

	#Metodos y atributos que realizara el barco

	def __init__(self, texto):#parametro del texto que me llegara junto con el self que es una referencia a la instancia
			self.texto = texto

	def prenderBarco(self):
 		print("* Esta prendiendose el barco")
 		#mensaje que se imprimira cuando invoque este ciclo

	def arrancarBarco(self):#acciones que producen os barcos a crear en la otra clase
		print("* Esta arrancandose el barco")


	def acelerarBarco(self):
		print("* Esta acelerando el barco")
 

	def frenarBarco(self):
		print("* Esta frenandose el barco")#Acciones que realiza nuestro barco


	def apagarBarco(self):
 		print("* Esta apagando el barco")
 

	def color(self, color):
		print(color)#Imprimo el parametro que me llegara
 

	def marca(self, marcas):#parametro o atributo que obtendre 
 		print(marcas)
 

	def precio(self, precio):
		print(precio)
 

	def modelo(self, modelo):
 		print(modelo)
 
