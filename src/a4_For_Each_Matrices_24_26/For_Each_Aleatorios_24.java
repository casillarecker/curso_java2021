package a4_For_Each_Matrices_24_26;

public class For_Each_Aleatorios_24 {

	public static void main(String[] args) {

		int[]matriz_aleatorios=new int[120];
		for(int i=0;i<matriz_aleatorios.length;i++) {
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		for(int numeros:matriz_aleatorios) {
			System.out.print(numeros + " ");
		}
	}

}
