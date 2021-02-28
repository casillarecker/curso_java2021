package a3_Condicionales_Bucles_16_23;

import javax.swing.JOptionPane;

public class While_Indetermnados_18 {

	public static void main(String[] args) {
		
		String clave="Reynaldo";
		String pass ="";
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}
		}
		
		System.out.println("Contraseña correcta, Acceso permitido");

	}

}
