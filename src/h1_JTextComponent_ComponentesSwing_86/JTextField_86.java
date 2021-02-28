package h1_JTextComponent_ComponentesSwing_86;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_86 {

	public static void main(String[] args) {
		MarcoTxt marco = new MarcoTxt();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Layouts");
		
	}
	

}
class MarcoTxt extends JFrame {
	 
	 public MarcoTxt() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 Laminatxt laminaLayouts = new Laminatxt();
		 
		 add(laminaLayouts);
		
	}
	 
}


class Laminatxt extends JPanel{
	
	public Laminatxt() {
		
		JLabel texto = new JLabel("Email: ");
		add(texto);
		
		txt1=new JTextField(30);
		add(txt1);
		//System.out.println(txt1.getText().trim());			//trim es para eliminar el espacio
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(txt1.getText().trim());
				
			}
		});
		
		add(btn);
	}
	JTextField txt1,txt2;
}