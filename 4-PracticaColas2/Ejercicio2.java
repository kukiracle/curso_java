import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		cola c1=new cola();
		int n;
		Object elem;


		Scanner leer=new Scanner(System.in);
		System.out.println("INTRODUSCA DIMENSION DEN LA COLA");
		n=leer.nextInt();
		c1.setn(n);
		//llenar cola
		while (c1.esLlena()==false) 
		{
			System.out.println("INTRODUSCA ELEMENTO");
			elem=leer.next();
			c1.Insertar(elem);
		}
		cola aux=new cola();
		aux.setn(n);
		//
		int [] v=new int [n];
		int c=0;
		while (c1.esVacia()==false)
		{
			elem=c1.eliminar();
		
			String x_str=elem.toString();
			int x_int=Integer.parseInt(x_str);
			v[c]=x_int;
			c++;
			

		}
		c1.Vaciado();
		 Arrays.sort(v);
		
		c=0;
		while (c1.esLlena()==false) 
		{
			int x=v[c];
			String num = x+"";
			c1.Insertar(num);
			c++;

		}
		while (c1.esVacia()==false)
		{
			elem=c1.eliminar();
			System.out.print("["+ elem+"]");		
		}
	}

}
