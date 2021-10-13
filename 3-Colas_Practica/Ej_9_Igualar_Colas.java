package Colas_Practica;

import java.util.Scanner;

public class Ej_9_Igualar_Colas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n, n2, n3=0, x=0, elem, elem2;
		
		//pedir la dimension de la cola 1
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
		//pedir la dimension de la cola 2
		System.out.println("INTRUDUCA LA DIMENSION DE LA COLA");
		n2=sc.nextInt();
		c2.setN(n2);
		
		//llenar la dimension de la cola 
		while(c2.esllena()==false)
		{
			System.out.println("INTRODUZCA ELEMENTO");
			elem=sc.nextInt();
			c2.insertar(elem);			
		}
		while(c1.esvacia()==false && c2.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			elem2=(Integer)(c2.eliminar());
			if(elem==elem2)
				{
				x++;
				}
		}
		if(n>n2)
		{
			n3=n;
		}
		else
		{
			n3=n2;
		}
		if(x==n3)
		{
			System.out.println("COLAS IGUALES");
		}
		else
		{
			System.out.println("COLAS DIFERENTES");
		}
	}

}
