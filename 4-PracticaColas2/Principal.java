import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cola c1=new cola();
		int n;
		Object elem;
		//PRACTICA 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUSCA DIMENCION DEN LA COLA");
		n=sc.nextInt();
		c1.setn(n);
	//llenar cola
		while (c1.esLlena()==false) 
		{
			System.out.println("INTRODUSCA ELEMENTO");
			elem=sc.next();
			c1.Insertar(elem);
		}
		
		//EJERCICIO 2 vaciar cola1 en cola 2
	
		cola c2=new cola();
		c2.setn(c1.getn());
		
	System.out.println("COLA 1");
			while (c1.esVacia()==false)
			{
				elem=c1.eliminar();
				System.out.print("["+ elem+"]");
				c2.Insertar(elem);
				
			}
			System.out.println();
			System.out.println("frente"+c1.getfrente());
			System.out.println("fin"+c1.getfin());
			
			c1.Vaciado();
			
			System.out.println("frente"+c1.getfrente());
			System.out.println("fin"+c1.getfin());
			
			System.out.println("COLA 2");
			
			while (c2.esVacia()==false)
			{
				elem=c2.eliminar();
				
				System.out.print("["+ elem+"]");
				
				c1.Insertar(elem);
				
			}
			System.out.println();
			System.out.println("frente"+c2.getfrente());
			System.out.println("fin"+c2.getfin());
			
			c2.Vaciado();
			
			System.out.println("frente"+c2.getfrente());
			System.out.println("fin"+c2.getfin());
			
			System.out.println("COLA 1");
			
			while (c1.esVacia()==false)
			{
				elem=c1.eliminar();
				
				System.out.print("["+ elem+"]");
				
			
				
			}
			System.out.println();
			System.out.println("frente"+c1.getfrente());
			System.out.println("fin"+c1.getfin());
			
			c1.Vaciado();
			
			System.out.println("frente"+c1.getfrente());
			System.out.println("fin"+c1.getfin());
			
			
			
			

		}

	}


