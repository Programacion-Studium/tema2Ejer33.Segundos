package es.Studium.Segundos;

import java.util.Scanner;

public class Segundos2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  edad;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//Imprimimos por pantalla al cliente
		System.out.println("Introduzca su edad:");
		//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
		edad = teclado.nextInt();
		edadProc(edad);	
		teclado.close();
	}
	 private static void edadProc(int a)
	    {
	           System.out.println("Su edad en segundos es "+(long)a*365*24*60*60+" Segundos");
	    }
}
