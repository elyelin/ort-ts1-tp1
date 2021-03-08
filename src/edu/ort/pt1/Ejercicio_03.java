package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_03 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre;
		
		System.out.println("Ingrese su nombre: ");
		nombre = input.nextLine();
		
		System.out.println("Bienvenido " + nombre);
		
		input.close();
	}

}
