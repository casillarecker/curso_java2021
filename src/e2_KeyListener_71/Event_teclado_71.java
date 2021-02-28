package e2_KeyListener_71;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Event_teclado_71 {


		public static void main(String[] args) {
			
			MarcokeyListener marco = new MarcokeyListener();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("KeyListener");

		}
		

	}
	class MarcokeyListener extends JFrame {
		 
		 public MarcokeyListener() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 addKeyListener(new LaminaKeylistener());
		}
		 
	}
	class LaminaKeylistener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			int codigo=e.getKeyCode();
			System.out.println(codigo); 			//Para saber su numero de teclados de todas (Para atajos de teclado)
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
			char letra=e.getKeyChar();
			System.out.println(letra);				//Para saber la letra de los teclados (Letras de todas las teclas)
		}

	
		
		
	}