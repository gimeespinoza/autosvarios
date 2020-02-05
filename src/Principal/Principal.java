package Principal;

import java.util.ArrayList;

import Bicicleta.Bici;
import Camion.Camion;
import Motocicleta.Moto;
import coches.automovil;

public class Principal {

	public static void main(String[] args) {
		
		//Motos
		
		Moto m1 = new Moto("Marca 1", "Modelo 1",2,"Rojo",2000,180,0, 200);
		Moto m2 = new Moto("Marca 2", "Modelo 2",2,"Verde",2000,160,0,0);
		Moto m3 = new Moto("Marca 3", "Modelo 3",2,"Azul",2000,177,0,90);
		
		//Automoviles
		
		automovil a1 = new automovil("Marca 1","Modelo 1", 4,"Azul", 2017,0, 177,"Si", 120);
		automovil a2 = new automovil("Ford","Falcon", 4,"Verde", 1976,0, 150,"Si", 190 );
		automovil a3 = new automovil("Marcca 3","Modelo 3", 4,"Rojo", 2020,0, 180,"Si",0);
		
		//Bicis
		Bici b1 = new Bici("Marca 1", "Modelo 1",2, "Azul", 2010, 0,"Estilo 1",120);
		Bici b2 = new Bici("Marca 2", "Modelo 2",2, "Verde", 2014,0, "Estilo 2",100);
		Bici b3 = new Bici("Marca 3", "Modelo 3",2, "Rojo", 2010,0, "Estilo 3",0);
		
		//Camiones
		
		Camion c1 = new Camion("Modelo 1","Marca 1",4,"R",2000,0,120,177,110);
		Camion c2 = new Camion("Modelo 2","Marca 2",4,"G",2010,0,210,180,100);
	    Camion c3 = new Camion("Modelo 3","Marca 3",4,"B",2009,0,20,160,90);
	    
	    //Demas
	    
		ArrayList<automovil> autos = new ArrayList<automovil>();
		autos.add(a1);
		autos.add(a2);
		autos.add(a3);
		ArrayList<Bici> bicis = new ArrayList<Bici>();
		bicis.add(b1);
		bicis.add(b2);
		bicis.add(b3);
		ArrayList<Moto> motos = new ArrayList<Moto>();
		motos.add(m1);
		motos.add(m2);
		motos.add(m3);
		ArrayList<Camion> camiones = new ArrayList<Camion>();
		camiones.add(c1);
		camiones.add(c2);
		camiones.add(c3);
	    System.out.println("> COCHES:");
		a1.mostrarInfo();
		a2.mostrarInfo();
		a3.mostrarInfo();
		System.out.println("---------");
		System.out.println("> BICICLETAS:");
		b1.mostrarInfo();
		b2.mostrarInfo();
		b3.mostrarInfo();
		System.out.println("---------");
		System.out.println("> MOTOS:");
		m1.mostrarInfo();
		m2.mostrarInfo();
		m3.mostrarInfo();
		System.out.println("---------");
		System.out.println("> CAMIONES:");
		c1.mostrarInfo();
		c2.mostrarInfo();
		c3.mostrarInfo();
		
		

		
	}

}
