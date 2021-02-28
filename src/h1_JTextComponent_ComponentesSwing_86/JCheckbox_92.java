package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JCheckbox_92 {

	public static void main(String[] args) {
		MarcoChecBox marco = new MarcoChecBox();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows CheckBox");
		
	}
	

}
class MarcoChecBox extends JFrame {
	 
	 public MarcoChecBox() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaChecBox box = new LaminaChecBox();
		 
		 add(box);
		
	}
	 
}


class LaminaChecBox extends JPanel{
	
	public LaminaChecBox() {
		setLayout(new BorderLayout());
		
		Font letra = new Font("Sefif",Font.PLAIN,20);
		texto = new JLabel("Donde tu vas, yo voy contigo mi love");
		texto.setFont(letra);
		JPanel laminatex = new JPanel();
		laminatex.add(texto);
		add(laminatex,BorderLayout.CENTER);
				
		chec1=new JCheckBox("Negrita");
		chec2=new JCheckBox("Cursiva");
		chec1.addActionListener(new ManejoChecks());
		chec2.addActionListener(new ManejoChecks());
		
		JPanel laminachec= new JPanel();
		laminachec.add(chec1);
		laminachec.add(chec2);
		add(laminachec,BorderLayout.SOUTH);
		
	}
	
	private class ManejoChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int tipo=0;
			
			if(chec1.isSelected()) tipo+=Font.BOLD;
			if(chec2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif",tipo,24));
			
		}
		
	}
	
	
	private JLabel texto;
	private JCheckBox chec1,chec2;
}
























