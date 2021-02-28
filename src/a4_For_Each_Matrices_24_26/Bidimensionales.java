package a4_For_Each_Matrices_24_26;

public class Bidimensionales {

	public static void main(String[] args) {

		int [] [] matrix = new int[4][5];
		
		matrix [0][0]=15;
		matrix [0][1]=36;
		matrix [0][2]=85;
		matrix [0][3]=96;
		matrix [0][4]=22;
		
		matrix [1][0]=45;
		matrix [1][1]=25;
		matrix [1][2]=44;
		matrix [1][3]=33;
		matrix [1][4]=87;
		
		matrix [2][0]=56;
		matrix [2][1]=75;
		matrix [2][2]=42;
		matrix [2][3]=89;
		matrix [2][4]=32;
		
		matrix [3][0]=25;
		matrix [3][1]=63;
		matrix [3][2]=20;
		matrix [3][3]=58;
		matrix [3][4]=45;
		
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

	}

}
