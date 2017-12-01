
#include<iostream>
using namespace std;
//clases y atributos en c++


class AtributosMotos{
	public: //atributos de la moto dentro de una clase necesarios los dos puntos para definirlos
		string marca = "Ducatti";
		string color ="Verde cielo";
		string modelo = "2016";
   		int precio = 12000;
      
    	string marcaB = "AKT"; 
		string colorB ="Azul";
		string modeloB = "2018";
    	int precioB = 15000;
    
    	string marcaC = "Ferrari";
		string colorC ="Rojo";
		string modeloC = "2010";
    	int precioC = 38000;
};

int main(){
		string marca1= "Akt";
		string color1 ="Amarillo";// a difrencia de java la variable string
		string modelo1 = "2018" ;//va la s en minuscula
        double precio1=500000;
        string marca2= "Akt";
		string color2 ="Marron";
	    string modelo2 = "2016" ;
        double precio2=3500000;
        string marca3= "Yamaha";
		string color3 ="Verde";
		string modelo3 = "2017" ;
        double precio3=400000;
        
        cout <<                      "Bienvenido...!\n"<< endl;
        cout<<"/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/"<< endl;
        cout<<"1) Variables creadas desde el metodo main:\n "<< endl;
        cout<<"Estas son las caracteristicas de la moto1\n"<< endl;
        cout<<"Esta es la marca de la moto: "<< marca1<< " "<< endl;
        cout<<"Este es el color de la moto: "<<color1<< endl;//para concatenar cadenas en c++ es con <<
        cout<<"Este es el modelo de la moto: "<<modelo1<< endl;
        cout<<"Este es el precio de la moto: "<<precio1<< endl;
        cout<<" "<< endl;
        
        cout <<"Estas son las caracteristicas de la moto2\n"<< endl;
        cout <<"Esta es la marca de mi moto: "<<marca2<< endl;
        cout <<"Este es el color de mi moto: "<<color2<< endl;
        cout <<"Este es el modelo de mi moto: "<<modelo2<< endl;
        cout <<"Este es el precio de mi moto: "<<precio2<< endl;
        cout <<" "<< endl;
        
        cout <<"Estas son las caracteristicas de la moto3\n"<< endl;
        cout <<"Esta es la marca de mi moto: "<<marca3<< endl;
        cout <<"Este es el color de mi moto: "<<color3<< endl;
        cout <<"Este es el modelo de mi moto: "<<modelo3<< endl;
        cout <<"Este es el precio de mi moto: "<<precio3<< endl;
        
        /*
        Desde esta parte del codigo creo instancias o constructores para poder visualizar y imprimir 
        las variables globales, instancio cada una A, B, C.
        */
        cout <<"/-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-//-/-/"<< endl;
        cout <<"2)Variables creadas desde fuera del metodo main:\n"<< endl;
        AtributosMotos motoA = AtributosMotos();
        /*
        Para la creacion de constructores ya no es necesaria las palabra new 
        */
        cout <<"Estas son las caracteristicas de mi motoA\n"<< endl;
        cout <<"Esta es la marca de mi moto: "<<motoA.marca<< endl;//para la invocacion del mismo se usa igual que en java
        cout <<"Este es el color de mi moto: "<<motoA.color<< endl;
        cout <<"Este es el modelo de mi moto: "<<motoA.modelo<< endl;
        cout <<"Este es el precio de mi moto: "<<motoA.precio<< endl;
        cout <<" "<< endl;
        
        AtributosMotos motoB = AtributosMotos();
        cout <<"Estas son las caracteristicas de mi motoB\n"<< endl;
        cout <<"Esta es la marca de mi moto: "<<motoB.marcaB<< endl;
        cout <<"Este es el color de mi moto: "<<motoB.colorB<< endl;
        cout <<"Este es el modelo de mi moto: "<<motoB.modeloB<< endl;
        cout <<"Este es el precio de mi moto: "<<motoB.precioB<< endl;
        cout <<" "<< endl;
        
        AtributosMotos motoC = AtributosMotos();
        cout <<"Estas son las caracteristicas de mi motoC\n"<< endl;
        cout <<"Esta es la marca de mi moto: "<<motoC.marcaC<< endl;
        cout <<"Este es el color de mi moto: "<<motoC.colorC<< endl;
        cout <<"Este es el modelo de mi moto: "<<motoC.modeloC<< endl;
        cout <<"Este es el precio de mi moto: "<<motoC.precioC<< endl;
        
        return 0;
}
