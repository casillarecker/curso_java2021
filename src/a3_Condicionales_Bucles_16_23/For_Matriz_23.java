package a3_Condicionales_Bucles_16_23;

public class For_Matriz_23 {

	public static void main(String[] args) {
		
		/*int [] mi_matriz = new int [5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=45;
		mi_matriz[2]=23;
		mi_matriz[3]=63;
		mi_matriz[4]=89;*/
		
		//System.out.println(mi_matriz[3]);  	//Otra forma de impremir en la pantalla.
		
		int[]mi_matriz= {5,45,23,63,89,45,12,36,24,24,24,24,54,57,58,998,778,98,88,59,6,41,2,3,};
		
		for( int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("Valor del índice " + i + " = " +  mi_matriz[i]);
		}
	}

}
