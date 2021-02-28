package d1_Grafica_JPanel_JFrame_55;

import javax.swing.JFrame;

public class Jframe_Propiedades_55 {

	public static void main(String[] args) {
		MiMarco marco = new MiMarco();
	}

}
 class MiMarco extends JFrame {
	 
	 public MiMarco() {
		 setTitle("Mi Ventana 1");
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setResizable(false);
		//setExtendedState(6);	 
		 
	}
	 
 }