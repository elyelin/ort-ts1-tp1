package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_05 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		float resultado;
		
		System.out.println("Ingrese dos numeros: ");
		num1 = input.nextInt();
		input.nextLine();
		num2 = input.nextInt();
		
		resultado = num1 / num2;
		
		if (num2 == 0){
			System.out.println("No se puede dividir por cero");
		} else {
			System.out.println(num1 + " / " + num2 + " = " + resultado);
		}
		
		input.close();
		
	}

}
