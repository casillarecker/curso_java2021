package b1_POO_27;

import java.util.Date;

public class Uso_STATIC_37 {

	public static void main(String[] args) {

		
		EmpleadosStatic [] misEmpleado = new EmpleadosStatic[6];
		
		misEmpleado[0]=new EmpleadosStatic("Reynaldo");
		misEmpleado[1]=new EmpleadosStatic("Carmen");
		misEmpleado[2]=new EmpleadosStatic("Marlene");
		misEmpleado[3]=new EmpleadosStatic("Vilma");
		misEmpleado[4]=new EmpleadosStatic("Roxana");
		misEmpleado[5]=new EmpleadosStatic("Amanda");
		
		misEmpleado[2].CambiarSeccion("Amor");

		
		for(EmpleadosStatic e:misEmpleado) {
			System.out.println(e.devuelveDatos());
		}
	}

}

class EmpleadosStatic{
	
	public EmpleadosStatic(String nom) {
		
		nombre=nom;
		seccion="Adminitración";
		Id=1;
		
		
	}
	
	public void CambiarSeccion (String seccio) {	//setter
		seccion=seccio;
	}

	
	public String devuelveDatos() {
		return "La id= " + (Id++) + " El nombre es: " + nombre + " y la sección es " + seccion;
	}
	
	public Date dameFechaContrato() {
		return AltaContrato;
	}
	
	
	
	private final String nombre;   //Esto variable final es constante para no cambiar nombre 
	private static int Id;			//Para no tener copia de id en cada campo sino compartir la id.
	private Date AltaContrato;
	private String seccion;
}