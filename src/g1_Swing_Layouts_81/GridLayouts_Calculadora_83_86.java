package g1_Swing_Layouts_81;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayouts_Calculadora_83_86 {

	public static void main(String[] args) {
		MarcoGridLayouts marco = new MarcoGridLayouts();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Layouts");
		
	}
	

}
class MarcoGridLayouts extends JFrame {
	 
	 public MarcoGridLayouts() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaGridLayout laminaLayouts = new LaminaGridLayout();
		 
		
		 add(laminaLayouts);
		 //pack();					//Su tamaño fijo de los botones. El método pack lo pone su tamaño fijo;
		
	}
	 
}


class LaminaGridLayout extends JPanel{
	
	public LaminaGridLayout() {
		prin=true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		
		milamina = new JPanel();
		milamina.setLayout(new GridLayout(6,4));
		
		ActionListener i=new ActionBtns();
		ActionListener a=new ActionOrden();
		
		botones("%",a);
		botones("CE",a);
		botones("C",a);
		botones("<",a);
		botones("1/x",a);
		botones("x°",a);
		botones("1/x",a);
		botones("/",a);
		
		botones("7",i);
		botones("8",i);
		botones("9",i);
		botones("*",a);
		
		botones("4",i);
		botones("5",i);
		botones("6",i);
		botones("-",a);
		
		botones("1",i);
		botones("2",i);
		botones("3",i);
		botones("+",a);
		
		botones("+/-",a);
		botones("0",i);
		botones(",",a);
		botones("=",a);
	
		add(milamina,BorderLayout.CENTER);
		ultimoOpe="=";
	}
	
	private void botones (String btns, ActionListener accion) {
		
		JButton button = new JButton(btns);
		button.addActionListener(accion);
		milamina.add(button);
	}
	
	class ActionBtns implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
			

			if(prin) {
				pantalla.setText("");
				prin=false;
			}
			pantalla.setText(pantalla.getText() + entrada);
		}
	}
	
	private class ActionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion=e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimoOpe=operacion;
			prin=true;
			
			
		}
		public void calcular(double x) {
			if(ultimoOpe.equals("+")) {
				resultado+=x;
				System.out.println(resultado);
			}else if(ultimoOpe.equals("-")) {
				resultado-=x;
				System.out.println(resultado);
			}else if(ultimoOpe.equals("*")) {
				resultado*=x;
				System.out.println(resultado);
			}else if(ultimoOpe.equals("/")) {
				resultado/=x;
				System.out.println(resultado);
			}
			else if(ultimoOpe.equals("=")) {
				resultado=x;
			}
			pantalla.setText(""+resultado);
		}
		
	}
	
	private JPanel milamina ;
	private JButton pantalla;
	private boolean prin;
	private double resultado;
	private String ultimoOpe;
}

