package a3_Condicionales_Bucles_16_23;

import java.util.Scanner;

public class Do_while_20 {

	public static void main(String[] args) {

		int aletorio = (int)(Math.random()*200);
		Scanner entrada = new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		do{
			intentos++;
			System.out.println("Introduce un número, por favor");
			numero=entrada.nextInt();
			if(aletorio<numero) {
				System.out.println("Más bajo");
			}else if(aletorio>numero) {
				System.out.println("Más alto");
			}
		}while(numero!=aletorio);

		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
	}
		

}
