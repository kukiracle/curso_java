import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		System.out.println("Introdusca dimension p1");
		pila p1=new pila();
		int n1=leer.nextInt();
		System.out.println("Introdusca dimension p2");
		int n2=leer.nextInt();
		pila p2=new pila();
		System.out.println("PILA P1");
		p1.llenarpila(n1);
		System.out.println("PILA P2");
		p2.llenarpila(n2);
		pila aux=new pila();
		int verdad=0;
		
		
		if (n1!=n2) System.out.println("DIFERENTES");
		else {
			int n3=n2+n1;
			
			while (p1.esVacia()==false) {
					Object x1=p1.eliminar();
					Object x2=p2.eliminar();
					if (!x1.equals(x2)) verdad++;
					aux.insertar(x1,n3);
					aux.insertar(x2,n3);
				}
			
			if (verdad>0) System.out.println("DIFERENTES");
			else System.out.println("IDENTICAS");	
			
			
		}
		
		
		
		
	}

}
