import java.util.Scanner;//impotamos una galeria de java para poder introducir datos por teclado



public class Equals {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);// creamos un Objeto del tipo scanner y le asignamos la variable leer
		// y ahi se almacena el dato escrito por teclado


		String manny="chau";
		String mollo="Chau";


		if (manny.equals(mollo)) {
			System.out.println("si");

		}else {
			System.out.println("no");
		}
		
		
		System.out.println("-----");
		
		System.out.println(manny.equals(mollo));//PREGUNTA SI SON IGUALES LA CADENA
		System.out.println("----");
		
		System.out.println(manny.equalsIgnoreCase(mollo));//ingora MAYUSCULAS
		
		
		


		System.out.println("introdusca su nombre");
		
		
		String nombre=leer.nextLine();//asignamos a la variable nombre 
		//	... los datos por teclado "nextLine admite todo tipo de caracteres numeros letras"
		
		System.out.println(nombre);
		
		System.out.println("-------------------------------------------");
		System.out.println("calculadora");
		
		System.out.println("1 sumar ");
		System.out.println("2 restar");
		System.out.println("3 multiplicacion");
		System.out.println("4 division");
		System.out.println("5 potencia");
		System.out.println("6 modulo");
		int x=leer.nextInt();
		
		
		switch (x) {
		case 1:
			System.out.println("INTRODUSCA NUMERO 1");
			int a=leer.nextInt();
			
			System.out.println("INTRODUSCA NUMERO 2");
			int b=leer.nextInt();
			System.out.println("suma");
			int suma=a+b;
			System.out.println(suma);
			
			break;
			
		case 2:
			System.out.println("INTRODUSCA NUMERO 1");
			int c=leer.nextInt();
			
			System.out.println("INTRODUSCA NUMERO 2");
			int d=leer.nextInt();
			System.out.println("RESTA");
			int resta=c-d;
			System.out.println(resta);
			
			break;
		case 3:
			System.out.println("INTRODUSCA NUMERO 1");
			int e=leer.nextInt();
			
			System.out.println("INTRODUSCA NUMERO 2");
			int f=leer.nextInt();
			System.out.println("multiplicacion");
			
			int mul=e*f;
			System.out.println(mul);
			
			
			break;
		case 4:
			System.out.println("INTRODUSCA NUMERO 1");
			int g=leer.nextInt();
			
			System.out.println("INTRODUSCA NUMERO 2");
			int h=leer.nextInt();
			System.out.println("division");
			
			double div=g/h;
			System.out.println(div);
			
			
			
			break;
		case 5:
			System.out.println("INTRODUSCA NUMERO 1");
			double i=leer.nextDouble();
			
			System.out.println("INTRODUSCA NUMERO 2");
			double j=leer.nextDouble();
			System.out.println("potencia");
			double pote=Math.pow(i, j);
			
			System.out.println(pote);
			
			
			
			
			break;
		case 6:
			System.out.println("INTRODUSCA NUMERO 1");
			int l=leer.nextInt();
			
			System.out.println("INTRODUSCA NUMERO 2");
			int m=leer.nextInt();
			System.out.println("modulo");
			
			double mod=l%m;
			System.out.println(mod);
			break;
			

		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
