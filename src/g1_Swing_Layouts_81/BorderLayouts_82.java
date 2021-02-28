package g1_Swing_Layouts_81;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayouts_82 {

	public static void main(String[] args) {
		MarcoLayoutBorder marco = new MarcoLayoutBorder();
		marco.setDefaultCloseOperation(3);
		marco.setVisible(true);
		//marco.setResizable(false);
		marco.setTitle("Windows Layouts");
		
	}
	

}
class MarcoLayoutBorder extends JFrame {
	 
	 public MarcoLayoutBorder() {
		
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 int alturaPantalla=tamanoPantalla.height;
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2,alturaPantalla/2);
		 setLocation(anchoPantalla/4,alturaPantalla/4);
		 
		 Image icono = mipantalla.getImage("ima/blue.png");
		 setIconImage(icono);
		 
		 LaminaLayoutsBorder laminaLayouts = new LaminaLayoutsBorder();
		 LaminaLayout layoutsa = new LaminaLayout();
		 add(layoutsa,BorderLayout.NORTH);
		
		 add(laminaLayouts);
		
	}
	 
}


class LaminaLayoutsBorder extends JPanel{
	
	public LaminaLayoutsBorder() {
		
		setLayout(new BorderLayout(15,15));
		add(new JButton("Yellow"),BorderLayout.NORTH);
		add(new JButton("Blue"),BorderLayout.SOUTH);
		add(new JButton("Red"),BorderLayout.WEST);
		add(new JButton("Green"),BorderLayout.EAST);
		add(new JButton("Black"),BorderLayout.CENTER);
	}
	
}

class LaminaLayout extends JPanel{
	
	public LaminaLayout() {

		setLayout(new BorderLayout());
		add(new JButton("Red"),BorderLayout.WEST);
		add(new JButton("Green"),BorderLayout.EAST);
		add(new JButton("Black"),BorderLayout.CENTER);
		
	}
}




























