package a4_For_Each_Matrices_24_26;

public class For_Each_Bidimencionales_26 {

	public static void main(String[] args) {
		

		int [] [] matrix = {
				{12,45,68,65,85},
				{47,55,32,12,66},
				{41,25,23,36,55},
				{21,27,89,99,32}
		};
		
		
		
		/*for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}*/
		
		
		for(int []fila:matrix) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z + " ");
			}
		}
		
	}

}
