package a2_S_E_Date_Clases_14;

import javax.swing.JOptionPane;

public class Scanner_JOptionPane_15 {

	public static void main(String[] args) {
		
		String name=JOptionPane.showInputDialog("Introduce you name, por favor");
		int age =Integer.parseInt(JOptionPane.showInputDialog("Introduce you age, please"));
		
		System.out.println("Hola " + name + ". El año que viene tendrás " + (age+1) + " años.");

	}

}
