package Colas_Practica;

import java.util.Scanner;

public class Ej_8_Intercambiar_Primo_Mayor_y_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n, elem, menor=99, mayor=0,p=2, d=2;
		
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
			if(p%d==0)
			{
				if(p==d)
				{
					if(elem<menor)
					{
						menor=elem;
					}
					if(elem>mayor)
					{
						mayor=elem;
					}
				}
				d=2;
				p++;
			}
			else
			{
				d++;
			}
		}
		c1.vaciar();
		while(c2.esvacia()==false)
		{
			elem=(Integer)(c2.eliminar());
			if(elem==mayor)
			{
				c1.insertar(menor);
			}
			if(elem==menor)
			{
				c1.insertar(mayor);
			}
			if(elem!=menor && elem!=mayor)
			{
				c1.insertar(elem);
			}
		}
		c2.vaciar();
		System.out.println("   ");
		System.out.println("EL ELEMENTO MENOR PRIMO ES: "+menor);
		System.out.println("EL ELEMENTO MAYOR PRIMO ES: "+mayor);
        System.out.println("LA COLA FINAL ES:");
		//mostrar cola
		while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");
		}
	}

}
