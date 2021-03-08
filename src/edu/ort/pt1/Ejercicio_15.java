package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_15 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean estaEnA = false;
		boolean estaEnB = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;
		int valor;
		int dosDigitos = 10;
		
		System.out.println("Ingresa algo: ");
		valor = input.nextInt();
		
		if (valor < dosDigitos){
			estaEnA = true;
		}
		if (valor%2!=0) {
			estaEnB = true;
		} 
		if (estaEnA && estaEnB){
			estaEnAmbos = true;
		}
		if (!estaEnA && !estaEnB){
			noEstaEnNinguno = true;
		}
		
		if (estaEnAmbos){
			System.out.println("Esta en ambos");
		}else if (estaEnA){
			System.out.println("Esta en A");
		}else if (estaEnB){
			System.out.println("Esta en B");
		}else {
			System.out.println("No esta en ninguno");
		}
			 
	input.close();
	}

}