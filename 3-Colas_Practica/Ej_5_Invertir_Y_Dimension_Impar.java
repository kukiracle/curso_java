package Colas_Practica;

import java.util.Scanner;

public class Ej_5_Invertir_Y_Dimension_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n, elem,aux;
		
		//pedir la dimension de la cola 
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRUDUCA LA DIMENSION DE LA COLA");
		n=sc.nextInt();
		
		//llenar la dimension de la cola 
		if(n%2==1)
		{
			pila pila=new pila();
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
				c2.insertar(elem);
			}
			while(c2.esvacia()==false)
			{
				elem=(Integer)(c2.eliminar());
				System.out.print("["+elem+"]");
			}
		}
		else
		{
			System.out.println("LA DIMENSION NO ES IMPAR");
		}
	}
}
