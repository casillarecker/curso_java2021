package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class JRadioButton_93 {

	public static void main(String[] args) {
		MarcoRadioButton marco = new MarcoRadioButton();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JRadioButton");
		
	}
	

}
class MarcoRadioButton extends JFrame {
	 
	 public MarcoRadioButton() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJRadioButton box = new LaminaJRadioButton();
		 
		 add(box);
		
	}
	 



class LaminaJRadioButton extends JPanel{
	
	public LaminaJRadioButton() {
		
		group = new ButtonGroup();
		group1 = new ButtonGroup();
		
		rbtn1 = new JRadioButton("Blue",true);
		rbtn2 = new JRadioButton("Red",false);
		rbtn3 = new JRadioButton("Yellow",false);
		group.add(rbtn1);
		group.add(rbtn2);
		group.add(rbtn3);
		
		add(rbtn1);
		add(rbtn2);
		add(rbtn3);
	
		rbtn4 = new JRadioButton("Hombre",false);
		rbtn5 = new JRadioButton("Mujer",false);
		
		group1.add(rbtn4);
		group1.add(rbtn5);
		
		
		add(rbtn4);
		add(rbtn5);
		
		
	}
	
	private class ManejoJRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
		
	}
	
	}
}
	private JLabel texto;
	private JCheckBox chec1,chec2;
	private JRadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5;
	private ButtonGroup group,group1;
}
