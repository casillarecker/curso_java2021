package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class JPasswordField_89 {

	public static void main(String[] args) {
		MarcoPassword marco = new MarcoPassword();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Document");
		
	}
	

}
class MarcoPassword extends JFrame {
	 
	 public MarcoPassword() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJTPassword laminaLayouts = new LaminaJTPassword();
		 
		 add(laminaLayouts);
		
	}
	 
}


class LaminaJTPassword extends JPanel{
	
	public LaminaJTPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		laminaSuperior.setLayout(new GridLayout(2,2));
		add(laminaSuperior,BorderLayout.NORTH);
		
		//*******************************************
		
		JLabel labeluser = new JLabel("User");
		JLabel labelpass = new JLabel("Password");
		JTextField txtuser=new JTextField(10);
		
		ConpruebaPass pass = new ConpruebaPass();
		
		txtpass = new JPasswordField(10);
		txtpass.getDocument().addDocumentListener(pass);
		
		laminaSuperior.add(labeluser);
		laminaSuperior.add(txtuser);
		laminaSuperior.add(labelpass);
		laminaSuperior.add(txtpass);
		
		btn1=new JButton("Enviar");
		add(btn1,BorderLayout.SOUTH);
		
	}
	
	private class ConpruebaPass implements DocumentListener{
		

		@Override
		public void changedUpdate(DocumentEvent e) {
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			
			char [] contrasena;
			
			contrasena=txtpass.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				txtpass.setBackground(Color.white);
			}else {
				txtpass.setBackground(Color.red);
			}
			
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			
			char [] contrasena;
			
			contrasena=txtpass.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				txtpass.setBackground(Color.red);
			}else {
				txtpass.setBackground(Color.white);
			}
			
			
		}
		}

	
	JTextField txt1;
	JPasswordField txtpass;
	JButton btn1;
}