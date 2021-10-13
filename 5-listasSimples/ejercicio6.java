package listas;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//llenar solo con primos
		lista listita=new lista();
		int elem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA LA DIMENCION");
		int n=sc.nextInt();
		System.out.println("INTRODUSCA ELEMENTO");
		boolean k=true;
		for (int i = 0; i < n; i++) {
			
			
			do {
				System.out.println("INTRODUSCA ELEMENTO #"+i+" PRIMO");
			
			elem=sc.nextInt();
			if (listita.esprimo(elem)) k=true;
			else k=false;
			
			}while(k==false);
			listita.agregarAlInicio(elem);
			
			
			
		}
		System.out.println("MOSTRAR LA LISTA");
		listita.mostrarLista();
		
	}

}
