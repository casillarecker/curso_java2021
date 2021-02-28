package b1_POO_27;

public class Coche_28 {

		private int rueda;
		private int largo;			//Modularización de clase: Coche-Coche_main
		private int ancho;
		private int motor;
		private int peso;
		private String color;
		private int peso_total;
		private int peso_plataforma;
		private boolean asientos_cuero , climatizador;
		
		
		public Coche_28() {
			
			rueda=4;
			largo=2000;
			ancho=300;
			motor=1600;
			peso=500;
			peso_plataforma=500;
			
		}

		public String dimeDatosGeneral() {					//GETTER Que devuelve un dato de un clase o para obtener esas propiedades de clase;
			return "la plataforma del vehículo tiene " + rueda + " ruedas" +
				". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm. Y un peso de plataforma de " + peso_plataforma + " kg";
		}
		
		public void establceColor(String color_coche) {				//SETTER  Codificar el dato o cambiar propiedades de clase
			//color="Blue";
			color=color_coche;
		}
		
		public String dimeColor () {
			return "El color del coche es " + color;
		}
		
		public void confuguraAsientos(String asientoCuero) {		//SETTER
			
			if(asientoCuero.equalsIgnoreCase("si")){
				asientos_cuero=true;
			}else {
				asientos_cuero=false;
			}
		}
		
		public String dimeAsientos() {
			if(asientos_cuero==true) {
				return"El coche tiene asiento de cuero";
			}else {
				return"El coche tiene asiento de serie";
			}
		}
		
		public void configuraClimatizador(String climatiza) {	//SETTER
			if(climatiza.equalsIgnoreCase("si")) {
				climatizador=true;
			}else {
				climatizador=false;
			}
			
		}
		
		public String dimeClimatizador() {
			if(climatizador==true) {
				return"El coche incorpora climatizador";
			}else {
				return"El coche lleva aire acondicionado";
			}
		}
		
		public String dimePesoCoche() {			//GETTER + SETTER
			int pesoCarroceria=500;
			
			peso_total=peso_plataforma+pesoCarroceria;
			if(asientos_cuero=true) {
				peso_total=peso_total+50;
			}
			if(climatizador==true) {
				peso_total=peso_total+20;
			}
			return "El peso del coche es " + peso_total;
		}
		
		public int precioCoche () {
			int precioFinal=10000;
			if(asientos_cuero==true) {
				precioFinal+=2000;
			}
			if(climatizador==true) {
				precioFinal+=1500;
			}
			
			return precioFinal;
		}
}
