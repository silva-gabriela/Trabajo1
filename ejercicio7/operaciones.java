import java.util.Scanner;
/*operaciones.java Actividad numero 7 TP 1*/	
public class operaciones {
		private int n1;
		private int n2;
		private int suma;
		private int multi;
		private int divi;
		private int resta;
		public void ingresoValor(){
			Scanner valor=new Scanner(System.in);
			System.out.println("Ingrese un valor: ");
			n1= valor.nextInt();
			Scanner valor2=new Scanner(System.in);
			System.out.println("Ingrese otro valor: ");
			n2=valor2.nextInt();
		}
		
		public void operacionSuma(){
			suma=n1+n2;
			System.out.println("La suma de los numeros es: "+suma);
		}
		public void operacionMulti(){
			multi=n1*n2;
			System.out.println("La multiplicación de los numeros es:"+multi);
		}
		public void operacionDivi(){
			divi=n1/n2;
			System.out.println("La division de los numeros es: "+divi);
		}
		public void operacionResta(){
			resta=n1-n2;
			System.out.println("La resta de los numeros es: "+resta);
		}
		
		public static void main(String[] args) {
			operaciones operaciones;
			operaciones=new operaciones();
			operaciones.ingresoValor();
			operaciones.operacionSuma();
			operaciones.operacionResta();
			operaciones.operacionMulti();
			operaciones.operacionDivi();
		}

	}
	

