package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class JSpinner_ClassInternaAnonimas_98_99 {

	public static void main(String[] args) {
		MarcoJSpinner marco = new MarcoJSpinner();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JSlider");
		
	}
	

}
class MarcoJSpinner extends JFrame {
	 
	 public MarcoJSpinner() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJSpinner box = new LaminaJSpinner();
		 
		 add(box);
		
	}
	 



class LaminaJSpinner extends JPanel{
	
	public LaminaJSpinner() {
		
		//setLayout(new BorderLayout());
		//String lista[]= {"Enero","febrero","Marzo","Abril","Diciembre"};
		String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		texto=new JLabel("Tengo una linda vida con Dios que no puede cambiar, seguire a Dios");
		
		JSpinner spinner = new JSpinner(new SpinnerDateModel());		//Para fecha y hora
		JSpinner listas = new JSpinner(new SpinnerListModel(lista));
		
		
		
		//******************************Apliacando clases interna o Anonimas todo en uno
		
		JSpinner defecto = new JSpinner(new SpinnerNumberModel(5,0,100,10) {
		
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
		});
		
		
		
		//*************************
		Dimension dimension = new Dimension(50,20);
		defecto.setPreferredSize(dimension);
		listas.setPreferredSize(dimension);
		
		add(defecto);
		add(spinner);
		add(listas);
		
		
	}
	
	/*private class Modelospinner extends SpinnerNumberModel{
		
		public Modelospinner() {

			super(5,0,100,10);
			
			
		}
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}*/

}
	private JLabel texto;

}