package es.Studium.Segundos;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  edad;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//Imprimimos por pantalla al cliente
		System.out.println("Introdusca su edad:");
		//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
		edad = teclado.nextInt();
		System.out.println("Su edad en segundos es "+funcionedad(edad)+" Segundos");
		teclado.close();
	}
	public static long funcionedad(int a)
	{
		return (long)a*365*24*60*60;
	}

}
