import java.util.Scanner;
/*persona.java y empleado.java Actividad numero 8 TP 1*/	
public class persona {
	private String nom;
	private int edad;
private void responsabilidades(){
	System.out.print("Ingrese su nombre: ");
	Scanner teclado=new Scanner(System.in);
	nom = teclado.next();
	System.out.print("Ingrese su edad:");
	Scanner teclado1=new Scanner(System.in);
	edad=teclado1.nextInt();
}

public void impresionDatos(){
	System.out.println("El nombre ingresado es: "+nom);
	System.out.println("La edad ingresada es: "+edad+" años");
}
		


public static void main(String[] args) {
	persona persona;
	empleado empleado;
	persona=new persona();
	empleado=new empleado();
	persona.responsabilidades();
	empleado.cargaSueldo();
	persona.impresionDatos();
	empleado.impresionSueldo();
}
}
