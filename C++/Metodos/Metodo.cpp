#include<iostream>
using namespace std;

class Barcos{
		public:
		void prenderBarco(string marca, string modelo, string color, double precio) {//metodo vacio que posee cuatro parametros el cual se dara desde el metodo main
        cout<<"* El barco de marca "<<marca<<" de modelo "<<modelo<< " con el color "<<color<< " posee un precio de $"<<precio<<" este se esta prendiendo."<<endl;//concateno la variable con el valor dado
    }

    void arrancarBarco(string marca, string modelo, string color, int precio){
       cout<<"* El barco de marca "<<marca<<" de modelo "<<modelo<< " con el color "<<color<< " posee un precio de $"<<precio<<" este se esta arrancando."<<endl;
    }
    
    void frenarBarco (string marca, string modelo, string color, int precio){
    
        cout<<"* El barco de marca "<<marca<<" de modelo "<<modelo<< " con el color "<<color<<" posee un precio de $"<<precio<<" este se esta frenando."<<endl;
    }
    
    void acelerarBarco(string marca, string modelo, string color, int precio){
        cout<<"* El barco de marca "<<marca<<" de modelo "<<modelo<< " con el color "<<color<< " posee un precio de $"<<precio<<" este se esta acelaerando."<<endl;
    }

    void apagarBarco(string marca, string modelo, string color, int precio){
        cout<<"* El barco de marca "<<marca<<" de modelo "<<modelo<< " con el color "<<color<< " posee un precio de $"<<precio<<" este se esta apagando."<<endl;
    }
	};
int main(){
     	//aqui crearemos nuestras instancias o objetos  
        cout <<"Bienvenido..!"<< endl;
        cout <<" "<< endl;
        cout <<"----------------------------------------"<< endl;
        cout <<"Primer Barco: "<< endl;
        //creacion de los constructores
        Barcos primerBarco = Barcos();
        primerBarco.prenderBarco("Nautic","2017", "Rojo", 1500000);
        primerBarco.arrancarBarco("Ninco", "2005", "blanco", 350000);
        primerBarco.acelerarBarco("Honda", "2003", "dorado", 220000);
        primerBarco.frenarBarco("spice", "2001", "verde", 1800000);//cosntructor llamando a los metodos y pasando los parametros
        primerBarco.apagarBarco("old", "2006", "plata", 12500000);//de la misma manera que en java
        cout <<"----------------------------------------"<< endl;
        cout <<" "<< endl;
        cout <<"Segundo Barco:"<< endl;
        
        Barcos segundoBarco =Barcos();//segundo conscructor
        segundoBarco.prenderBarco("spice", "2003", "negro", 0);
        segundoBarco.arrancarBarco("BMW", "2017", "Verde", 4500000);
        segundoBarco.acelerarBarco("nautic", "2008", "naranja", 820000);
        segundoBarco.frenarBarco("capelli", "2009", "azul", 650400);
        segundoBarco.apagarBarco("geleon", "2016", "azulado", 785000);
        cout <<"----------------------------------------"<< endl;
        cout <<" "<< endl;
        cout <<"Tercer Barco: "<< endl;
        
        Barcos tercerBarco = Barcos();
        tercerBarco.prenderBarco("Le boat","2008","",1540000);
        tercerBarco.arrancarBarco("ford","2013","blanco",189000);//parametros utilizados para cada metodo
        tercerBarco.acelerarBarco("Le boat", "2010","gris", 380000);
        tercerBarco.frenarBarco("nautic","2005","cafe",1350020);
        tercerBarco.apagarBarco("valli","1999","negro",4950000);
        cout <<"----------------------------------------"<< endl;
        cout <<" "<< endl;
        cout <<"Cuarto Barco: "<< endl;
        
        Barcos cuartoBarco = Barcos();//ultimo constructor
        cuartoBarco.prenderBarco("Astromar","2007","negro",1000000);
        cuartoBarco.arrancarBarco("nautic","2013","blanco",1540000);
        cuartoBarco.acelerarBarco("valli","2005","azul",1900000);
        cuartoBarco.frenarBarco("Astromar", "2015", "negro", 1805000);
        cuartoBarco.apagarBarco("leboat","2016","cafe", 45000000);
        cout <<"----------------------------------------"<< endl;
	return 0;
}
