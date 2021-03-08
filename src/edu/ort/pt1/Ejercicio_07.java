package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_07 {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		System.out.println("Ingresa tres numeros: ");
		num1 = input.nextInt();
		input.nextLine();
		num2 = input.nextInt();
		input.nextLine();
		num3 = input.nextInt();
		input.nextLine();

		if (num1 == num2 && num2 == num3){
			System.out.println("Los numeros son iguales");
		} else if (num1 >= num2 && num1 >= num3) {
			System.out.println("El mayor numero es num1: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("El mayor numero es num2: " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("El mayor numero es num3: " + num3);
		}

		input.close();

	}

}
