package e1_Evento_ActionListener_65;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Window_Adapter_69 {

	public static void main(String[] args) {
		
		MarcoAdapter marco = new MarcoAdapter();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Event");

	}
	

}
class MarcoAdapter extends JFrame {
	 
	 public MarcoAdapter() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 addWindowListener(new LaminaAdapter());
	}
	 
}
class LaminaAdapter extends WindowAdapter{
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}