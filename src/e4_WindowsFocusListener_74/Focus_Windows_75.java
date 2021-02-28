package e4_WindowsFocusListener_74;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Focus_Windows_75 extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		
		Focus_Windows_75 windows_75 = new Focus_Windows_75();
		windows_75.iniciar();
		
	}
	
	public void iniciar() {
		ventan2 = new Focus_Windows_75();
		ventan2.setDefaultCloseOperation(3);
		ventan2.setVisible(true);
		ventan2.setResizable(false);
		//*******************
		
		ventan1 = new Focus_Windows_75();
		ventan1.setDefaultCloseOperation(2);
		ventan1.setVisible(true);
	
		ventan1.setBounds(200,30,500, 600);
		ventan2.setBounds(1200,30,500,600);
		ventan1.addWindowFocusListener(this);
		ventan2.addWindowFocusListener(this);
	}
	

	@Override
	public void windowGainedFocus(WindowEvent e) {
	
		if(e.getSource()==ventan1) {
			ventan1.setTitle("Tengo el foco!!");
		}else {
			ventan2.setTitle("Tengo el foco!!");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if(e.getSource()==ventan1) {
			ventan1.setTitle("");
		}else {
			ventan2.setTitle("");
		}
	}
		
	 
	Focus_Windows_75 ventan1;
	Focus_Windows_75 ventan2;
}


