import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cola c1=new cola();
		int n;
		Object elem;
		
		
		Scanner leer=new Scanner(System.in);
		System.out.println("INTRODUSCA DIMENCION DEN LA COLA");
		n=leer.nextInt();
		c1.setn(n);
	//llenar cola
		while (c1.esLlena()==false) 
		{
			System.out.println("INTRODUSCA ELEMENTO");
			elem=leer.next();
			c1.Insertar(elem);
		}
		cola c2=new cola();
		c2.setn(n);
		//mostrar
		while (c1.esVacia()==false)
		{
			elem=c1.eliminar();
			System.out.print("["+ elem+"]");
			
			String x=elem.toString();
			int y=Integer.parseInt(x);
			
			if(y<0)c2.Insertar(elem);	
				
		}
		System.out.println("COLA SIN POSITIVOS");
		while (c2.esVacia()==false)
		{
			elem=c2.eliminar();
			System.out.print("["+ elem+"]");
			
				
				
		}
		
		
		
		
		
		
	}

}
