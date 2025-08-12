package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> product = new ArrayList<>();
		
		for (int i = 1;  i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			
			System.out.println("Common, used or imported (c/u/i)? ");
			char resp = sc.next().charAt(0);
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			if (resp == 'i') {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product p = new ImportedProduct(name, price, customsFee);
				product.add(p);
			}
			else if(resp == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product p = new UsedProduct(name, price, manufactureDate);
				product.add(p);
			}
			else {
				Product p = new Product(name, price);
				product.add(p);
			}
		
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product pr : product) {
			System.out.println(pr.priceTag());
		}
		
		sc.close();

	}

}
