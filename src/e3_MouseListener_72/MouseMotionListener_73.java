package e3_MouseListener_72;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseMotionListener_73 {

	public static void main(String[] args) {
		
		MarcoMouseMotionListener marco = new MarcoMouseMotionListener();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("MouseMotionListener");

	}
	

}
class MarcoMouseMotionListener extends JFrame {
	 
	 public MarcoMouseMotionListener() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 addMouseMotionListener(new LaminaMouseMotionListener());
	}
	 
}
class LaminaMouseMotionListener implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Esta arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Coordenada X: " + e.getX() + "Coordenada Y: " + e.getY() );
		
	}
	
}