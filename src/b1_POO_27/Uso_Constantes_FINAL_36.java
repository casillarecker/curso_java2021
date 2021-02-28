package b1_POO_27;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Constantes_FINAL_36 {

	public static void main(String[] args) {

		///Declaracion de array
		Empleados2 [] misEmpleado = new Empleados2[3];
		
		misEmpleado[0]=new Empleados2("Reynaldo");
		misEmpleado[1]=new Empleados2("Carmen");
		misEmpleado[2]=new Empleados2("Marlene");
		
		misEmpleado[2].CambiarSeccion("Amor");

		
		//-----------------------------------Blucle For mejorada
		
		for(Empleados2 e:misEmpleado) {
			System.out.println(e.devuelveDatos());
		}
	}

}

class Empleados2{
	
	public Empleados2(String nom) {
		
		nombre=nom;
		seccion="Adminitración";
		
		
	}
	
	public void CambiarSeccion (String seccio) {	//setter
		seccion=seccio;
	}

	
	public String devuelveDatos() {
		return "El nombre es: " + nombre + " y la sección es " + seccion;
	}
	
	public Date dameFechaContrato() {
		return AltaContrato;
	}
	
	
	
	private final String nombre;   //Esto variable final es constante para no cambiar nombre 
	private double sueldo;
	private Date AltaContrato;
	private String seccion;
}
