package i1_JMenuBar_JMenu_JMenulTem_100;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit;

public class Procesando_Text_Menus_106_copia1 {
	
	public static void main(String[] args) {
		MarcoPracticaTextoKitcopia marco = new MarcoPracticaTextoKitcopia();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Windows Menus Practica");
		
	}
	

}
class MarcoPracticaTextoKitcopia extends JFrame {
	 
	 public MarcoPracticaTextoKitcopia() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaPracticaMenuKitcopia box = new LaminaPracticaMenuKitcopia();
		 
		 add(box);
		
	}
	 

}

class LaminaPracticaMenuKitcopia extends JPanel{
	
	public LaminaPracticaMenuKitcopia() {

		
		setLayout(new BorderLayout());
		
		JMenuBar barra = new JMenuBar();
		
		fuente = new JMenu("Fuente");
		
		estilo = new JMenu("Estilo");
		
		tamaño = new JMenu("Tamaño");
	
		
		//***************************************
		
		configuraMenucopia("Arial", "fuente", "Arial",9,15 );
		configuraMenucopia("Courier", "fuente", "Courier",9,15 );
		configuraMenucopia("Verdana", "fuente", "Verdana",9,15);
		//***************************************
		
		configuraMenucopia("Negrita", "estilo", "",Font.BOLD,1);
		configuraMenucopia("Cursiva", "estilo", "",Font.ITALIC,1);
			
							//***************************************
							
		configuraMenucopia("15", "tamaño", "",9,15 );
		configuraMenucopia("30", "tamaño", "",9,30 );
		configuraMenucopia("45", "tamaño", "",9,45 );
		configuraMenucopia("60", "tamaño", "",9,60 );
		
		barra.add(fuente);
		
		barra.add(estilo);
	
		barra.add(tamaño);
		
		
		panelNorte.add(barra);
		add(panelNorte,BorderLayout.NORTH);
		// Hasta todo bien | no discubro falla
		
		miarea = new JTextArea(6,10);
		miarea.setFont(new Font("Serif",Font.PLAIN,15));	
		add(miarea,BorderLayout.CENTER);
		//Esto es de campo de texto o texarea

		
		
		
	}
	public void configuraMenucopia (String rotulo,String menu,String letra,int estilos,int tam) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			fuente.add(elem_menu);
		}else if(menu=="estilo") {
			estilo.add(elem_menu);
		}else if(menu=="tamaño") {
			tamaño.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiar_tamaño",tam));
		}
		
		
	}
	
	private JTextArea miarea;
	private JPanel panelNorte;
	private JMenu fuente,estilo,tamaño;
	private Font letras;

}
