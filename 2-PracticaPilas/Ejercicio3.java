import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner lee=new Scanner(System.in);
		//pila p1
		System.out.println("EJERCICIO 3");
		pila p1=new pila();
		System.out.println("INTRODUSCA LA DIMENSION DE LA PILA");
		int n=lee.nextInt();
		int tama=n; 
		p1.llenarpila(n);

		//pila p2
		pila p2=new pila();
		System.out.println("----------INTRODUSCA LA DIMENSION DE LA PILA p2");
		n=lee.nextInt();
		tama=tama+n; 
		p2.llenarpila(n);

		pila aux=new pila();
		while (p2.esVacia()==false) {
			Object x=p2.eliminar();
			aux.insertar(x, n); 
		}
		while (aux.esVacia()==false) {
			Object x=aux.eliminar();
			p1.insertar(x, tama); 
		}
		//mostrando pila terminada
		p1.mostrar(tama);
	}

}
