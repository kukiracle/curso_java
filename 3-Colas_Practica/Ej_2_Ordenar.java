package Colas_Practica;

import java.util.Scanner;

public class Ej_2_Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		Colas c3=new Colas();
		int n;
		int elem=0,elem2=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSACA LA DIMENSION DE LA COLA");
		n=sc.nextInt();
		c1.setN(n);
		
		//llenar la cola
		while(c1.esllena()==false) 
		{
			System.out.println("introdusca elemento:");
			elem=sc.nextInt();
			c1.insertar(elem);
		}
		
	    //impresion de la cola
		System.out.print("LA COLA LLENA ES UNO:");
		while(c1.esvacia()==false) 
		{
			elem=(Integer)(c1.eliminar());		
			System.out.print("["+elem+"]");
			c2.insertar(elem);
		}

		c1.vaciar();
		int men=0;
		int aux=0;
		//econtra menor 
		System.out.println("");
		System.out.print("EL RESULTADO ES:");
		
		for(int i=1;i<=n;i++) {
			elem=(Integer)(c2.eliminar());
			
			if(elem>men) 
			{
				men=elem;
			 
				c1.insertar(elem);
			}
			else 
			{
				
				c3.insertar(elem+i);
			}
			
			
		}
		
		
		
		
		while(c1.esvacia()==false) 
		{
			elem2=(Integer)(c1.eliminar());		
			System.out.print("["+elem2+"]");
			
		}
	}

}
