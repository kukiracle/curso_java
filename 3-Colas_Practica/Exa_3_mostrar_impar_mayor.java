package Colas_Practica;

import java.util.Scanner;

public class Exa_3_mostrar_impar_mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n, elem, mayor=0,cont=0;
		
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
			c2.insertar(elem);
			if(elem%2==1)
			{
				if(elem>mayor)
				{mayor=elem;}
			}
		}
		c1.vaciar();
		while(c2.esvacia()==false)
		{
			c1.insertar(c2.eliminar());
		}
		c2.vaciar();
		System.out.println("   ");
		System.out.println("EL ELEMENTO MAYOR IMPAR ES: "+mayor);
        System.out.println("LA COLA FINAL ES:");
		//mostrar cola
		while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");
		}
	}

}
