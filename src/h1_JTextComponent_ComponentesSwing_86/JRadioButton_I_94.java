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

import h1_JTextComponent_ComponentesSwing_86.MarcoRadioButton1.LaminaJRadioButton1;

public class JRadioButton_I_94 {

	public static void main(String[] args) {
		MarcoRadioButton1 marco = new MarcoRadioButton1();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JRadioButton");
		
	}
	

}
class MarcoRadioButton1 extends JFrame {
	 
	 public MarcoRadioButton1() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJRadioButton1 box = new LaminaJRadioButton1();
		 
		 add(box);
		
	}
	 



class LaminaJRadioButton1 extends JPanel{
	
	public LaminaJRadioButton1() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("Tengo una linda vida con Dios que no puede cambiar, seguire a Dios");
		add(texto,BorderLayout.CENTER);
		
		group = new ButtonGroup();
		group1 = new ButtonGroup();
		
		rbtn1 = new JRadioButton("Pequeño",true);
		rbtn2 = new JRadioButton("Mediano",false);
		rbtn3 = new JRadioButton("Grande",false);
		rbtn4 = new JRadioButton("Muy grande",false);
		
		JPanel radios = new JPanel();
		
		rbtn1.addActionListener(new ManejoJRadio1());
		rbtn2.addActionListener(new ManejoJRadio1());
		rbtn3.addActionListener(new ManejoJRadio1());
		rbtn4.addActionListener(new ManejoJRadio1());
		
		group.add(rbtn1);
		group.add(rbtn2);
		group.add(rbtn3);
		group.add(rbtn4);
		
		radios.add(rbtn1);
		radios.add(rbtn2);
		radios.add(rbtn3);
		radios.add(rbtn4);
		
		add(radios,BorderLayout.SOUTH);
		
		
		
	}
	
	private class ManejoJRadio1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			if(rbtn1==e.getSource()) {
				//System.out.println(1);
				
				texto.setFont(new Font("Serif",Font.PLAIN,15));
				
			} else if(rbtn2==e.getSource()) {
				texto.setFont(new Font("Serif",Font.PLAIN,30));
			}else if(rbtn3==e.getSource()) {
				texto.setFont(new Font("Serif",Font.PLAIN,45));
			}else if(rbtn4==e.getSource()) {
				texto.setFont(new Font("Serif",Font.PLAIN,60));
			}

	}
	
	}
}
	private JLabel texto;
	private JRadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5;
	private ButtonGroup group,group1;
}