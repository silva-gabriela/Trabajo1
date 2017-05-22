import java.util.Scanner;
/*Ejercicio5 Actividad numero 5 TP 1*/	
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero;
		int i=0;
		while(i<9999){
				System.out.println("Ingrese un numero: ");
				numero=teclado.nextInt();
				if(numero==0){
					System.out.println("El numero ingresado es 0");	
				} else if(numero>0) {
					System.out.println("El numero ingresado es mayor a 0");
				}else{
					System.out.println("El numero ingresado es menor a 0");
				}
				
				i=i+numero;
				
				
				if(i>=9999){
					System.out.println("Llego a 9999");
				} else {
					System.out.println("El resultado es "+i);	
				}
					
			}
			
	}

}
