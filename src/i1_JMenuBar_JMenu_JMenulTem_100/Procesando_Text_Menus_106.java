package i1_JMenuBar_JMenu_JMenulTem_100;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;



public class Procesando_Text_Menus_106 {
		public static void main(String[] args) {
			MarcoPracticaTextoKit marco = new MarcoPracticaTextoKit();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("Windows Menus Practica");
			
		}
		

	}
	class MarcoPracticaTextoKit extends JFrame {
		 
		 public MarcoPracticaTextoKit() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 
			 LaminaPracticaMenuKit box = new LaminaPracticaMenuKit();
			 
			 add(box);
			
		}
		 



	class LaminaPracticaMenuKit extends JPanel{
		
		public LaminaPracticaMenuKit() {

			
			setLayout(new BorderLayout());
			
			JMenuBar barra = new JMenuBar();
			
			fuente = new JMenu("Fuente"); 
			
			item1 = new JMenuItem("Arial");
			
			estilo = new JMenu("Estilo");
			
			tamaño = new JMenu("Tamaño");
		
			
			//***************************************
			
			configuraMenu("Arial", "fuente", "Arial",9,15 );
			configuraMenu("Courier", "fuente", "Courier",9,15 );
			configuraMenu("Verdana", "fuente", "Verdana",9,15);
			//***************************************
			
					configuraMenu("Negrita", "estilo", "",Font.BOLD,15);
					configuraMenu("Cursiva", "estilo", "",Font.ITALIC,15);
				
								//***************************************
								
								configuraMenu("15", "tamaño", "",9,15 );
								configuraMenu("30", "tamaño", "",9,30 );
								configuraMenu("45", "tamaño", "",9,45 );
								configuraMenu("60", "tamaño", "",9,60 );
			
			panelNorte = new JPanel();
			
			barra.add(fuente);
			
			barra.add(estilo);
		
			barra.add(tamaño);
			
			
			panelNorte.add(barra);
			add(panelNorte,BorderLayout.NORTH);
			
			texto = new JTextArea(6,10);
			texto.setFont(new Font("Serif",Font.PLAIN,15));
			
			//JScrollPane pane = new JScrollPane(texto);
			texto.setLineWrap(true);
			
			
			add(texto,BorderLayout.CENTER);
			
			panelMuestra = new JPanel();
			
			label = new JLabel();
			label.setBorder(null);
			label.getSize();
			panelMuestra.add(label);
			add(panelMuestra,BorderLayout.EAST);
		
			
			
			
		}
		public void configuraMenu (String rotulo,String menu,String letra,int estilos,int tam) {
			
			JMenuItem elem_menu = new JMenuItem(rotulo);
			if(menu=="fuente") {
				fuente.add(elem_menu);
			}else if(menu=="estilo") {
				estilo.add(elem_menu);
			}else if(menu=="tamaño") {
				tamaño.add(elem_menu);
				
				elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("camno_tex",tam));
			}
			
			elem_menu.addActionListener(new GestionEvent(rotulo,letra, estilos, tam));
			
		}
		
		private class GestionEvent implements ActionListener{
			
			String tipo_txt , menu;
			
			int estilo_txt,Tam_letra;

			public GestionEvent(String elem2,String txt2, int esti2,int tam2) {
				
				tipo_txt=txt2;
				estilo_txt=esti2;
				Tam_letra=tam2;
				menu=elem2;
				
				
				
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				letras=texto.getFont();
				
				if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {
					estilo_txt=letras.getStyle();
					
					Tam_letra=letras.getSize();
				}else if(menu=="Cursiva" || menu=="Negrita") {
					
					if(letras.getStyle()==1 || letras.getStyle()==2) {
						estilo_txt=3;
					}
					
					tipo_txt=letras.getFontName();
					Tam_letra=letras.getSize();
				}else if(menu=="15" || menu=="30" || menu=="45"|| menu=="60") {
					estilo_txt=letras.getStyle();
					tipo_txt=letras.getFontName();
				}
				
				texto.setFont(new Font(tipo_txt, estilo_txt,Tam_letra));
				System.out.println("Tipo: " + tipo_txt + " estilo: " + estilo_txt + " tamaño: " + Tam_letra);
			}
			
		}

		}
		private JLabel label;
		private JTextArea texto;
		private JPanel panelNorte,panelMuestra;
		private JMenu fuente,estilo,tamaño,opciones;
		private JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9;
		private Font letras;
	}