import java.util.Scanner;
/*persona.java y empleado.java Actividad numero 8 TP 1*/	
public class empleado {
	private static int s;
	
public void cargaSueldo(){
	Scanner sueldo=new Scanner(System.in);
	System.out.print("Ingrese su sueldo: ");
	s=sueldo.nextInt();
	}
public void impresionSueldo(){
	System.out.println("Su sueldo es:$"+s);
}
}
