package f1_ActionPerformedAbstract_Fuentes_76;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Multiples_FuentesOyentes_80 {

	public static void main(String[] args) {
		MarcoFuentes marco = new MarcoFuentes();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Fondo Color");
		//*******************
		
		/*MarcoFuente mar2 = new MarcoFuente();
		mar2.setDefaultCloseOperation(2);
		mar2.setVisible(true);*/
	}
	

}
class MarcoFuentes extends JFrame {
	 
	 public MarcoFuentes() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 add(new LaminaFuenteOyentes());
	}
	 
}


class LaminaFuenteOyentes extends JPanel{
	
		public LaminaFuenteOyentes() {
			
			btn1=new JButton("Nuevo");
			btn2=new JButton("Cerrar todo");
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				MarcoEmergente  emergente = new MarcoEmergente(btn2);
				emergente.setVisible(true);
				}
			});
			
			
			add(btn1);
			add(btn2);
	
		}
		
		
		JButton btn1,btn2;
}
class MarcoEmergente extends JFrame{
	
	public MarcoEmergente(JButton exi) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 30*contador, 400, 250);
		exit name = new exit();
		exi.addActionListener(name);

	}
	
	private class exit implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
		
	}
	
	private static int contador=0;
}



















