package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); // Esse é o construtor padrão. Ele é opcional.
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Product p = new Product(name, price); // isso são os parametros do contrutor. Ele obriga que nome, preço e quantidade sejam inseridos. Garantindo que não haja produtos sem esses valores.
		
		p.setName("Aparelho televisivo");
		System.out.println("Updated name: " + p.getName());
		p.setPrice(1200.00);
		System.out.println("Updated price: " + p.getPrice());
		
		System.out.println("Product data: " + p);
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		
		System.out.println("\nUpdated data: " + p);
		
		System.out.println("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + p);
		
		sc.close();
	}

}
