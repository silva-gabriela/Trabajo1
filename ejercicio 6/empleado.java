import java.util.Scanner;
/*empleado.java Actividad numero 6 TP 1*/	
public class empleado {
		private String a;
		private int b;
		public void ingresoDatos(){
		Scanner nombre=new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		a = nombre.next();
		Scanner sueldo=new Scanner(System.in);
		System.out.println("Ingrese su sueldo: ");
		b=sueldo.nextInt();
		}
		
		public void imprimirDatos(){	
			System.out.println("Su nombre es: "+a);
			System.out.println("Su sueldo es: "+b);	
		}
	
	
	    public void impuestoSueldo(){
		if(b>3000){
			System.out.print("Usted debe pagar impuestos");
		}else {
			System.out.print("Su sueldo a cobrar es: "+b);
		}
	    }
			
	    public static void main(String[] args) {
	    	empleado empleado;
	    	empleado=new empleado();
	    	empleado.ingresoDatos();
	    	empleado.imprimirDatos();
	    	empleado.impuestoSueldo();
	    }
	    }



