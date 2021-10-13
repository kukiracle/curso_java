
public class NodoDoble {
	public Object dato;
	public NodoDoble anterior;
	public NodoDoble siguiente;
	
	// Constructor para cuando aun no hay nodos
	
	public NodoDoble(Object dato)
	{
		this.dato = dato;
		this.anterior = null;
		this.siguiente = null;
	}
	
	// Contructor para cuando ya hay nodos
	
	public NodoDoble(Object dato, NodoDoble anterior, NodoDoble siguiente)
	{
		this.dato = dato;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}
	
}
