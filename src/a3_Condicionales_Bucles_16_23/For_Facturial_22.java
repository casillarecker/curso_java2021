package a3_Condicionales_Bucles_16_23;

import javax.swing.JOptionPane;

public class For_Facturial_22 {

	public static void main(String[] args) {

		int resultado=1;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
		}
		
		System.out.println("El facturial de " + numero +  " es " + resultado);
	}

}
