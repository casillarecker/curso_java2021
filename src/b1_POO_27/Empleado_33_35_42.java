package b1_POO_27;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado_33_35_42 {

	public static void main(String[] args) {
		
		Jefatura jefatura = new Jefatura("Marco", 4800, 1996, 05, 35);
		jefatura.establecerIncentivo(2570);
		
		
		
		/*Empleado empleado = new Empleado("Reynaldo",90000,2014,03,25);
		Empleado empleado1 = new Empleado("Carmen",90000,2014,03,25);
		Empleado empleado2 = new Empleado("Rosario",90000,2014,03,25);
		Empleado empleado3 = new Empleado("Marlene",90000,2014,03,25);
		
		empleado.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado.dameNombre() + " sueldo: " + empleado.dameSueldo() + 
				" fecha de alta: " + empleado.dameFechaContrato());*/
		///Declaracion de array
		Empleado [] misEmpleado = new Empleado[5];
		
		misEmpleado[0]=new Empleado("Reynaldo",90000,2014,03,25);
		misEmpleado[1]=new Empleado("Carmen",90000,2014,03,25);
		misEmpleado[2]=new Empleado("Marlene",90000,2014,03,25);
		misEmpleado[3]=jefatura; 			//Polimorfismo en acción. Principio de sustitución
		misEmpleado[4]= new Jefatura("Maria", 8500, 1996, 06, 15);
		
		Jefatura JefaFinanzas=(Jefatura)misEmpleado[4];			//Casting siempre cuando es subclase de superclase
		JefaFinanzas.establecerIncentivo(5000);
		
		
		
		
		
		//--------------------------------------Blucle For normal
		/*for(int i=0;i<3;i++) {
			misEmpleado[i].subeSueldo(5);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: " + misEmpleado[i].dameNombre() + " sueldo: " + misEmpleado[i].dameSueldo() + 
					" fecha de alta: " + misEmpleado[i].dameFechaContrato());
		}*/
		
		
		//-----------------------------------Blucle For mejorada
		for(Empleado p : misEmpleado) {
			p.subeSueldo(5);
		}
		for(Empleado e:misEmpleado) {
			System.out.println("Nombre: " + e.dameNombre() + " sueldo: " + e.dameSueldo() + 
					" fecha de alta: " + e.dameFechaContrato());
		}
	}

}

class Empleado{
	
	public Empleado(String nom,double suel,int ano,int mes , int dia) {
		
		nombre=nom;
		sueldo=suel;
		GregorianCalendar calendario= new GregorianCalendar(ano,mes-1,dia);
		AltaContrato=calendario.getTime();
		
		
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
}

class Jefatura extends Empleado {

	public Jefatura(String no,double sue,int añ,int me , int di) {
		super(no,sue,añ,me,di);
		
		
	}
	
	public void establecerIncentivo (double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
}

final class Director extends Jefatura{  			//El final limita la herencia de clase padre. Para la siguiente clase
	
	public Director(String no,double sue,int añ,int me , int di) {
		super(no,sue,añ,me,di);
	}
	
}
