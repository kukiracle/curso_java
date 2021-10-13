
public class cola {

	private Object c[];
	private int n;
	private int frente;
	private int fin;
	
	//constructor sin producto
	public cola()
	{
		this.c=new Object[10];
		this.n=10;
		this.frente=0;
		this.fin=0;
		
	}
	//constructor con producto
	public cola(int n)
	{
		this.c=new Object[n];
		this.n=n;
		this.frente=0;
		this.fin=0;
	}
	//modelo para pedir N
	public void setn(int n)
	{
		this.n=n;
		this.c=new Object[n];
	}
	public int getn()
	{
	return this.n;
	}
	public int getfrente()
	{
		return this.frente;
	}
	public int getfin()
	{
		return this.fin;
	}
	//metodo para cola vacia
	public boolean esVacia()
	{
		if (this.frente==this.fin) {
			return true;
		}
		else {
			return false;
		}
	}
	//metodo para cola esLlena
	public boolean esLlena() 
	{
		if (this.fin==this.n) {
			return true;
		}
		else {
			return false;
		}
	}
	//metodo insertar 
	public void Insertar(Object elem)
	{
		if (this.fin!=this.n) {
			this.c[this.fin]=elem;
			this.fin++;
		}
		else {
			System.out.println("COLA LLENA");
		}
	}
	
	//metodo eliminar
	public Object eliminar() 
	{
		Object elem;
		if (this.frente!=this.fin) {
			elem=this.c[this.frente];
			this.frente++;
			return elem;
		}
		else {
			System.out.println("COLA VACIA");
			return null;
		}
	}
	//metodo Vaciado
	public void Vaciado() 
	{
	this.frente=0;
	this.fin=0;
	}
	public void frentevaciado(){
		this.frente=0;
	}
	public void finvaciado(){
		this.fin=fin-1;
	}
	
	
	//metodo cuenta numero de elementos
	public int CuentaNumeroelem()
	{
	return (this.fin= this.fin-this.frente);
	}
}
