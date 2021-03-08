package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_12 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int dado1, dado2, dado3;
		int contador = 0;
		
		System.out.println("Ingresar un numero: ");
		dado1 = input.nextInt();
		if (dado1 == 6){
			contador = contador + 1;
		}
		
		System.out.println("Ingresar un numero: ");
		dado2 = input.nextInt();
		if (dado2 == 6){
			contador = contador + 1;
		}
		
		System.out.println("Ingresar un numero: ");
		dado3 = input.nextInt();
		if(dado3 == 6){
			contador = contador + 1;
		}
		
		switch (contador){
		case 3: 
			System.out.println("Excelente");
			break;
		case 2:
			System.out.println("Muy bien");
			break;
		case 1:
			System.out.println("Regular");
			break;
		default: 
			System.out.println("Insuficiente");
			break;
		}
		
		input.close();
	}

}