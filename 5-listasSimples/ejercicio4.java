package listas;

import java.util.Scanner;

public class ejercicio4 {

	//llenar con sus factoriales
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lista listita=new lista();
		int elem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA LA DIMENCION");
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("INTRODUSCA ELEMENTO");
			elem=sc.nextInt();
			
			listita.agregarAlInicio(listita.crearfactorial(elem));
		}
		System.out.println("MOSTRAR LA LISTA");
		listita.mostrarLista();
	}

}
