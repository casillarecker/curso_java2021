package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class JRadioButton_II_94 {

	public static void main(String[] args) {
		MarcoRadioButton2 marco = new MarcoRadioButton2();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JRadioButton II");
		
	}
	

}
class MarcoRadioButton2 extends JFrame {
	 
	 public MarcoRadioButton2() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJRadioButton2 radio = new LaminaJRadioButton2();
		 
		 add(radio);
		
	}
	 

}

class LaminaJRadioButton2 extends JPanel{
	
	public LaminaJRadioButton2() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("Tengo una linda vida con Dios que no puede cambiar, seguire a Dios");
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		add(texto,BorderLayout.CENTER);
		
		laminaBtns=new JPanel();
		group= new ButtonGroup();
		
		ColocarRbtns("Pequeño", false, 15);
		ColocarRbtns("Mediano", false, 30);
		ColocarRbtns("Grande", false, 45);
		ColocarRbtns("Muy grande", false, 60);
		add(laminaBtns,BorderLayout.SOUTH);
	}	
	
	public void ColocarRbtns(String name,boolean seleccionado,final int tamano) {
		
		JRadioButton boton = new JRadioButton(name,seleccionado);
		group.add(boton);
		laminaBtns.add(boton);
		
		ActionListener event = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Serif",Font.PLAIN,tamano));
				
			}
		};
	boton.addActionListener(event);
	
	
	}

	private JLabel texto;
	private JRadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5;
	private ButtonGroup group;
	private JPanel laminaBtns;
}