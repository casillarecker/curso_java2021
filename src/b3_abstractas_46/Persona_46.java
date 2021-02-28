package b3_abstractas_46;

import java.util.Date;
import java.util.GregorianCalendar;


public class Persona_46 {

	public static void main(String[] args) {
		
		Persona [] personas = new Persona[2];
		personas[0]=new EmpleadoPersona("Maria", 48500, 1985, 03, 17);
		personas[1]=new Alumno("Reynaldo","Infórmatico");
		
		for(Persona p : personas) {
			System.out.println(p.demeNombre()+ ", " + p.dameDescripción()) ;
		}
		
	}

}

abstract class Persona{
	public Persona(String nom) {
		nombre=nom;

	}
	
	public String demeNombre() {
		return nombre;
	}
	
	public abstract String dameDescripción();			//Esto es una forma de declarar un clase de abstracto
	
	private String nombre;
}

class EmpleadoPersona extends Persona{
	
	public EmpleadoPersona(String nom,double suel,int ano,int mes , int dia) {
		super(nom);
		
		nombre=nom;
		sueldo=suel;
		GregorianCalendar calendario= new GregorianCalendar(ano,mes-1,dia);
		AltaContrato=calendario.getTime();
		id++;
		
		
	}
	
	
	
	public String dameDescripción() {
		return "Este empleado un id= " + id + " con el sueldo = " + sueldo;
	}
	
	public String dameNombre () {
		return nombre;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return AltaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date AltaContrato;
	private static int id;
	private double incentivo;
}

class Alumno extends Persona{
	
	public Alumno(String nom,String car) {
		super(nom);
		carrera=car;
	}
	
	public String dameDescripción() {
		return " Este alumno está estudiando la carrera de " + carrera;
	}
	
	private String carrera;
}
