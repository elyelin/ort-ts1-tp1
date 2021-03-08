package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_13 {
	
	public static Scanner input = new Scanner(System.in);
	
	static final int SALARIO_HORA = 16;
	static final int HORA_EXTRA = 20;

	public static void main(String[] args) {
		int horas;
		int horasMinimas = 40;
		int salario = 0;
		
		System.out.println("Ingresa la cantidad de horas: ");
		horas = input.nextInt();
		input.nextLine();
		
		if (horas <= horasMinimas){
			salario = (horas * SALARIO_HORA);
		} else {
			salario = ((SALARIO_HORA  * horasMinimas) + ((horas - horasMinimas) * HORA_EXTRA));
		} 
		System.out.println("Salario correspondiente: $" + (salario));
		
		input.close();
	}

}


/*CONSTANTE VALOR 16
CONTANTE VALOR 20
INGRESAR LA CANTIDAD DE HORAS USUARIO
MOSTRAR PANTALLA
$20 por cada hora extra.
 */
/* primero saber lo que el cliente quiere; despues dame los datos; */
/* Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
manera:
• Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar
el 16)
• Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20
por cada hora extra. (crear una constante para almacenar el 20)
Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana, y mostrar por
pantalla el salario correspondiente.
*/
