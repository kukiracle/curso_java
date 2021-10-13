package Colas_Practica;

import java.util.Scanner;

public class Ej_3_Unir_Colas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		Colas c3=new Colas();
		int n, n2, elem;
		
		//pedir la dimension de la cola 1
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRUDUCA LA DIMENSION DE LA COLA 1");
		n=sc.nextInt();
		c1.setN(n);
		
		//llenar la dimension de la cola 1
		while(c1.esllena()==false)
		{
			System.out.println("INTRODUZCA ELEMENTO");
			elem=sc.nextInt();
			c1.insertar(elem);			
		}
		
		//pedir la dimension de la cola 2
		System.out.println("INTRUDUCA LA DIMENSION DE LA COLA");
		n2=sc.nextInt();
		c2.setN(n2);
		
		//llenar la dimension de la cola 2 
		while(c2.esllena()==false)
		{
			System.out.println("INTRODUZCA ELEMENTO");
			elem=sc.nextInt();
			c2.insertar(elem);			
		}
		
		System.out.println("     ");
        System.out.println("LA COLA unno es ES:");
		while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");	
			c3.insertar(elem);
		}
		System.out.println("     ");
        System.out.println("LA COLA doss es ES:");
		while(c2.esvacia()==false)
		{
			elem=(Integer)(c2.eliminar());
			System.out.print("["+elem+"]");	
			c3.insertar(elem);
		}
		
		System.out.println("     ");
        System.out.println("LA COLA FINAL es ES:");
		//mostrar cola
		while(c3.esvacia()==false)
		{
			elem=(Integer)(c3.eliminar());
			System.out.print("["+elem+"]");
		}
	}

}
