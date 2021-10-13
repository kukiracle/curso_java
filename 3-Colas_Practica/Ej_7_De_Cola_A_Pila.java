package Colas_Practica;

import java.util.Scanner;

public class Ej_7_De_Cola_A_Pila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		pila pila=new pila();
		int n, elem;
		
		//pedir la dimension de la cola 
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRUDUCA LA DIMENSION DE LA COLA");
		n=sc.nextInt();
		c1.setN(n);
		
		//llenar la dimension de la cola 
		while(c1.esllena()==false)
		{
			System.out.println("INTRODUZCA ELEMENTO");
			elem=sc.nextInt();
			c1.insertar(elem);	
		}
		System.out.println("     ");
        System.out.println("LA COLA ES:");
		while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");	
			pila.insertar(elem, n);
		}
		System.out.println("      ");
		System.out.println("La Pila es: ");
		while(pila.EsVacio()==false)
		{
			//convertir de Object a integer
			elem=(Integer)( pila.Eliminar());
			
			//mostrar pila original
			System.out.println("["+elem+"]");
		}	
	}

}
