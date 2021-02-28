package a2_S_E_Date_Clases_14;

import javax.swing.JOptionPane;

public class NumberFormat_15 {

	public static void main(String[] args) {
		
		/*double x =10000.0;
		System.out.printf("%1.2f", x/3 + "\n");*/
		
		String num1=JOptionPane.showInputDialog("Introduce un número");
		double num2=Double.parseDouble(num1);
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.3f", Math.sqrt(num2));

	}

}
