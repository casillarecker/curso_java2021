package d1_Grafica_JPanel_JFrame_55;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanel_Escribiendo_58 {


		public static void main(String[] args) {
			MarcoEscribiendo marco = new MarcoEscribiendo();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("Escribiendo");
		}

	}
	 class MarcoEscribiendo extends JFrame {
		 
		 public MarcoEscribiendo() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 add(new Lamina());
		}
		 
	 }
	 class Lamina extends JPanel{
		 
		 @Override
		public void paintComponent(Graphics g) {
			
			g.drawString("Estamos aprendiendo Swing", 2, 20);
			 
		 } 
	 }