package Colas_Practica;

import java.util.Scanner;

public class Ej_6_Eliminar_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colas c1=new Colas();
		Colas c2=new Colas();
		int n;
		Object elem, elem_elimi;
		
		//pedir la dimension de la cola 
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRUDUCA LA DIMENSION DE LA COLA");
		n=sc.nextInt();
		c1.setN(n);
		
		//llenar la dimension de la cola 
		while(c1.esllena()==false)
		{
			System.out.println("INTRODUZCA ELEMENTO");
			elem=sc.next();
			c1.insertar(elem);			
		}
		
		//ELIMINA
		System.out.println("INTRODUZCA ELEMENTO A ELIMINAR");
		elem_elimi=sc.next();
		System.out.println("LA COLA ES: ");
		while(c1.esvacia()==false)
		{
			elem=c1.eliminar();
			System.out.print("["+elem+"]");
			if (elem.equals(elem_elimi)==true) {
                
			}
			else {
				c2.insertar(elem);
			}		
		}
        c1.vaciar();
        
        System.out.println("     ");
        System.out.println("LA COLA FINAL ES:");
		//mostrar cola
		while(c2.esvacia()==false)
		{
			elem=c2.eliminar();
			System.out.print("["+elem+"]");
		}
	}

}
