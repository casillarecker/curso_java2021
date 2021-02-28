package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextArea_II_91 {

	public static void main(String[] args) {
		MarcoAreaTexII marco = new MarcoAreaTexII();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Area");
		
	}
	

}
class MarcoAreaTexII extends JFrame {
	 
	 public MarcoAreaTexII() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 setLayout(new BorderLayout());
		 
		 laminasbtns=new JPanel();
		 btnInsertar=new JButton("Insertar");
		 btnInsertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				area.append("Esto un lindo lugar para la cita con la Vilma.");
			}
		});
		 
		 laminasbtns.add(btnInsertar);
		 
		 btnSalLinea = new JButton("Salto Línea");
		 btnSalLinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean saltar=!area.getLineWrap();
				area.setLineWrap(saltar);
				
				/*if(saltar==true) {
					btnSalLinea.setText("Quitar salto");
				}else {
					btnSalLinea.setText("Salto linea");
				}*/
				
				btnSalLinea.setText(saltar? "Quitar salto" : "Salto Línea");
			}
		});
		 laminasbtns.add(btnSalLinea);
		 add(laminasbtns,BorderLayout.SOUTH);
		 
		 area=new JTextArea(4,10);
		 laminaStroll=new JScrollPane(area);
		 add(laminaStroll,BorderLayout.CENTER);
	}
	 

	private JButton btnInsertar,btnSalLinea;
	private JTextArea area ;
	private JPanel laminasbtns;
	private JScrollPane laminaStroll;
	
}