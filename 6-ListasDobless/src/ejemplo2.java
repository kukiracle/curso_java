
import java.util.Scanner;
public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoble ld = new ListaDoble();
		int n, contador = 0, i, residuo, c = 0;
			
		// Pedir dimension de la lista
		
		Scanner sc=new Scanner (System.in);
		System.out.println("introduzca dimension ");
		n=sc.nextInt();
		
		// Llenar lista

		while(contador < n)
		{
			residuo = 0;
			for(i = 1; i<= c; i++)
			{
				if((c % i) == 0)
				{
					residuo++;
				}
			}
			if(residuo == 2)
			{
				ld.agregarAlFinal(c);
				contador++;
			}
			else
			{
				ld.agregarAlInicio(c);
				contador++;
			}
			c++;
		}

		System.out.println("Mostrando Lista de Inicio a Fin");
		ld.mostrarListaInicioFin();
		
	}

}
