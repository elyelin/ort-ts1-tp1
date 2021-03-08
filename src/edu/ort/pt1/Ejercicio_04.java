package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_04 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int resultado;
		
		System.out.println("Ingrese dos numeros: ");
		num1 = input.nextInt();
		input.nextLine();
		num2 = input.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println("La suma entre " + num1 + " y " + num2 + ", da como resultado " + resultado);
	
		input.close();
	}

}
