package edu.ort.pt1;

import java.util.Scanner;

public class Ejercicio_11 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
        String fechaCompra, nombre, producto;
		int cantidadProducto, precio;
        
		System.out.print("Ingresa fecha de compra YYYYMMDD: ");
		fechaCompra = input.nextLine();
		
		System.out.print("Ingresa tu nombre: ");
		nombre = input.nextLine();
		
		System.out.print("Ingresa el nombre del producto: ");
		producto = input.nextLine();
		
		System.out.print("Ingresa la cantidad de productos: ");
		cantidadProducto = input.nextInt();
		input.nextLine();
		
		System.out.print("Ingresa el precio del producto: ");
		precio = input.nextInt();
		input.nextLine();
		
		System.out.println("Fecha de Compra: " + fechaCompra);
		System.out.println("Nombre del Comprador: " + nombre);
		System.out.println("Producto solicitado: " + producto);
		System.out.println("Cantidad solicitada: " + cantidadProducto);
		System.out.println("Precio Unitario: $" + precio);
		System.out.println("Total a Pagar: $" + (cantidadProducto * precio));
		
		input.close();
	}

}