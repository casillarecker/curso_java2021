package d1_Grafica_JPanel_JFrame_55;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing_Dibujando_Graphics2D_II_60 {


	public static void main(String[] args) {
		MarcoEscribiendo2 marco = new MarcoEscribiendo2();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Escribiendo 2D");
	}

}
 class MarcoEscribiendo2 extends JFrame {
	 
	 public MarcoEscribiendo2() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 add(new LaminaDibujando2());
	}
	 
 }
 class LaminaDibujando2 extends JPanel{
		 
		 @Override
		public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
			
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rectangulo = new Rectangle2D.Double(130,120,200,210);
		g2.draw(rectangulo);
		
		Ellipse2D ellipse2d = new Ellipse2D.Double();
		ellipse2d.setFrame(rectangulo);
		g2.draw(ellipse2d);
		
		g2.draw(new Line2D.Double(100,100,400,350));
		
		double centroX=rectangulo.getCenterX();
		double centroY=rectangulo.getCenterY();
		double radio=210;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
		g2.draw(circulo);
			 
		 } 
	 }
 