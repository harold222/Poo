
#include<iostream>
#include<stdlib.h>
using namespace std;

class Barco{
	public://atributos
		string x,y;//solamente pueedo llamarlos desde el set o get
		
	public://metodo construc
		Barco();
		void setPunto(string, string);//tendra dos parametros que seran los atributos
		void encender();//metodo que hara el barco
		void acelerar();
		void frenar();
		void apagar();	
		string getMarca();//muestro punto por punto
		string getModelo();
};

Barco::Barco(){
}

void Barco::setPunto(string _x, string _y){//metodo set que tendra los valores
	x= _x;//paso los valores al metodo set
	y = _y;
}

void Barco::encender(){
	cout<<"* Se esta encendiendo."<<endl;
}

void Barco::acelerar(){
	cout<<"* Se esta acelerando"<<endl;
}

void Barco::frenar(){
	cout<<"* Se esta frenando"<<endl;//mensaje que mostrara el metodo
}

void Barco::apagar(){
	cout<<"* Se esta apagando"<<endl;
}

string Barco::getMarca(){
	return x;//retorno los valores de los puntos
}

string Barco::getModelo(){//retorno de tipo string
	return y;
}

int main(){
	Barco barco1;//constructores
	Barco barco2;
	Barco barco3;
	Barco barco4;
	/*
	Ejercisio basado en barcos con los metodos set y get
	*/
	cout<<"Ejercisio libre hecho en dev c++"<<endl;
	cout<<"Basado en el metodo set y get"<<endl;
	cout<<" "<<endl;
	
	barco1.setPunto("Nautic","1999");//establezco los valoresen set punto
	barco2.setPunto("Baltic","2016");
	barco3.setPunto("Astromar","2013");
	barco4.setPunto("Trinity","2007");
	
	cout<<"Los Barcos creados son:"<<endl;
	cout<<" "<<endl;
	cout<<"---------------------------------------------------------------------"<<endl;
	cout<<"El primer barco de marca "<<barco1.getMarca()<<" de modelo "<<barco1.getModelo()<<endl;//imprimo el metodo get ya que es el que almacena el valor
	barco1.encender();
	barco1.acelerar();
	barco1.frenar();
	barco1.apagar();
	cout<<"---------------------------------------------------------------------"<<endl;
	cout<<"El segundo barco de marca "<<barco2.getMarca()<<" de modelo "<<barco2.getModelo()<<endl;
	barco2.encender();
	barco2.acelerar();
	barco2.frenar();
	barco2.apagar();
	cout<<"---------------------------------------------------------------------"<<endl;
	cout<<"El tercer barco de marca "<<barco3.getMarca()<<" de modelo "<<barco3.getModelo()<<endl;
	barco3.encender();
	barco3.acelerar();
	barco3.frenar();
	barco3.apagar();
	cout<<"---------------------------------------------------------------------"<<endl;
	cout<<"El cuarto barco de marca "<<barco4.getMarca()<<" de modelo "<<barco4.getModelo()<<endl;
	barco4.encender();
	barco4.acelerar();
	barco4.frenar();
	barco4.apagar();
	cout<<" "<<endl;
	system("pause");
	return 0;
}

