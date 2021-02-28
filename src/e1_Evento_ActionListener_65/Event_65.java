package e1_Evento_ActionListener_65;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Event_65 {

	public static void main(String[] args) {

			MarcoEvent marco = new MarcoEvent();
			marco.setDefaultCloseOperation(3);
			marco.setVisible(true);
			marco.setResizable(false);
			marco.setTitle("Manejo Event");
		}

	}
	 class MarcoEvent extends JFrame {
		 
		 public MarcoEvent() {
			
			 Toolkit mipantalla = Toolkit.getDefaultToolkit();
			 Dimension tamanoPantalla = mipantalla.getScreenSize();
			 int alturaPantalla=tamanoPantalla.height;
			 int anchoPantalla=tamanoPantalla.width;
			 
			 setSize(anchoPantalla/2,alturaPantalla/2);
			 setLocation(anchoPantalla/4,alturaPantalla/4);
			 
			 Image icono = mipantalla.getImage("ima/blue.png");
			 setIconImage(icono);
			 add(new LaminaEvent());
		}
		 
	 }
	 class LaminaEvent extends JPanel implements ActionListener{
		 
			 public LaminaEvent() {
				
				btn1 = new JButton("Green");
				add(btn1);
				btn1.addActionListener(this);
				
				btn3 = new JButton("Blue");
				add(btn3);
				btn3.addActionListener(this);
				
				btn2 = new JButton("Yellow");
				add(btn2);
				btn2.addActionListener(this);
			}
			 
			 @Override
			public void actionPerformed(ActionEvent e) {
				
				 if(btn1==e.getSource()) {
					 setBackground(Color.green);
				 }else if(btn2==e.getSource()) {
					 setBackground(Color.YELLOW);
				 }else if(btn3==e.getSource()) {
					 setBackground(Color.blue);
				 }
			
			}
		 
		 JButton btn1,btn2,btn3;
		 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 