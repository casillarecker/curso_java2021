package b1_POO_27;

import java.util.Date;

public class Metódos_STATIC_Sobrecarga_Contructores_38 {

	public static void main(String[] args) {

		
		EmpleadosStaticMetodos2 [] misEmpleado = new EmpleadosStaticMetodos2[9];
		
		misEmpleado[0]=new EmpleadosStaticMetodos2("Reynaldo");
		misEmpleado[1]=new EmpleadosStaticMetodos2("Carmen");
		misEmpleado[2]=new EmpleadosStaticMetodos2("Marlene");
		misEmpleado[3]=new EmpleadosStaticMetodos2("Vilma");
		misEmpleado[4]=new EmpleadosStaticMetodos2("Roxana");
		misEmpleado[5]=new EmpleadosStaticMetodos2("Amanda");
		misEmpleado[6]=new EmpleadosStaticMetodos2("Vilma");
		misEmpleado[7]=new EmpleadosStaticMetodos2("Roxana","Hermosa");
		misEmpleado[8]=new EmpleadosStaticMetodos2("Amanda","Besos");
		
		misEmpleado[2].CambiarSeccion("Amor");
		
		
		for(EmpleadosStaticMetodos2 e:misEmpleado) {
			System.out.println(e.devuelveDatos());
			
		}
		System.out.println(EmpleadosStaticMetodos2.dameIdSiguiente());
	}

}

class EmpleadosStaticMetodos2{
	
	public EmpleadosStaticMetodos2(String nom) {
		
		nombre=nom;
		seccion="Adminitración";
		Id=1;
		
		
	}
	
	public EmpleadosStaticMetodos2(String nom,String ape) {
		
		nombre=nom;
		Apellido=ape;
		
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
	
	public static String dameIdSiguiente() {
		return "El id siguiente es: " + Id++ ;
	}
	
	
	private final String nombre;   //Esto variable final es constante para no cambiar nombre 
	private static int Id;			//Para no tener copia de id en cada campo sino compartir la id.
	private Date AltaContrato;
	private String seccion;
	private String Apellido;
}