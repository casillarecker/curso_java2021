package i1_JMenuBar_JMenu_JMenulTem_100;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Procesando_Text_Menus_101 {

	public static void main(String[] args) {
		
		
		MenuProcesadorText marco = new MenuProcesadorText();
		marco.setDefaultCloseOperation(3);
		marco.setTitle("MI TRABAJO EN JAVA 2021");
		marco.setVisible(true);

	}

}

class MenuProcesadorText extends JFrame{
	
	public MenuProcesadorText() {

	Toolkit mipantalla = Toolkit.getDefaultToolkit();
	Dimension tamaPantalla = mipantalla.getScreenSize();
	
	int alturaPantalla = tamaPantalla.height;
	int anchoPantalla = tamaPantalla.width;
	
	setSize(anchoPantalla/2, alturaPantalla/2);
	setLocation(anchoPantalla/4, alturaPantalla/4);
	
	Image iconoAplicacion = mipantalla.getImage("ima/yellow.png");
	setIconImage(iconoAplicacion);
	
	add(new LaminaProceTexto());
	
		
	}
	
}

class LaminaProceTexto extends JPanel{
	
	public LaminaProceTexto() {

		setLayout(new BorderLayout());
		
		panelMenu = new JPanel();
		JMenuBar mibarra = new JMenuBar();
		mibarra.setBackground(Color.GREEN);
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		insert = new JButton("Insertar Texto");
		insert.setBackground(Color.YELLOW);
		
		/*arial = new JMenuItem("Arial");
		
		arial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				area.setFont(new Font("Arial",Font.PLAIN,15));
				
			}
		});
		
		//***************Clase anonima
		courier = new JMenuItem("Courier");
		
		courier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				area.setFont(new Font("Courier",Font.PLAIN, 15));
				
			}
		});
		
		
		//**************************Clase Anonima
		verdana = new JMenuItem("Verdana");
		
		verdana.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setFont(new Font("Cerdana", Font.PLAIN,15));
				
			}
		});
		// Utilizando clase anonima palabras
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		//El menu de fuente o caracte
		
		estilo = new JMenu("Estilo");
		cursiva = new JMenuItem("Cursiva");
		negrita = new JMenuItem("Negrita");
		estilo.add(cursiva);
		estilo.add(negrita);
		
		//El menu de tamaño para cambiar
		
		tamano = new JMenu("Tamaño");
		t15 = new JMenuItem("15");
		t30 = new JMenuItem("30");
		t45 = new JMenuItem("45");
		t60 = new JMenuItem("60");
		tamano.add(t15);
		tamano.add(t30);
		tamano.add(t45);
		tamano.add(t60);*/
		
		//El menu de tamaño para cambiar tamaños...
		
		
		
		//***************************************** Menu de fuente 
		configMenu("Arial", "fuente","Arial",9,10);
		configMenu("Courier", "fuente", "Courier", 9, 10);
		configMenu("Verdana", "fuente", "Verdana", 9, 10);
		
		//****************************************** Menu de estilo
		
		configMenu("Negrita", "estilo", "",Font.BOLD, 15);
		configMenu("Cursiva", "estilo", "", Font.ITALIC, 15);
		
		//****************************************** Menu de tamaño
		
		configMenu("15", "tamano","",9,15);
		configMenu("30", "tamano", "", 9, 30);
		configMenu("45", "tamano", "", 9, 45);
		configMenu("60", "tamano", "", 9, 60);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		panelMenu.add(mibarra);
		//add(insert,BorderLayout.EAST);
		mibarra.add(insert);
		add(panelMenu,BorderLayout.NORTH);
		area = new JTextPane();
		add(area,BorderLayout.CENTER);
		
		
		//*************************************************** Inset tex a area de texto 
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				area.setText("Tengo un lindo corazon para seguir adelante, las capacidades son unicas de una persona para seguir!!!!!");
			}
		});
	}
	
	
	///Aqui hemos creado un clase interna con parametros
	
	public void configMenu(String rotulo,String menu,String tipoTex,int estilos,int tama) {
		
		JMenuItem elem_Menu = new JMenuItem(rotulo);
		elem_Menu.setBackground(Color.CYAN);
		
		if(menu=="fuente") {
			fuente.add(elem_Menu);
		}else if(menu=="estilo") {
			estilo.add(elem_Menu);
		}else if(menu=="tamano") {
			tamano.add(elem_Menu);
		}
		elem_Menu.addActionListener(new EvenEvento(rotulo, tipoTex, estilos, tama));
	}
	
	

	private class EvenEvento implements ActionListener{
		
		String tipTexto , menu;
		int est,tam;

		public EvenEvento(String elem,String txt2,int est2, int tam2) {

			tipTexto=txt2;
			est=est2;
			tam=tam2;
			menu=elem;
		
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto=area.getFont();
			
			if(menu=="Arial" || menu=="Courier" || menu=="Vendana") {
				
				est=texto.getStyle();
				tam=texto.getSize();
				
			}else if(menu=="Cursiva" || menu=="Negrita") {
				
				tipTexto=texto.getFontName();
				tam=texto.getSize();
				
			}else if(menu=="15" || menu=="30" || menu=="45" || menu=="60") {
				
				est=texto.getStyle();
				tipTexto=texto.getFontName();
				
			}
			
			area.setFont(new Font(tipTexto,est,tam));
			System.out.println("Tipo: " + tipTexto + " estilo: " + est + " tamaño: " + tam);
		}
		
		
	}
	

	JButton insert;
	JPanel panelMenu;
	JMenu fuente,estilo,tamano;
	JMenuItem arial,courier,verdana,cursiva,negrita,t15,t30,t45,t60;
	JTextPane area;
	JTextArea mensaje;
	Font texto;
	
}

























