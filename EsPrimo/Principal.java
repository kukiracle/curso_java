import javax.lang.model.type.PrimitiveType;
import javax.swing.JOptionPane;




public class Principal {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		//ejercicio1 1,2,4,7,11,16,22
		
		
String N=JOptionPane.showInputDialog("introduce N serie");
		
		int n=Integer.parseInt(N);
		
		
		int a=1;
	
		for (int i = 1; i <= n; i++) {
			
			System.out.print(a+",");
		a=a+i;
			
		
			
		
		

				
		}
		
		
		

		
		//ejercicio2 verificar si un numero es primo introducido por teclado
		
		System.out.println();
String Np=JOptionPane.showInputDialog("introduce Numero");
		
		int nu=Integer.parseInt(Np);
		
		
		int cp=0;
		
		for (int i = 1; i <=nu; i++) {
			
			if (nu%i==0) {
				cp++;
				
			}
			
		}
		
		if (cp==2) {
			System.out.println("SI ES PRIMO EL NUMERO: "+nu);
			
		}else{
			System.out.println("NO ES PRIMO EL NUMERO: "+nu);
		}
		
		
		
		
		
		int x=1;
		
		int y=primo(x);
		
		
		

	}

	private static int primo(int x) {
	
		return 0;
	}

}
