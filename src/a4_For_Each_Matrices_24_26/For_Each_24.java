package a4_For_Each_Matrices_24_26;

import javax.swing.JOptionPane;

public class For_Each_24 {

	public static void main(String[] args) {
		
		/*String []paises = new String[8];
		
		paises[0]="Bolivia";
		paises[1]="M�xico";
		paises[2]="Venezuela";
		paises[3]="Argentina";
		paises[4]="Chile";
		paises[5]="Colombia";
		paises[6]="Brazil";
		paises[7]="Per�";
		
		for(int i=0;i<paises.length;i++) {
			System.out.println("Pa�s " + (i+1) + " " + paises[i]);
		}*/
		
		//---------------------------------------------------------------------------------------------------
		
		/*String []paises= {"Bolivia","M�xico","Venezuela","Argentina","Chile","Colombia","Brazil","Per�"};
		
		for(String p:paises) {
			System.out.println("Pa�s: " + p);
		}*/
		
		//---------------------------------------------------------------------------------------------------
		
		
		String []pais=new String[8];
		
		for(int i=0;i<8;i++) {
			pais[i]=JOptionPane.showInputDialog("Introduce pa�s" + (i+1));
		}
		
		for(String pa:pais) {
			System.out.println("Pa�s: " + pa);
		}
	}

}
