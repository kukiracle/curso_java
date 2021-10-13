import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);


		cola c1=new cola();int n;
		Object elem;
		System.out.println("INTRODUSCA DIMENSION DEN LA COLA C1");
		n=leer.nextInt();
		c1.setn(n);
		cola c2=new cola();
		c2.setn(1);
		cola c3=new cola();
		c3.setn(1);
		cola c4=new cola();
		c4.setn(n-2);

		//llenar cola 1
		while (c1.esLlena()==false) 
		{
			System.out.println("INTRODUSCA ELEMENTO PARA COLA C1");
			elem=leer.next();
			c1.Insertar(elem);

		}

		System.out.println("MOSTRANDO COLA C1");
		//mostrar c1

		elem=c1.eliminar();
		Object fren=elem;
		
		System.out.println(fren+" frente");
		while (c1.esVacia()==false)
		{
			elem=c1.eliminar();
		if (c1.getfrente()==n) {
			c3.Insertar(elem);
			System.out.println(elem+" fin");
		}
		c4.Insertar(elem);	
	}
	c1.Vaciado();

	c1.Insertar(c3.eliminar());


	while (c4.esVacia()==false) 
	{
		elem=c4.eliminar();
		c1.Insertar(elem);
	}
	
	c1.Insertar(fren);

	System.out.println();
	while (c1.esVacia()==false)
	{
		elem=c1.eliminar();


		System.out.print("["+ elem+"]");

	}
}

}
