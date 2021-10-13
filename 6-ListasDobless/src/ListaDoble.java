

public class ListaDoble {

private NodoDoble inicio, fin;
	
	public ListaDoble()	// punteros
	{
		this.inicio = this.fin = null;
	}
	
	// Metodo para saber cuando la lista esta vacia
	
	public boolean esVacia()
	{
		return (this.inicio == null);
	}
	
	// Metodo para agregar nodos al final
	
	public void agregarAlFinal(Object dato)
	{
		if(!esVacia())
		{
			this.fin = new NodoDoble(dato, this.fin, null);
			this.fin.anterior.siguiente = this.fin;
		}
		else
		{
			this.inicio = this.fin = new  NodoDoble(dato);
		}
	}
	
	// Metodo para agregar al inicio
	
	public void agregarAlInicio(Object dato)
	{
		if(!esVacia())
		{
			this.inicio = new NodoDoble(dato, null, this.inicio);
			this.inicio.siguiente.anterior = this.inicio;
		}
		else
		{
			this.inicio = this.fin = new  NodoDoble(dato);
		}
	}
	
	// Metodo para mostrar la lista de inicio a fin
	
	public void mostrarListaInicioFin()
	{
		if(!esVacia())
		{
			NodoDoble auxiliar = this.inicio;
			System.out.print("\n<=>");
			while(auxiliar != null)
			{
				System.out.print("["+auxiliar.dato+"]<=>");
				auxiliar = auxiliar.siguiente;
			}
		}
		else
		{
			System.out.println("No Hay Nodos Aun");
		}
	}
	
	// Metodo para mostrar la lista de fin a inicio
	
	public void mostrarListaFinInicio()
	{
		if(!esVacia())
		{
			NodoDoble auxiliar = this.fin;
			System.out.print("\n<=>");
			while(auxiliar != null)
			{
				System.out.print("["+auxiliar.dato+"]<=>");
				auxiliar = auxiliar.anterior;
			}
		}
		else
		{
			System.out.println("No Hay Nodos Aun");
		}
	}
	
	// Metodo para contar cantidad de Nodos
	
	 public int numeroNodos()
	 {
		 int nn = 0;
         NodoDoble auxiliar = this.inicio;
		 if(!esVacia())
		 {
			 while(auxiliar != null)
             {
	             nn++;
	             auxiliar = auxiliar.siguiente;                
             }
		 }
		 else
		 {
			 System.out.println("Lista Vacia");
		 }
         return nn;
     }
	 
	// Metodo para eliminar al inicio
	 
	 public Object eliminarAlInicio()
	 {
		 if(!esVacia())
		 {
			 Object dato;
	         dato = this.inicio.dato;
	         this.inicio = this.inicio.siguiente;
	         this.inicio.anterior = null;
	         return dato;
		 }
		 else
		 {
			 System.out.println("Lista Vacia");
			 return null;
		 }
	 } 
	 
	 // Metodo para eliminar al final
	 
	 public Object eliminarAlFinal()
	 {
		 if(!esVacia())
		 {
			 Object dato;
			 dato = this.fin.dato;
			 this.fin = this.fin.anterior;
			 this.fin.siguiente = null;
			 return dato;
		 }
		 else
		 {
			 System.out.println("Lista Vacia");
			 return null;
		 }
	 } 
	 
	 // Metodo para agregar al medio
	 
	 public void agregarAlMedio(Object dato)
	 {
		 int nn = numeroNodos(), medio, i;
		 NodoDoble  nuevo = new NodoDoble(dato);
		 if(!esVacia())
		 {
			 NodoDoble auxiliar = this.inicio;
			 medio = nn / 2;
			 for(i = 1; i < medio; i++)
			 {
				 auxiliar = auxiliar.siguiente;
			 }
			 nuevo.siguiente = auxiliar.siguiente;
			 auxiliar.siguiente = nuevo;
		 }		 
		 else
		 {
			 System.out.println("No existe nigun nodo");
			 this.inicio = this.fin = nuevo;
	 	 }
 	  } 		

}