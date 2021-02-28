package d2_Fuentes_62;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fuente_62 {


	public static void main(String[] args) {
		
		/*String fuentes=JOptionPane.showInputDialog("Introduce fuente");
		boolean estaFuente=false;
		String []nombreFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); ///<-------------------------------en la Api investigar
		for(String name:nombreFuentes) {
			if(name.equals(fuentes)) {
				estaFuente=true;
			}
		}
		
		if(estaFuente) {
			System.out.println("Fuente instalada");
		}else {
			System.out.println("No está instalada la fuente");
		}*/
		
		MarcoFuente marco = new MarcoFuente();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Fuentes Letra");
	}

}
 class MarcoFuente extends JFrame {
	 
	 public MarcoFuente() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 add(new LaminaFuentes());
		 
	 }
	 
 }
 
 class LaminaFuentes extends JPanel{
	 
	 @Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		Font mi_fuente = new Font("Courier",Font.BOLD,36);
		g2.setFont(mi_fuente);
		g2.setColor(Color.green);
		g2.drawString("Reynaldo casilla", 100, 100);
		
		g2.setFont(new Font("Ariel",Font.ITALIC,17));
		g2.setColor(new Color(125,45,255));
		g2.drawString("Curso de java", 100, 200);
		
	}
 }
 
 
