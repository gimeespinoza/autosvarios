package coches;

import Vehiculo.Vehiculo;

public class automovil extends Vehiculo{
	public String baul;
	public int veloMax;

  public automovil(String marca, String modelo, int ruedas, String color,int a�o, int velInicial, int veloMax, String baul, int acelFre) {
	 super(marca, modelo, ruedas, color,a�o, velInicial,acelFre);
	 this.veloMax = veloMax;
	 this.baul = baul;	
 }
  
  public void mostrarInfo()
  {	
	  System.out.println("- " + super.marca + " "+ super.modelo +", "+ super.a�o + ": ");
	  System.out.println("Ruedas: "+ super.ruedas +", Color:"+ super.color +", Vel. Max: "+ veloMax+ ", Baul:" + baul +", Actual: "+ super.acelFre);
	  

	  }
  }
  
