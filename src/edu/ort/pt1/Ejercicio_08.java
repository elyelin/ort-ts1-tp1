package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_08 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int dia = 0;
		
		System.out.println("Ingresa un numero: ");
		dia = input.nextInt();
		
		if (dia == 1) {
			System.out.println("Es Domingo");
		} else if (dia == 2){
			System.out.println("Es Lunes");
		} else if (dia == 3) {
			System.out.println("Es Martes");
		} else if (dia == 4) {
			System.out.println("Es Miercoles");
		} else if (dia == 5){
			System.out.println("Es Jueves");
		} else if (dia == 6) {
			System.out.println("Es Viernes");
		} else if (dia == 7){
			System.out.println("Es sabado");
		} else {
			System.out.println("El dia ingresado no es valido");
		}
		
		input.close();
		
	}

}
