package e3_MouseListener_72;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;


public class MouseEvent_72 {

		public static void main(String[] args) {
			
			MarcoMouse marco = new MarcoMouse();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("Windows Event");

		}
		

	}
	class MarcoMouse extends JFrame {
		 
		 public MarcoMouse() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 addMouseListener(new LaminaMouse());
		}
		 
	}
	class LaminaMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			//System.out.println("Has hecho click");
			//System.out.println(e.getClickCount());  //Para saber los click de mouse
			//System.out.println("Coordenada X: " + e.getX() + "Coordenada Y: " + e.getY());
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			//System.out.println("Acabas de entrar a la ventana");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			//System.out.println("Acabas de salir de la ventana");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//System.out.println("Has hecho presionar");
			//System.out.println(e.getModifiersEx());
			//System.out.println(e.getModifiers());
			//System.out.println(e.isAltGraphDown());
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			//System.out.println("Acabas de levantar");
			
		}

		
		
		
	}