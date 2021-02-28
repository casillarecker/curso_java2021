package i1_JMenuBar_JMenu_JMenulTem_100;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenu_100 {

	public static void main(String[] args) {
		MarcoMenus marco = new MarcoMenus();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Menus");
		
	}
	

}
class MarcoMenus extends JFrame {
	 
	 public MarcoMenus() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaJSlider box = new LaminaJSlider();
		 
		 add(box);
		
	}
	 



class LaminaJSlider extends JPanel{
	
	public LaminaJSlider() {
		
		JMenuBar barra = new JMenuBar();
		
		archivo = new JMenu("Archivo");
		item1 = new JMenuItem("Guardar");
		item2 = new JMenuItem("Guardar como");
		
		edicion = new JMenu("Edición");
		item3 = new JMenuItem("Cortar");
		item4 = new JMenuItem("Copiar");
		item5 = new JMenuItem("Pegar");
		
		opciones = new JMenu("Opciónes");
		item8 = new JMenuItem("Canción");
		item9 = new JMenuItem("Deporte");
		
		herramientas = new JMenu("Herramientas");
		item6 = new JMenuItem("Ayuda");
		item7 = new JMenuItem("Buscar");
		
		barra.add(archivo);
		archivo.add(item1);
		archivo.add(item2);
		
		barra.add(edicion);
		edicion.add(item3);
		edicion.add(item4);
		edicion.add(item5);
		edicion.addSeparator();
		
		opciones.add(item8);
		opciones.add(item9);
		edicion.add(opciones);
		
		
		barra.add(herramientas);
		herramientas.add(item6);
		herramientas.add(item7);
		
		add(barra);
		
	}
	}
	private JMenu archivo,edicion,herramientas,opciones;
	private JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9;
}