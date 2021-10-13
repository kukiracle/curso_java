import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner lee=new Scanner(System.in);
		pila p1=new pila();
		System.out.println("INTRODUSCA LA DIMENSION DE LA PILA");
		int n=lee.nextInt();
		p1.llenarpila(n);
		pila aux=new pila();
		while (p1.esVacia()==false) {
			//mostrando y pasando datos ala pila aux

			Object x=p1.eliminar();
			System.out.println("["+x+"]");

			aux.insertar(x, n); //insertando en pila aux


		}
		System.out.println( " INSERTE K NUMERO  A ELIMINAR");
		int k=lee.nextInt();
		while (aux.esVacia()==false) {
			Object x=aux.eliminar();
			String y=x.toString();
			int e=Integer.parseInt(y);
			if (e!=k) {	
				p1.insertar(x, n); //insertando x en pila p1
			}


		}

		p1.mostrar(n);
	}

}
