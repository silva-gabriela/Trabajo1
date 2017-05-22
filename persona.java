import java.util.Scanner;
/*persona.java Actividad numero 1 TP 1*/
public class persona {
public static void main (String[]args){
	Scanner teclado=new Scanner(System.in);
	int cantidad;
	int precio ;
	int abono;
	System.out.print("Ingrese cantidad: ");
	cantidad=teclado.nextInt();
	System.out.print("Ingrese el precio: ");
	precio=teclado.nextInt();
	abono=precio*cantidad;
	System.out.print("Se debe abonar: "+abono);
}
}
