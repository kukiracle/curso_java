import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);


		cola c1=new cola();int n;
		Object elem;
		System.out.println("INTRODUSCA DIMENSION DEN LA COLA C1");
		n=leer.nextInt();
		c1.setn(n);

		cola c2=new cola();int n2;
		System.out.println("INTRODUSCA DIMENSION DEN LA COLA C2");
		n2=leer.nextInt();
		c2.setn(n2);

		cola c3=new cola();
		c3.setn(n+n2);

		//llenar cola 1
		while (c1.esLlena()==false) 
		{
			System.out.println("INTRODUSCA ELEMENTO PARA COLA C1");
			elem=leer.next();
			c1.Insertar(elem);
		}
		//LLENAR COLA C2
		while (c2.esLlena()==false) 
		{
			System.out.println("INTRODUSCA ELEMENTO PARA COLA C2");
			elem=leer.next();
			c2.Insertar(elem);
		}
System.out.println();
System.out.println("MOSTRANDO COLA C1");
		//mostrar c1
		while (c1.esVacia()==false)
		{
			elem=c1.eliminar();
			System.out.print("["+ elem+"]");
			c3.Insertar(elem);	
		}
		System.out.println();
		System.out.println("MOSTRANDO C2");
		//mostrar c2
		while (c2.esVacia()==false)
		{
			elem=c2.eliminar();
			System.out.print("["+ elem+"]");
			c3.Insertar(elem);	
		}
		System.out.println();
		System.out.println("MOSTRANDO C3");
		//mostrar c3
		while (c3.esVacia()==false)
		{
			elem=c3.eliminar();
			System.out.print("["+ elem+"]");
		
		}






	}

}


