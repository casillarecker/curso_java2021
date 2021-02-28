package a1_Declaracion_Operadores_Clases_8;

public class Math_Cálculos_9_10 {

	public static void main(String[] args) {
		
		/*	clase Math
		 * 
		 * 	Math.sqrt(n)	:	Raiz cuadrada de un número
		 * 	Math.pow(base,exponente)	:	Potencia de una numero. Base y exponenete son doubles
		 * 	Math.sin(ángulo).Math.cos(ángulo).Math.tan(ángulo).Math.atan(ángulo)
		 * 	Math.round(decimal)	:	Redondeo de una número
		 *	Math.PI	:	Constante de clase con el número PI. Trinometria <-- Uso
		 * */
		
		double raiz = Math.sqrt(9);		//sirve para raiz cuadradas 
		System.out.println(raiz);
		
		
		
		double nu1=5.85;
		int resultado=(int)Math.round(nu1);		//Sirve para redondear los numeros
		System.out.println(resultado);
		
		
		
		double base = 5;	//Sirve para elevar un número una potencia
		double exponente=3;
		int resul=(int)Math.pow(base, exponente);
		System.out.println("El resuldato de " + base + " elevado a " + exponente + " es " + resul);
		
		
	}

}
