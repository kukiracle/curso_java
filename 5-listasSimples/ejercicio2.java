package listas;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// llenar con numeros capicuos
		lista listita=new lista();
		int elem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA LA DIMENCION");
		int n=sc.nextInt();
	boolean k=true;
		for (int i = 0; i < n; i++) {
			do {
				System.out.println("INTRODUSCA ELEMENTO #"+i+" CAPUCUO");
			
			elem=sc.nextInt();
			if (listita.escapicua(elem)) k=true;
			else k=false;
			
			}while(k==false);
			listita.agregarAlInicio(elem);
		}
		System.out.println("MOSTRAR LA LISTA");
		listita.mostrarLista();
		
	
		
		
		
		
	}

}
