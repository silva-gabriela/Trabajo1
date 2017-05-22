/*tabla5.java  Actividad numero 4 TP 1*/	
public class tabla5 {
	private int i, multi;
	public void deCinco(){
		for(i=0;i<=10;i++){
			multi=5*i;
			System.out.println("5x"+i+"="+multi);

		}
	}
public static void main(String[]args){
	tabla5 x;
	x=new tabla5();
	x.deCinco();
}
}

