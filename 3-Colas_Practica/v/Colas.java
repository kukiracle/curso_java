package Colas_Practica;

import java.awt.print.Printable;

import javax.print.attribute.standard.PrinterLocation;

public class Colas {
	
	//definicion de variables
	private Object c1[];
	private int n;
	private int frente=0;
	private int fin=0;
	
	//costructor sin parametros
	public Colas() {
		this.c1=new Object[100];
		this.n=100;
		this.frente=0;
		this.fin=0;
	}
	
	//constructor con parametros
	public Colas(int n) {
		this.c1=new Object[n];
		this.n=n;
		this.frente=0;
		this.fin=0;
	}
	
	//metodo para pedir n
	public void setN(int n) {
		this.n=n;
		this.c1=new Object[n];
	}
	
	//metodo retornar
	public int getn() {
		return this.n;
	}
	
	//debuelve frente
	public int getfrente() {
		return this.frente;
	}
	
	//debuelve fin
	public int getfin() {
		return this.fin;
	}
		
	//metodo para verificar cola vacia
	public boolean esvacia() {
		if(this.frente==this.fin)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	//metodo es llena
	public boolean esllena() {
		if (this.fin==this.n) {
			return true;
		}
		else {
			return false;
		}
	}

	//metodo para llenar
	public void insertar(Object elem) {
		if (this.fin!=this.n) {
			this.c1[this.fin]=elem;
			this.fin++;
		}
		else {
			System.out.println("Cola llena");
		}
	}
	
    //metodo para eliminar
	public Object eliminar() {
		Object elem;
		if (this.frente!=this.fin) {
			elem=this.c1[this.frente]; 
			this.frente++;
			return elem;
		}
		else {
			System.out.println("COLA VACIA");
			return null;
		}
	}
	
	//metodo contar numeros elementos
		public int cuenta_numeros_elementos() {
			int cont=0;
			cont=this.fin-this.frente;
			return cont;
		}
		
	//metodo vaciar
	public void vaciar() {
		this.frente=0;
		this.fin=0;	
	}		
}
