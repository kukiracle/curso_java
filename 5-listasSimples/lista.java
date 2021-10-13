package listas;

import java.util.Scanner;

public class lista {
	protected nodo inicio,fin;
	public lista()///punteros
	{
		inicio=null;
		fin=null;
	}
	/////metodo para agergar un nodo al inicio
	public void agregarAlInicio(int elemento)
	{
		inicio=new nodo(elemento,inicio);
		if (fin==null) {
			fin=inicio;
		}
	}
	//////////
	public void mostrarLista()
	{
		nodo recorrer=inicio;
		while (recorrer!=null)
		{
		System.out.print("["+recorrer.dato+"]--->");
			recorrer=recorrer.siguiente;
		}
	}
	public void mostrarmayor()
	{
		int may=-999;
		nodo recorrer=inicio;
		while (recorrer!=null)
		{
			
			
			if (recorrer.dato>may) {
					may=recorrer.dato;
			}
		
		
			recorrer=recorrer.siguiente;
		}
		System.out.println("el Mayor es:  "+may);
	}
	
	
	public boolean escapicua(int x)
	{
		int z;
		int nn=0;
		int cx=x;
		while (cx>0) {
	
			z=cx%10;
		cx=cx/10;
		nn=nn*10+z;
		}
		if (x==nn) return true;
		else return false;
		
		
	}
	
	public int serie3(int x)
	{
		String f="";
		for (int i = 1; i <= x;i++) {
			
			f=f+x;
			
		}
		int s=Integer.parseInt(f);
		return s;
		
	}
	public int crearfactorial(int x)
	{
		int f=1;
		for (int i = 1; i <= x; i++) {
			f=f*i;
		}
		return f;
		
	}
	
	public boolean esprimo(int x)
	{
		int p=0;
		for (int i = 1; i <= x; i++) {
			if (x%i==0) p++;	
			
		}
		if (p==2) return true;
		else return false;
			
		
		
	}
	
	
	
	//////////////
	public static void main (String[]args)
	{
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
		System.out.println("MOSTRAR LA LISTA");
		listita.mostrarLista();
	}
}
