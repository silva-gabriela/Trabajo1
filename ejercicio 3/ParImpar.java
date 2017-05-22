import java.util.Scanner;
/*ParImpar.java Actividad numero 3 TP 1*/	
public class ParImpar {
public static void main(String[]args){
	Scanner teclado=new Scanner(System.in);
	int numero;
	int pares=0;
	int impares=0;
	int x=0;
		while(x<=10){
			System.out.print("ingrese un numero");
			numero=teclado.nextInt();
				if (numero%2==0){
					pares=pares+1;
			   }else {
					impares=impares+1;
				}
		x=x+1;	
		}
	System.out.println("los numeros pares son: "+pares);
	System.out.print("Los numeros impares son:"+impares);
}
}
