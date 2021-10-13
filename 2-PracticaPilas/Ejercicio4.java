import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner leer=new Scanner(System.in);
		pila p1=new pila();
		System.out.println("INTRODUSCA LA DIMENSION DE LA PILA");
		int n=leer.nextInt();
		p1.llenarpila(n);
		Object ulti=p1.eliminar();//  ultimo elemnto

		pila aux=new pila();// creando una pila auxiliar vacia
		while (p1.esVacia()==false) {
			Object x=p1.eliminar();
			aux.insertar(x, n); //insertando en pila aux
		}
		aux.eliminar();//eliminando el ultimo elemento de la pila aux
		aux.insertar(ulti, n);
while (aux.esVacia()==false) {
			Object x=aux.eliminar();
			p1.insertar(x, n); //insertando en pila aux
		}
		p1.mostrar(n);
		
	}

}
