package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_14 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int suma, resta, producto, division, num1, num2;
		char operacion;
		
		System.out.println("-- CALCULADORA -- \n");
		System.out.println("Por favor ingrese la operacion que quiere realizar: ");
		System.out.println("s) para sumar: ");
		System.out.println("r) para resta: ");
		System.out.println("p) para producto: ");
		System.out.println("d) para dividir: ");
		operacion = input.next().charAt(0);

		System.out.println("Ingresa dos numeros: ");
		num1 = input.nextInt();
		input.nextLine();
		num2 = input.nextInt();
		input.nextLine();
		
		switch(operacion){
		case 's':
			suma = num1 + num2;
			System.out.println("El resultado de la suma es: " + suma);
			break;
		case 'r':
			resta = num1 - num2;
			System.out.println("El resultado de la resta es: " + resta);
			break;
		case 'p':
			producto = num1 * num2;
			System.out.println("El resultado del producto es: " + producto);
			break;
		case 'd':
			division = num1 / num2;
			System.out.println("El resultado de la division es: " + division);
			break;
			default:
		}
		
		input.close();
	}

}

