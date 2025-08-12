package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Cicle (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color c = Color.valueOf(sc.next());
			if(resp == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				shape.add(new Rectangle(c, width, height));
			}
			else {
				System.out.println("Radius:");
				double radius = sc.nextDouble();
				shape.add(new Circle(c, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPES AREAS: ");
		for(Shape sh : shape) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
		sc.close();

	}

}
