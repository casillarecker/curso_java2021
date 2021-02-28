package h1_JTextComponent_ComponentesSwing_86;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JComboBox_Item_95 {

	public static void main(String[] args) {
		MarcoJComboBox marco = new MarcoJComboBox();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows JComboBox");
		
	}
	

}
class MarcoJComboBox extends JFrame {
	 
	 public MarcoJComboBox() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJComboBox box = new LaminaJComboBox();
		 
		 add(box);
		
	}
	 



class LaminaJComboBox extends JPanel{
	
	public LaminaJComboBox() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("Tengo una linda vida con Dios que no puede cambiar, seguire a Dios");
		add(texto,BorderLayout.CENTER);
		texto.setFont(new Font("Serif",Font.PLAIN,15));
		add(texto,BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		combo = new JComboBox();
		combo.setEditable(true);		//Para ser editar el combo
		combo.addItem("Serif");
		combo.addItem("SansSerif");
		combo.addItem("Monospaced");
		combo.addItem("Dialog");
		EventCombo comboxs = new EventCombo();
		combo.addActionListener(comboxs);
		panel.add(combo);
		add(panel,BorderLayout.NORTH);
		
	}
	
	private class EventCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,15));
		}
		
	}
	
}
	private JLabel texto;
	private JRadioButton rbtn1,rbtn2,rbtn3,rbtn4,rbtn5;
	private ButtonGroup group,group1;
	private JComboBox combo;
}