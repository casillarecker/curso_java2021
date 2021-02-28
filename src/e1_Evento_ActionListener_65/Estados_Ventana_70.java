package e1_Evento_ActionListener_65;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Estados_Ventana_70 {
		public static void main(String[] args) {
			
			MarcoEstado marco = new MarcoEstado();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("Windows Event");

		}
		

	}
	class MarcoEstado extends JFrame {
		 
		 public MarcoEstado() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 addWindowStateListener(new LaminaEstado());
		}
		 
	}
	class LaminaEstado implements WindowStateListener{

		@Override
		public void windowStateChanged(WindowEvent e) {
			
			System.out.println("La ventana ha cambiado de estado");
			//System.out.println(e.getNewState());//Para saber sus estados de manejo.
			if(e.getNewState()==6) {
				System.out.println("La ventana está maximizada");
			}else if(e.getNewState()==0) {
				System.out.println("La ventana en estado normal");
			}else if(e.getNewState()==1) {
				System.out.println("La ventana está minimizada");
			}
			
		}
		
		
	}