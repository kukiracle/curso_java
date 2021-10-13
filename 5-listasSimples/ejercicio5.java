package listas;

import java.util.Scanner;

public class ejercicio5 {

	
	//sumar sus pares de la lista
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista listita=new lista();
		int elem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA LA DIMENCION");
		int n=sc.nextInt();
		int spares=0;
		for (int i = 0; i < n; i++) {
			
			
			
			System.out.println("INTRODUSCA ELEMENTO");
			
			elem=sc.nextInt();
			if (elem%2==0) 	spares=spares+elem;
			
			
			listita.agregarAlInicio(elem);
		}
		System.out.println("MOSTRAR LA LISTA");
		listita.mostrarLista();
		
		System.out.println();
		System.out.println("LA SUMA DE PARES ES: "+spares);
		
	}

}
