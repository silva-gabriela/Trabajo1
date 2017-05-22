/*Ejercicio2.java Actividad numero 2 TP1*/
import java.util.*;
import java.io.*;
public class ejercicio2 {
	public static void main(String[]args)throws IOException{
		Scanner teclado=new Scanner(System.in);
		int num, cifras;
			System.out.print("introduce un numero positivo: ");
			num= teclado.nextInt();
			cifras=0;
			while (num!=0){
				num=num/10;
				cifras++;
			}
			System.out.print("El numero tiene "+cifras+" cifra/s");
			
	}
}