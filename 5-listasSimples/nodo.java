package listas;

public class nodo 
{
	public int dato;
	public nodo siguiente;
	public nodo(int d)
	{
		this.dato=d;
	}
	public nodo(int d,nodo n)
	{
		dato=d;
		siguiente=n;
	}
}
