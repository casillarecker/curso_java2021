package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class JSlider_I_97 {

	public static void main(String[] args) {
		MarcoJSlider1 marco = new MarcoJSlider1();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JSlider I");
		
	}
	

}
class MarcoJSlider1 extends JFrame {
	 
	 public MarcoJSlider1() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJSlider1 box = new LaminaJSlider1();
		 
		 add(box);
		
	}
	 



class LaminaJSlider1 extends JPanel{
	
	public LaminaJSlider1() {
		setLayout(new BorderLayout());
		rotulo=new JLabel("Te conoce hace mucho tiempo, igual te quiero amorcito");
		add(rotulo,BorderLayout.CENTER);
		
		
		slider = new JSlider(15,60,15);
		slider.setMajorTickSpacing(15);
		slider.setMinorTickSpacing(5);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		slider.addChangeListener(new EventJSlider());
		
		slider.setFont(new Font("Serif", Font.ITALIC,15));
		JPanel panel = new JPanel();
		panel.add(slider);
		add(panel,BorderLayout.NORTH);
		
	}
	
	private class EventJSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			//contador++;
			//System.out.println("Te amo" + slider.getValue());
			
			rotulo.setFont(new Font("Serif",Font.PLAIN,slider.getValue()));
		}
		
	}

}
	private JLabel rotulo;
	private JSlider slider;
	private static int contador;
}