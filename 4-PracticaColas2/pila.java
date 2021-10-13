import java.util.Scanner;
public class pila {
	Scanner leer=new Scanner(System.in);
	private Object vectPila[];

	private int Top;
	//contructor

	public pila() {
		vectPila=new Object[10];
		Top=0;

	}
	public boolean esVacia()
	{
		if (Top==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean esLlena(int n)
	{

		if (Top==n) {
			return true;
		}
		else {
			return false;
		}
	}
	public Object eliminar()
	{
		Object element;
		if (Top==0) {
			System.out.print("pila vacia");
			return null;
		}

		else {
			element=vectPila[Top];
			Top--;
		}
		return element;
	}
	public void insertar(Object elemento, int n)
	{
		if (Top==n) {
			System.out.println("pila llena");

		}
		else {
			Top ++;
			vectPila[Top]=elemento;

		}

	}
	void mostrar (int n)
	{
		Object elem;
		if (esVacia())
			System.out.println ("Pila vacia");
		else
		{
			System.out.println ("\n Datos de la Pila ");
			pila aux = new pila ();
			while (!esVacia())
			{
				elem = eliminar();
				aux.insertar(elem, n); 
				System.out.println("["+elem+"]");

			}
			while (!aux.esVacia())
			{
				elem = aux.eliminar ();

				insertar(elem, n);
			}
		}
	}
	//METODO PARA LLENAR PILA
	public void llenarpila(int n){

		while (esLlena(n)==false) {
			//llenando la pila
			System.out.println("INTRODUSCA ELEMENTO PARA COLOCAR EN LA PILA");
			Object e=leer.next();
			insertar(e, n);
		}
	}


	//EJERCICIO 10 METODOS BUSCAR MAYOR Y MENOR
	//METODO BUSCAR MAYOR
	public void buscarnumeroMayor(int n) {
		pila aux=new pila();
		int may=-500;

		while (esVacia()==false) {

			Object x=eliminar();
			String y=x.toString();
			int z=Integer.parseInt(y);

			if (z>may) may=z;
			aux.insertar(x, n);
		}
		while (aux.esVacia()==false) {
			Object x=aux.eliminar();
			insertar(x, n);
		}
		System.out.println("EL MAYOR ES: "+may);





	}//METODO BUSCARMENOR
	public void buscarnumeroMenor(int n) {
		pila aux=new pila();
		int men=500;

		while (esVacia()==false) {

			Object x=eliminar();
			String y=x.toString();
			int z=Integer.parseInt(y);

			if (z<men) men=z;
			aux.insertar(x, n);
		}
		while (aux.esVacia()==false) {
			Object x=aux.eliminar();
			insertar(x, n);
		}
		System.out.println("EL MENOR ES: "+men);





	}
}




