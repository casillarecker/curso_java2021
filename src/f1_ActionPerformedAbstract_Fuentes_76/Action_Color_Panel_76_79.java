package f1_ActionPerformedAbstract_Fuentes_76;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Action_Color_Panel_76_79 {

	public static void main(String[] args) {
		
		MarcoFuente marco = new MarcoFuente();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Fondo Color");
		//*******************
		
		/*MarcoFuente mar2 = new MarcoFuente();
		mar2.setDefaultCloseOperation(2);
		mar2.setVisible(true);*/
	}
	

}
class MarcoFuente extends JFrame {
	 
	 public MarcoFuente() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 add(new LaminaFuente());
	}
	 
}


class LaminaFuente extends JPanel{
	
		public LaminaFuente() {
			AccionColor colorYellow = new AccionColor("Yellow",new ImageIcon("ima/yellow.png"), Color.yellow);
			AccionColor colorBlue = new AccionColor("Blue",new ImageIcon("ima/blue.png"), Color.blue);
			AccionColor colorRed = new AccionColor("Red",new ImageIcon("ima/red.png"), Color.red);
			
			add(new JButton(colorYellow));
			add(new JButton(colorBlue));
			add(new JButton(colorRed));
			
			InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
			mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_yellow");
			mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_blue");
			mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_red");
			ActionMap actionMap = getActionMap();
			actionMap.put("fondo_yellow", colorYellow);
			actionMap.put("fondo_blue", colorBlue);
			actionMap.put("fondo_red", colorRed);
			
		}
		private JButton btn1,btn2,btn3,btn4;
	

		private class AccionColor extends AbstractAction{
	
			public AccionColor(String nombre,Icon icono,Color btnolor) {
		
		putValue(Action.NAME, nombre);
		putValue(Action.SMALL_ICON, icono);
		putValue(Action.SHORT_DESCRIPTION,"El color que va poner es " + nombre);
		putValue("color_fondo", btnolor);
		}
			
			@Override
		public void actionPerformed(ActionEvent e) {
		
		Color c=(Color)getValue("color_fondo");
		setBackground(c);
		System.out.println("Nombre: " + getValue(Action.NAME)+ " descripción: " + getValue(Action.SHORT_DESCRIPTION));
	}
	
}
}

