#include<iostream>
using namespace std;
//Hecho por Harold Pedraza para fundamentos Poo en dev c++, porgrama para crear atributos de ciertos objetos
//utilizando constructores para la invocacon de estos atributos

class AtributosBarcos{
	public://de que tipo se definiran
		string marca = "Trinnity";
		string color ="Naranja";
		string modelo = "2018";
    	int precio = 9800000;
      
    	string marcaB = "Princess";
		string colorB ="Gris";
		string modeloB = "2011";
    	int precioB = 4550000;
    	
    	string marcaC = "Sunceker";
		string colorC ="Gris";
		string modeloC = "2012";
    	int precioC = 2400050;
};

int main (){
	
		string marca1= "Astroman";
		string color1 ="Amarillo";// a difrencia de java la variable string
		string modelo1 = "2015" ;//va la s en minuscula
        double precio1=510000;
        
        string marca2= "Tierra";
		string color2 ="verde";
	    string modelo2 ="2014";//variables a utilizar dentro del main
        double precio2=504560;
        
        string marca3= "Nautic";
		string color3 ="rojo";
		string modelo3 = "2013" ;
        double precio3=1405000;
        
		cout <<                      "Bienvenido...!\n"<< endl;
        cout<<"/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/"<< endl;
        cout<<"1) Variables creadas desde el metodo main:\n "<< endl;
        cout<<"Estas son las caracteristicas del barco1\n"<< endl;
        cout<<"Esta es la marca del barco: "<< marca1<< " "<< endl;
        cout<<"Este es el color del barco: "<<color1<< endl;//para concatenar cadenas en c++ es con <<
        cout<<"Este es el modelo del barco: "<<modelo1<< endl;
        cout<<"Este es el precio del barco: "<<precio1<< endl;
        cout<<" "<< endl;
        
        cout <<"Estas son las caracteristicas del barco2\n"<< endl;
        cout <<"Esta es la marca del barco: "<<marca2<< endl;
        cout <<"Este es el color del barco: "<<color2<< endl;
        cout <<"Este es el modelo del barco: "<<modelo2<< endl;
        cout <<"Este es el precio del barco: "<<precio2<< endl;
        cout <<" "<< endl;
        
        cout <<"Estas son las caracteristicas del barco3\n"<< endl;
        cout <<"Esta es la marca del barco: "<<marca3<< endl;
        cout <<"Este es el color del barco: "<<color3<< endl;
        cout <<"Este es el modelo del barco: "<<modelo3<< endl;
        cout <<"Este es el precio del barco: "<<precio3<< endl;
        
        /*
        Desde esta parte del codigo creo instancias o constructores para poder visualizar y imprimir 
        las variables globales, instancio cada una A, B, C.
        */
        cout <<"/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/"<< endl;
        cout <<"2)Variables creadas desde fuera del metodo main:\n"<< endl;
        AtributosBarcos barcoA = AtributosBarcos();
        /*
        Para la creacion de constructores ya no es necesaria las palabra new 
        */
        cout <<"Estas son las caracteristicas del barcoA\n"<< endl;
        cout <<"Esta es la marca del barco: "<<barcoA.marca<< endl;//para la invocacion del mismo se usa igual que en java
        cout <<"Este es el color del barco: "<<barcoA.color<< endl;
        cout <<"Este es el modelo del barco: "<<barcoA.modelo<< endl;
        cout <<"Este es el precio del barco: "<<barcoA.precio<< endl;
        cout <<" "<< endl;
        
        AtributosBarcos barcoB = AtributosBarcos();
        cout <<"Estas son las caracteristicas del barcoB\n"<< endl;
        cout <<"Esta es la marca del barco: "<<barcoB.marcaB<< endl;
        cout <<"Este es el color del barco: "<<barcoB.colorB<< endl;
        cout <<"Este es el modelo del barco: "<<barcoB.modeloB<< endl;
        cout <<"Este es el precio del barco: "<<barcoB.precioB<< endl;
        cout <<" "<< endl;
        
        AtributosBarcos barcoC = AtributosBarcos();
        cout <<"Estas son las caracteristicas del barcoC\n"<< endl;
        cout <<"Esta es la marca del barco: "<<barcoC.marcaC<< endl;
        cout <<"Este es el color del barco: "<<barcoC.colorC<< endl;
        cout <<"Este es el modelo del barco: "<<barcoC.modeloC<< endl;
        cout <<"Este es el precio del barco: "<<barcoC.precioC<< endl;
        
        
		return 0;//para que no se cierre la consola
}
