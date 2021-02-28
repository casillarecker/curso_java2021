package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class JSlider_96 {

	public static void main(String[] args) {
		MarcoJSlider marco = new MarcoJSlider();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JSlider");
		
	}
	

}
class MarcoJSlider extends JFrame {
	 
	 public MarcoJSlider() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJSlider box = new LaminaJSlider();
		 
		 add(box);
		
	}
	 



class LaminaJSlider extends JPanel{
	
	public LaminaJSlider() {
		
		JSlider control = new JSlider(0,100,25);
		//control.setOrientation(SwingConstants.VERTICAL);
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif",Font.PLAIN,15));
		control.setPaintLabels(true);
		control.setSnapToTicks(true);
		
		
		add(control);

		
		
	}

}
	
}