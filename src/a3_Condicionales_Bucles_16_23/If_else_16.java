package a3_Condicionales_Bucles_16_23;

import java.util.Scanner;

public class If_else_16 {
	
	public static void main (String []args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce tu age, please");
		int age=entrada.nextInt();
		if(age<18) {
			System.out.println("Eres adolescente");
		}else if(age<40) {
			System.out.println("Eres joven");
		}else if(age<65) {
			System.out.println("Eres maduro");
		}else {
			System.out.println("You have to take care of yourselt");
		}
		
	}

}
