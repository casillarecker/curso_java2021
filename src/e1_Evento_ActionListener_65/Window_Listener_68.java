package e1_Evento_ActionListener_65;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window_Listener_68 {

	public static void main(String[] args) {

			MarcoWindowEvent marco = new MarcoWindowEvent();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			//marco.setResizable(false);
			marco.setTitle("Windows Event");
			
			//******************
			MarcoWindowEvent2 miventana2 = new MarcoWindowEvent2();
			miventana2.setDefaultCloseOperation(2);
			miventana2.setTitle("Ventana 2 ");
			miventana2.setVisible(true);
			
		}

	}
	 class MarcoWindowEvent extends JFrame {
		 
		 public MarcoWindowEvent() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 addWindowListener(new LaminaWindowEvent());
		}
		 
	 }
	 class MarcoWindowEvent2 extends JFrame {
		 
		 public MarcoWindowEvent2() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/3,alturaPantalla/2);
			 setLocation(anchoPantalla/3,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 addWindowListener(new LaminaWindowEvent());
		}
		 
	 }
	 
	 
	 class LaminaWindowEvent implements WindowListener{
		 


		@Override
		public void windowActivated(WindowEvent e) {
			
			System.out.println("Ventana activada");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("Ventana ha sido cerrada");
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Ventana cerrada");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Ventana desactivada");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Ventana restaurada");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("Ventana minimizada");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("Ventana abierta");
			
		}
			 
		
			
				 
			 
	 }