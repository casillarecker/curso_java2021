package c1_InterfacesClasesInternas_49;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador_II_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj reloj = new Reloj();
		reloj.Marcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
	}

}

class Reloj {
	
	public void Marcha(int intervalo, final Boolean sonido) {
		
		Timer mitemporizador = new Timer(intervalo, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Date ahora=new Date();
				System.out.println("Te pongo la hora cada 5 sg: " + ahora);
				if(sonido) {
				Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		mitemporizador.start();
	}
	
}