package b1_POO_27;

import javax.swing.JOptionPane;

import b2_Herencia_40.Furgoneta_40;

public class Coche_Main_28_32 {

	public static void main(String[] args) {
		
		/*Coche_28 coche = new Coche_28();		//Instancia de otra clase o ejemplar de clase.
		
		coche.establceColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(coche.dimeDatosGeneral());
		System.out.println(coche.dimeColor());
		
		coche.confuguraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(coche.dimeAsientos());
		coche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(coche.dimeClimatizador() + " " + coche.dimePesoCoche());
		System.out.println("El precio final de coche es: " + coche.precioCoche());*/
		
		Coche_28 coche = new Coche_28();
		
		coche.establceColor("Green");
		
		Furgoneta_40 furgoneta = new Furgoneta_40(580,7);
		furgoneta.establceColor("Blue");
		furgoneta.confuguraAsientos("Si");
		furgoneta.configuraClimatizador("si");
		System.out.println(coche.dimeDatosGeneral() + " \n" + coche.dimeColor());
		System.out.println(furgoneta.dimeDatosGeneral() + "\n" +  furgoneta.dimeDatosFurgoneta());

	}

}
