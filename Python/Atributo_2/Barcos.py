#Creacion de la clase donde creare las funciones de  los barcos que utilizare
class Barco:

	#Metodos y atributos que realizara el barco
	#Primer punto del parcial de segundo corte

	def __init__(self, texto):#parametro del texto que me llegara junto con el self que es una referencia a la instancia
			self.texto = texto

	def prenderBarco(self, marca, modelo, color, precio):
 		print("* El barco de marca ",marca," de modelo ",modelo, " con el color ",color, " posee un precio de $",precio," este se esta prendiendo.")
 		#mensaje que se imprimira cuando invoque este ciclo

	def arrancarBarco(self, marca, modelo, color, precio):#acciones que producen os barcos a crear en la otra clase
		print("* El barco de marca ",marca," de modelo ",modelo, " con el color ",color, " posee un precio de $",precio," este se esta arrancando.")

#A diferencia de java para concatenar cadenas con otras o otras variables se necesita la coma, y no el mas
	def acelerarBarco(self, marca, modelo, color, precio):
		print("* El barco de marca ",marca," de modelo ",modelo, " con el color ",color, " posee un precio de $",precio," este se esta acelaerando.")
 
	#Cada metodo del barco llevara atributos para imprimirlos
	def frenarBarco(self, marca, modelo, color, precio):
		print("* El barco de marca ",marca," de modelo ",modelo, " con el color ",color, " posee un precio de $",precio," este se esta frenando.")#Acciones que realiza nuestro barco


	def apagarBarco(self, marca, modelo, color, precio):#Los dos puntos siempre necesario
 		print("* El barco de marca ",marca," de modelo ",modelo, " con el color ",color, " posee un precio de $",precio," este se esta apagando.")
 	#Funciona como en java los corchetes
