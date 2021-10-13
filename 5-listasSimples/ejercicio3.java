package listas;

import java.util.Scanner;

public class ejercicio3 {

	//serie 1,22,333,4444
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista listita=new lista();
		int elem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA LA DIMENCION");
		int n=sc.nextInt();
	elem=1;
	

		for (int i = 0; i < n; i++) {
			
		
			listita.agregarAlInicio(listita.serie3(elem));
			elem++;
		
		}
		System.out.println("MOSTRAR LA LISTA");
		listita.mostrarLista();
		
		
	}

}
