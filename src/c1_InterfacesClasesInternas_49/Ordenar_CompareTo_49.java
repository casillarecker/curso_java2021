package c1_InterfacesClasesInternas_49;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;


public class Ordenar_CompareTo_49 {


	public static void main(String[] args) {
		
		JefaturaCompareTo jefatura = new JefaturaCompareTo("Marco", 4800, 1996, 05, 35);
		jefatura.establecerIncentivo(2570);
		
		
		///Declaracion de array
		EmpleadoCompareTo [] misEmpleado = new EmpleadoCompareTo[5];
		
		misEmpleado[0]=new EmpleadoCompareTo("Reynaldo",90000,2014,03,25);
		misEmpleado[1]=new EmpleadoCompareTo("Carmen",9653,2014,03,25);
		misEmpleado[2]=new EmpleadoCompareTo("Marlene",89755,2014,03,25);
		misEmpleado[3]=jefatura; 			//Polimorfismo en acción. Principio de sustitución
		misEmpleado[4]= new JefaturaCompareTo("Maria", 8500, 1996, 06, 15);
		
		JefaturaCompareTo JefaFinanzas=(JefaturaCompareTo)misEmpleado[4];			//Casting siempre cuando es subclase de superclase
		JefaFinanzas.establecerIncentivo(5000);
		
		
		//************************************************* Interfaces Implentaciones *************************************
		
		System.out.println(JefaFinanzas.tomarDecisiones("Dar mas días de vacaciones a los empleados"));			//Implementacion de interfaces.
		System.out.println("El jefe " + JefaFinanzas.dameNombre() + " tiene un bonus de: " + JefaFinanzas.estableceBonus(500));
		
		System.out.println(misEmpleado[2].dameNombre() + " tiene un bonus de: " + misEmpleado[2].estableceBonus(200));
		
		
		//+++++++++++++++++++++++++++++++++++ INSTANCEOF ++++++++++++++++++++++++++++++++++++++++

		
		/*EmpleadoCompareTo director = new JefaturaCompareTo("Sandra", 52633, 1886, 5, 14);
		Comparable ejemplo = new EmpleadoCompareTo("Sandra", 52633, 1886, 5, 14);
		if(director instanceof EmpleadoCompareTo) {
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");
		}*/
		
		//+++++++++++++++++++++++++++++++++++ INSTANCEOF ++++++++++++++++++++++++++++++++++++++++
		
	
		
		//-----------------------------------Blucle For mejorada
		for(EmpleadoCompareTo p : misEmpleado) {
			p.subeSueldo(5);
		}
		
		//-----------------------*************************Ordenar
		
		Arrays.sort(misEmpleado);
		
		for(EmpleadoCompareTo e:misEmpleado) {
			System.out.println("Nombre: " + e.dameNombre() + " sueldo: " + e.dameSueldo() + 
					" fecha de alta: " + e.dameFechaContrato());
		}
	}

}

class EmpleadoCompareTo implements Comparable,Trabajadores_52{
	
	public EmpleadoCompareTo(String nom,double suel,int ano,int mes , int dia) {
		
		nombre=nom;
		sueldo=suel;
		GregorianCalendar calendario= new GregorianCalendar(ano,mes-1,dia);
		AltaContrato=calendario.getTime();
		
		
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores_52.bonusBase+gratificacion;
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
	
	
	
	
	//********************************************************Ordenado por sueldo***************************************************************
	public int compareTo(Object miOb) {
		EmpleadoCompareTo otremple = (EmpleadoCompareTo)miOb;
		
		if(this.sueldo<otremple.sueldo) {
			return -1;
		}
		if(this.sueldo>otremple.sueldo) {
			return 1 ;
		}
		
		return 0;
	}
	
}

class JefaturaCompareTo extends EmpleadoCompareTo implements Jefes_51{

	public JefaturaCompareTo(String no,double sue,int añ,int me , int di) {
		super(no,sue,añ,me,di);
		
		
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima=2000;
		return Trabajadores_52.bonusBase+gratificacion+prima;
		
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

final class DirectorCompareTo extends JefaturaCompareTo{  			//El final limita la herencia de clase padre. Para la siguiente clase
	
	public DirectorCompareTo(String no,double sue,int añ,int me , int di) {
		super(no,sue,añ,me,di);
	}
	
}