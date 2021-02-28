package a2_S_E_Date_Clases_14;

import java.util.Scanner;

public class Scanner_nextline_nextint_14 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce tu name, por favor");
		
		String name_user = entrada.nextLine();
		
		System.out.println("Introduce la edad, por favor");
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + name_user + ". El año viene tendrás " + (edad+1) + " años");
		
		
	}

}
