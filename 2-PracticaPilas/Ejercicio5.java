import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		pila p1=new pila();
		int n;
		do{
			System.out.println("INTRODUSCA UNA DIMENSION IMPAR");
			n=leer.nextInt();	
		}while(n%2==0);


		p1.llenarpila(n);


		pila aux=new pila();

		//volteando 
		while (p1.esVacia()==false) {
			//mostrando y pasando datos ala pila aux

			Object x=p1.eliminar();
			System.out.println("["+x+"]");

			aux.insertar(x, n); //insertando en pila aux


		}
		System.out.println("PILA VOLTEADA");
		aux.mostrar(n);


	}

}
