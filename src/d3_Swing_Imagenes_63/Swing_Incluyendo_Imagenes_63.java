package d3_Swing_Imagenes_63;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing_Incluyendo_Imagenes_63 {



	public static void main(String[] args) {
		MarcoImagenes marco = new MarcoImagenes();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		marco.setResizable(false);
		marco.setTitle("Manejo de imagenes");
	}

}
 class MarcoImagenes extends JFrame {
	 
	 public MarcoImagenes() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 add(new LaminaImagenes());
	}
	 
 }
 class LaminaImagenes extends JPanel{
		 
		 @Override
		public void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		try {
			imagen=ImageIO.read(new File("ima/red.png"));	
		} catch (Exception e) {
			System.out.println("La imagen no se encuentra");
		}
		//Cuando no sabes las dimenciones de los images
		
		int anchoImage=imagen.getWidth(this);
		int alturaImage=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		///Sabiendo el ancho y el alto
		for(int i=0;i<90;i++) {
			for(int j=0;j<80;j++) {
				if(i+j>0) {  //Para que no empieze desde cero o una imagen encima;
				//g.copyArea(0, 0, 15, 15, 15*i, 15*j);
				g.copyArea(0, 0, anchoImage, alturaImage, anchoImage*i, alturaImage*j);//<---------Eso cuando no sabes el tamaño del imagen
			}
			}
		}
		
		
			 
		 } 
		 private Image imagen;
	 }