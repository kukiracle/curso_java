package Colas_Practica;

public class pila {
	  private Object vectorPila[];		
		 private int TOP;
		 public pila()
		 {
			 vectorPila=new Object[100];
		      TOP=0;
		 }
		 public boolean EsVacio() {
			 if(TOP==0)
			 {
				 return true;
			 }
			 else
				 return false;
		 }
		 
		 public boolean EsLlena(int N) {
			 if(TOP==N)
			 {
				 return true;
			 }
			 else
				 return false;
		 }
		 
		 public Object Eliminar() {
			 Object elemento;
			 if(TOP==0)
			 {
				 System.out.print("PILA VACIA");
				 return null;
			 }
			 else {
				 elemento=vectorPila[TOP];
				 TOP=TOP-1;
				 return elemento;
			 }
		 }
		 
		 public Object insertar( Object elemento,int N) {
			 if(TOP==N)
			 {
				 System.out.print("PILA LLENA");
				 return null;
			 }
			 else {
				TOP=TOP+1;
				vectorPila[TOP]=elemento;
				return elemento;
			 }
			 
		 }
		 
		 //ejercicio  9 igualar pilas
		 public Object igualar(int pila2 ) {
			 int cont=0;
			 int  elemento;
				   elemento=(Integer)(vectorPila[TOP]);
				   if(elemento==pila2)
					{
					 cont++;
					}
			 return cont;
		 }
		 
		 //ejercicio 10 MAYOR
		 public Object mayor() 
		 {
             int elemento,mayor=0;
	         
			 if(TOP==0)
			 {
				 System.out.print("PILA VACIA");
				 return null;
			 }
			 else {
				 while(TOP!=0)
					{
					 elemento=(Integer)(vectorPila[TOP]);
							if(elemento>mayor)
							{	
								mayor=elemento;
							}
							 TOP=TOP-1;
					}				 
				 return mayor;
			 }
		 }
		 
		//ejercicio 10 MENOR
		 public Object menor() {
			 int elemento,menor=9;
	         
			 if(TOP==0)
			 {
				 System.out.print("PILA VACIA");
				 return null;
			 }
			 else {
				 while(TOP!=0)
					{
					 elemento=(Integer)(vectorPila[TOP]);
							if(elemento<menor)
							{	
								menor=elemento;
							}
							 TOP=TOP-1;
					}				 
				 return menor;
			 }
		 }
}
