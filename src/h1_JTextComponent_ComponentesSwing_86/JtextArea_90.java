package h1_JTextComponent_ComponentesSwing_86;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JtextArea_90 {

	public static void main(String[] args) {
		MarcoAreaTex marco = new MarcoAreaTex();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Area");
		
	}
	

}
class MarcoAreaTex extends JFrame {
	 
	 public MarcoAreaTex() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaAreaTex laminaLayouts = new LaminaAreaTex();
		 
		 add(laminaLayouts);
		
	}
	 
}


class LaminaAreaTex extends JPanel{
	
	public LaminaAreaTex() {
		
		area = new JTextArea(8,20);
		
		JScrollPane scrollPane = new JScrollPane(area);
		
		area.setLineWrap(true);
		add(scrollPane);
		
		btnEnviar=new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(area.getText());
				
			}
		});
		add(btnEnviar);
	}
	private JButton btnEnviar;
	private JTextArea area ;
}