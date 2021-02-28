package e4_WindowsFocusListener_74;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Foco_Gmail_74 {

	public static void main(String[] args) {
		
		MarcoFocus marco = new MarcoFocus();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Focus");
		//*******************
		
		MarcoFocus mar2 = new MarcoFocus();
		mar2.setDefaultCloseOperation(2);
		mar2.setVisible(true);
	}
	

}
class MarcoFocus extends JFrame {
	 
	 public MarcoFocus() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 add(new LaminaFielTex());
	}
	 
}


class LaminaFielTex extends JPanel{
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setLayout(null);
		txt1=new JTextField();
		txt2=new JTextField();
		txt1.setBounds(120, 10, 150, 20);
		txt2.setBounds(120, 50, 150, 20);
		add(txt1);
		add(txt2);
		
		LaminaFocus focus = new LaminaFocus();
		txt1.addFocusListener(focus);
	}
	class LaminaFocus implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
			//System.out.println("Esta arrastrando");
		}

		@Override
		public void focusLost(FocusEvent e) {
			String gmail = txt1.getText();
			boolean comprobando=false;
			
			for(int i=0;i<gmail.length();i++) {
				if(gmail.charAt(i)=='@') {
					comprobando=true;
				}
			}
			
			if(comprobando) {
				System.out.println("Correcto");
			}else {
				System.out.println("No es correcto");
			}
			
		}
		
	}
	
	

JTextField txt1,txt2;
}











