package a1_Declaracion_Operadores_Clases_8;

public class String_Cadenas_11 {

	public static void main(String[] args) {


		/*	Métodos (Más usados) de la clase String para manepulación de cadenas de texto
		 * 
		 * 	.length()	: Devuelve la longitud de una cadena de caracteres
		 * 	.charAt(n)	: Devuelve la posición de un carácter dentro de una cadena. (Las posiciones empiezan a contar de 0)
		 * 	.substring(x,y)		: Devuelve una sudcadena dentro de la cadena, siendo X el carácter a partir del cuál se extrae e Y el n° de caracteres que se quieren extraer.
		 * 	.equals(cadena)		: devuelve true si dos cadenas que se camparan son iguales y false si no lo son. Distingue mayúsculas y minúsculas.
		 * 	.equalsIgnoreCase(cadena)	:Igual que el anterior pero sin tener en cuenta mayúsculas y manúsculas.
		 * 
		 * */

		String nombre = "Reynaldo";
		
		System.out.println("Mi nombre es: " + nombre);
		
		System.out.println("My name have " + nombre.length() + " letras.");
		System.out.println("The first letra from " + nombre + " es la " + nombre.charAt(0));
		
		
		int ultimo_letter;
		ultimo_letter = nombre.length();
		System.out.println("And the último letter is the " + nombre.charAt(ultimo_letter-1));
	}

}
