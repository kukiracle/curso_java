import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lee=new Scanner(System.in);
		//EJERCICIO NRO 1
		System.out.println("EJERCICIO 1");
		pila p1=new pila();
		System.out.println("INTRODUSCA LA DIMENSION DE LA PILA");
		int n=lee.nextInt();
		p1.llenarpila(n);
		pila aux=new pila();// creando una pila auxiliar vacia
		while (p1.esVacia()==false) {
			//mostrando y pasando datos ala pila aux

			Object x=p1.eliminar();
			System.out.println("["+x+"]");
			aux.insertar(x, n); //insertando en pila aux
		}
		while (aux.esVacia()==false) {
			Object x=aux.eliminar();//objeto auxiliar x
			String y=x.toString();//convirtiendo el objeto x a string EN Y
			int e=Integer.parseInt(y);//convirtiendo a int y en e
			if (e>=0) {
				p1.insertar(x, n); //insertando x en pila p1
			}
		}
		System.out.println("PILA SIN NEGATIVOS");
		p1.mostrar(n);
	

	}

}
