package c1_InterfacesClasesInternas_49;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador_53 {

	public static void main(String[] args) {
		
		
		
		Timer mitemporizador = new Timer(5000,new ActionListener() {
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date ahora=new Date();
				System.out.println("Te pongo la hora cada 5 sg: " + ahora);
				Toolkit.getDefaultToolkit().beep();
			}
		});
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);

	}

}
