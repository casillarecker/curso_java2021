package b2_Herencia_40;

import b1_POO_27.Coche_28;

public class Furgoneta_40 extends Coche_28{

	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta_40(int capaCarga,int plzaextra) {
		super();   //Llamar al constructor de la clase padre
		capacidadCarga=capaCarga;
		plazasExtra=plzaextra;
		
		
		
	}
	
	public String dimeDatosFurgoneta() {
		return " La capacidad de carga es: " + capacidadCarga + " Y las plazas son: " + plazasExtra;
	}
	
}
