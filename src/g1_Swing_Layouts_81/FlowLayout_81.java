package g1_Swing_Layouts_81;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class FlowLayout_81 {

	public static void main(String[] args) {
		MarcoLayouts marco = new MarcoLayouts();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		//marco.setResizable(false);
		marco.setTitle("Windows Layouts");
		
	}
	

}
class MarcoLayouts extends JFrame {
	 
	 public MarcoLayouts() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaLayouts laminaLayouts = new LaminaLayouts();
		 
		 /*FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		 laminaLayouts.setLayout(layout);*/
		 
		 laminaLayouts.setLayout(new FlowLayout(FlowLayout.CENTER,30,25));
		 add(laminaLayouts);
		
	}
	 
}


class LaminaLayouts extends JPanel{
	
	public LaminaLayouts() {
		
		add(new JButton("Yellow"));
		add(new JButton("Blue"));
		add(new JButton("Red"));
		
	}
	
}






