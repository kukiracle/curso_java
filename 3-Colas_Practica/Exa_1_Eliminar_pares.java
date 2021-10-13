package Colas_Practica;

import java.util.Scanner;

public class Exa_1_Eliminar_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
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
        System.out.println("LA COLA INICIAL ES:");
		while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");	
			if(elem%2==1)
			{c2.insertar(elem);}
			
		}
		c1.vaciar();
		while(c2.esvacia()==false)
		{
			c1.insertar(c2.eliminar());
		}
		System.out.println("     ");
        System.out.println("LA COLA FINAL ES:");
		//mostrar cola
        while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");
		}
	}

}
