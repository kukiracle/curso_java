package listas;

import java.util.Scanner;

public class ejercio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//elemento mayor
		
		lista listita=new lista();
		int elem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA LA DIMENCION");
		int n=sc.nextInt();
		System.out.println("INTRODUSCA ELEMENTO");
		for (int i = 0; i < n; i++) {
			elem=sc.nextInt();
			listita.agregarAlInicio(elem);
		}
		int men=-999;
		
		
	
		System.out.println("MOSTRAR LA LISTA");
		
		listita.mostrarLista();
		System.out.println();
		listita.mostrarmayor();
		
	}
		
		
		
	}


