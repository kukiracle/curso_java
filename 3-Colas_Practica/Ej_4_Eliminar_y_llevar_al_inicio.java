package Colas_Practica;

import java.util.Scanner;


public class Ej_4_Eliminar_y_llevar_al_inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n, elem, elem2=0, elem3=0 ;
		
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
		
		//MOSTRAMOS Y VACIAMOS 
		System.out.println("LA COLA principal ES: ");
		while(c1.esvacia()==false)
		{ 
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");
			c2.insertar(elem);
			if(c1.getfrente()==1)
				{
				elem2=elem;
				}
			if(c1.getfrente()==c1.getn())
			{
				elem3=elem;
			}
					
		}
		
		//vaciar cola 1
        c1.vaciar();
        
		//mostrar cola
		while(c2.esvacia()==false)
		{
			elem=(Integer)(c2.eliminar());
			if(elem==elem2)
			{
				c1.insertar(elem3);
			}
			if(elem==elem3)
			{
				// no hacer nada
			}
			if(elem!=elem3 && elem!=elem2)
			{
				c1.insertar(elem);
			}
		}
		//vaciar cola 2
        c2.vaciar();
        
        //muetra la cola 1
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("LA COLA final ES: ");
		while(c1.esvacia()==false)
		{
			elem=(Integer)(c1.eliminar());
			System.out.print("["+elem+"]");
		}
	}
}
