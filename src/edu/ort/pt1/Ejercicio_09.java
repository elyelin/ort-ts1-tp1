package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_09 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nombre1, nombre2, nombre3;
		int capital1, capital2, capital3, total;
		float porcentaje1, porcentaje2, porcentaje3;
		
		System.out.print("Ingresa tu nombre y el capital que deseas aportar: ");
		nombre1 = input.nextLine();
		capital1 = input.nextInt();
		input.nextLine();
		
		System.out.print("Ingresa tu nombre y el capital que deseas aportar: ");
		nombre2 = input.nextLine();
		capital2 = input.nextInt();
		input.nextLine();
		
		System.out.print("Ingresa tu nombre y el capital que deseas aportar: ");
		nombre3 = input.nextLine();
		capital3 = input.nextInt();
		input.nextLine();
		
		total = capital1 + capital2 + capital3;
		
		porcentaje1 = capital1 * 100 / total;
		porcentaje2 = capital2 * 100 / total;
		porcentaje3 = capital3 * 100 / total; 
		
		System.out.println(nombre1 + ": capital aportado: $ " + capital1 + ", Porcentaje del capital: " + porcentaje1 + "% , Monto total aportado: $" + total);
		System.out.println(nombre2 + ": capital aportado: $ " + capital2 + ", Porcentaje del capital: " + porcentaje2 + "% , Monto total aportado: $" + total);
		System.out.println(nombre3 + ": capital aportado: $ " + capital3 + ", Porcentaje del capital: " + porcentaje3 + "% , Monto total aportado: $" + total);
		
		input.close();
	}

}
