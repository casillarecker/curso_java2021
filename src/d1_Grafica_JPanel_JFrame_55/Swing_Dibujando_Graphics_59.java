package d1_Grafica_JPanel_JFrame_55;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing_Dibujando_Graphics_59 {

	public static void main(String[] args) {

			MarcoDibujando marco = new MarcoDibujando();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("Dibujando");
		}

	}
	 class MarcoDibujando extends JFrame {
		 
		 public MarcoDibujando() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 add(new LaminaDibujando());
		}
		 
	 }
	 class LaminaDibujando extends JPanel{
		 
		 @Override
		public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
			g.drawRect(50, 50,200,200);
			g.drawLine(100, 100,200,300);
			g.drawArc(300,100,200,200,220,350);
			 
		 } 
	 }