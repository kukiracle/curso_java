import java.util.Scanner;
public class Ejercicioo_10 {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("introdusca dimension de la pila p1");
		int n1=leer.nextInt();
		pila p1=new pila();
		p1.llenarpila(n1);
	
		System.out.println("introdusca dimension de la pila p2");
		int n2=leer.nextInt();
		pila p2=new pila();
		p2.llenarpila(n2);
		
		System.out.println("PILA P1");
		p1.buscarnumeroMayor(n1);
		p1.buscarnumeroMenor(n1);
		System.out.println("PILA P2");
		p2.buscarnumeroMayor(n2);
		p2.buscarnumeroMenor(n2);
		

	}

}
