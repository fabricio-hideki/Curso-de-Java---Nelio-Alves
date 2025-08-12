package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client cli = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.println("Status:");
		// Ele converte o valor recebido da String para o valor definido no OrderStatus (na enumeração)
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cli);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data: ");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem  orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
			
		}
		sc.nextLine();
		System.out.println("ORDER SUMMARY: ");
		
		System.out.println(order);
		
		sc.close();
	}

}
