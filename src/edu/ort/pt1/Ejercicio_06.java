package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_06 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1;
		
		System.out.println("Ingresa un numero mayor a cero: ");
		num1 = input.nextInt();
		
		if (num1%2==0) {
			System.out.println("El numero que ingresaste es par");
		} else {
			System.out.println("El numero que ingresaste es impar");
		}
	
		input.close();
		
	}

}
