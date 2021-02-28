package d1_Grafica_JPanel_JFrame_55;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Color_Dibujando_Graphics2D_61 {


	public static void main(String[] args) {
		MarcoColor marco = new MarcoColor();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Escribiendo 2D Color");
	}

}
 class MarcoColor extends JFrame {
	 
	 public MarcoColor() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 LaminaColor laminaColor = new LaminaColor();
		 add(laminaColor);
		 //laminaColor.setBackground(SystemColor.window);
		 laminaColor.setBackground(Color.PINK);
		 
	}
	 
 }
 class LaminaColor extends JPanel{
	 
	 
		 
		 @Override
		public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
			
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rectangulo = new Rectangle2D.Double(130,120,200,210);
		g2.setPaint(new Color(0,145,255).brighter().brighter().brighter().darker());
		g2.fill(rectangulo);
		
		Ellipse2D ellipse2d = new Ellipse2D.Double();
		ellipse2d.setFrame(rectangulo);
		g2.setPaint(Color.GREEN);
		g2.fill(ellipse2d);
		
		g2.draw(new Line2D.Double(100,100,400,350));
		
		double centroX=rectangulo.getCenterX();
		double centroY=rectangulo.getCenterY();
		double radio=210;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);
			 
		 } 
	 }