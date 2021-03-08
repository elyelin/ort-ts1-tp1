package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_10 {
	
	public static Scanner input = new Scanner(System.in);

	static final int HORA_APERTURA = 10;
	static final int HORA_CIERRE = 18;
	
	public static void main(String[] args) {
		int hora;
		boolean estaAbierto = false;
		
		System.out.println("Ingresar hora: ");
		hora = input.nextInt();
		
		if (hora >= HORA_APERTURA && hora < HORA_CIERRE){
			estaAbierto = true;
		} if (hora < 0 || hora > 24){
			System.out.println("Ha ingresado una hora incorrecta");
		} else if (estaAbierto == true){
			System.out.println("El estacionamiento esta abierto :) ");
		} else {
			System.out.println("El estacionamiento esta cerrado :( ");
		}
		
		input.close();
		
	}

}