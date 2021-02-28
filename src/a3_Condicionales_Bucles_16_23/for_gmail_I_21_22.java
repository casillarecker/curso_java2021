package a3_Condicionales_Bucles_16_23;

import javax.swing.JOptionPane;

public class for_gmail_I_21_22 {

	public static void main(String[] args) {

		int arroba=0;
		boolean punto=false;
		
		String gmail=JOptionPane.showInputDialog("Introduce gmail");
		for(int i=0;i<gmail.length();i++) {
			if(gmail.charAt(i)=='@') {
				arroba++;
			}
			if(gmail.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if(arroba==1 && punto==true) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto");
		}
	}

}
