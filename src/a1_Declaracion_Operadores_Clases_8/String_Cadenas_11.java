package a1_Declaracion_Operadores_Clases_8;

public class String_Cadenas_11 {

	public static void main(String[] args) {


		/*	M�todos (M�s usados) de la clase String para manepulaci�n de cadenas de texto
		 * 
		 * 	.length()	: Devuelve la longitud de una cadena de caracteres
		 * 	.charAt(n)	: Devuelve la posici�n de un car�cter dentro de una cadena. (Las posiciones empiezan a contar de 0)
		 * 	.substring(x,y)		: Devuelve una sudcadena dentro de la cadena, siendo X el car�cter a partir del cu�l se extrae e Y el n� de caracteres que se quieren extraer.
		 * 	.equals(cadena)		: devuelve true si dos cadenas que se camparan son iguales y false si no lo son. Distingue may�sculas y min�sculas.
		 * 	.equalsIgnoreCase(cadena)	:Igual que el anterior pero sin tener en cuenta may�sculas y man�sculas.
		 * 
		 * */

		String nombre = "Reynaldo";
		
		System.out.println("Mi nombre es: " + nombre);
		
		System.out.println("My name have " + nombre.length() + " letras.");
		System.out.println("The first letra from " + nombre + " es la " + nombre.charAt(0));
		
		
		int ultimo_letter;
		ultimo_letter = nombre.length();
		System.out.println("And the �ltimo letter is the " + nombre.charAt(ultimo_letter-1));
	}

}
