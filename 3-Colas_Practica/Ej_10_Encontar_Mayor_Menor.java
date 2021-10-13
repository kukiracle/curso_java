package Colas_Practica;

import java.util.Scanner;

public class Ej_10_Encontar_Mayor_Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n, elem, menor=99, mayor=0;
		
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
			if(elem<menor)
			{
				menor=elem;
			}
			if(elem>mayor)
			{
				mayor=elem;
			}
		}
		System.out.println("     ");
        System.out.println("EL ELEMENTO MENOR ES: "+menor);
        System.out.println("EL ELEMENTO MAYOR ES: "+mayor);
	}

}
