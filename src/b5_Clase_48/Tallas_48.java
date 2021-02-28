package b5_Clase_48;

import java.util.Scanner;

public class Tallas_48 {
	
	//enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		
		private Talla(String Abreviatura) {
			
			this.Abreviatura=Abreviatura;
		}
		
		public String dameAbreviatura() {
			return Abreviatura;
		}
		private String Abreviatura;
	}
	

	public static void main(String[] args) {
		
		/*String talla;
		talla="Pequeña";
		talla="Mediano";
		talla="grande";
		talla="Muy Grande";
		talla="Azul";
		
		
		Talla s=Talla.MINI;
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba un talla: MINI,MEDIANO,GRANDE,MUY_GRNADE");
		
		String entradaDatos = scanner.next().toUpperCase();
		
		Talla la_talla=Enum.valueOf(Talla.class,entradaDatos);
		
		System.out.println("Talla= " + la_talla);
		
		System.out.println("Abreaviatura = " + la_talla.Abreviatura);
		
	}

}
