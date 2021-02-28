package a3_Condicionales_Bucles_16_23;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Switch_17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una Opci�n: \n1: Cuardrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El �rea del cuadrado es " + Math.pow(lado, 2));
			break;
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El �rea del rect�ngulo es " + base*altura);
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El �rea del tri�ngulo es " + (base*altura)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El �rea de c�rculo es ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opci�n elig�do no se encuentra");
		}

	}

}
