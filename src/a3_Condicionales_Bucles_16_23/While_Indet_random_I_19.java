package a3_Condicionales_Bucles_16_23;

import java.util.Scanner;

public class While_Indet_random_I_19 {

	public static void main(String[] args) {
		
		int aletorio = (int)(Math.random()*200);
		Scanner entrada = new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while(numero!=aletorio) {
			intentos++;
			System.out.println("Introduce un n�mero, por favor");
			numero=entrada.nextInt();
			if(aletorio<numero) {
				System.out.println("M�s bajo");
			}else if(aletorio>numero) {
				System.out.println("M�s alto");
			}
		}

		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
	}

}
