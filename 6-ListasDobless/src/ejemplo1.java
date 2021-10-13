
import java.util.Scanner;

import javax.swing.JOptionPane;
public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaDoble ld = new ListaDoble();
		int opcion = 0, elemento;
		Object elem;

		Scanner lee=new Scanner(System.in);

		System.out.println("introdusca Numero");
		int n=lee.nextInt();
		int a=-1;
		int b=1;
		for (int i = 1; i <= n; i++) {
			int c=a+b;

			ld.agregarAlInicio(c);
			a=b;
			b=c;


		}
		int m=5;
		for (int i = 1; i <= n; i++) {

			ld.agregarAlFinal(m);
			m=m+5;

		}
		ld.mostrarListaInicioFin();



	}
}