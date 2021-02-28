package h1_JTextComponent_ComponentesSwing_86;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Document_88 {

	public static void main(String[] args) {
		MarcoDocument marco = new MarcoDocument();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Document");
		
	}
	

}
class MarcoDocument extends JFrame {
	 
	 public MarcoDocument() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaDocument laminaLayouts = new LaminaDocument();
		 
		 add(laminaLayouts);
		
	}
	 
}


class LaminaDocument extends JPanel{
	
	public LaminaDocument() {
		
		JLabel texto = new JLabel("Email: ");
		add(texto);
		
		txt1=new JTextField(30);
		
		//**********************************************************************document
		DocumentTexto duTexto=new DocumentTexto();
		Document docu = txt1.getDocument();
		docu.addDocumentListener(duTexto);
		
		add(txt1);
		
		
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(txt1.getText().trim());
				
			}
		});
		
		add(btn);
	}
	
	private class DocumentTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			
			System.out.println("Inset texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			
			System.out.println("Has borrado texto");
		}
		
	}
	JTextField txt1,txt2;
}







