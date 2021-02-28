package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
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

public class JTextField_ComprobandoEmail_87 {

	public static void main(String[] args) {
		MarcoTxtEmail marco = new MarcoTxtEmail();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Layouts");
		
	}
	

}
class MarcoTxtEmail extends JFrame {
	 
	 public MarcoTxtEmail() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminatxtEmail laminaLayouts = new LaminatxtEmail();
		 
		 add(laminaLayouts);
		
	}
	 
}


class LaminatxtEmail extends JPanel{
	
	public LaminatxtEmail() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		resultado=new JLabel("",JLabel.CENTER);				///Poner en medio con jlabel.center
		JLabel texto = new JLabel("Email: ");
		lamina2.add(texto);
		
		txt1=new JTextField(30);
		lamina2.add(txt1);
		add(resultado,BorderLayout.CENTER);
		//System.out.println(txt1.getText().trim());			//trim es para eliminar el espacio
		
		JButton btn = new JButton("Enviar");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int correcto=0;
				String email=txt1.getText().trim();
				
				for(int i=0;i<email.length();i++) {
					if(email.charAt(i)=='@') {
						correcto++;
					}
				}
				
				if(correcto!=1) {
					System.out.println("Incorrecto");
					resultado.setText("Incorrecto");
				}else {
					resultado.setText("Correcto");				
				}
				
			}
		});
		
		lamina2.add(btn);
		add(lamina2,BorderLayout.NORTH);
	}
	JTextField txt1,txt2;
	private JLabel resultado;
}