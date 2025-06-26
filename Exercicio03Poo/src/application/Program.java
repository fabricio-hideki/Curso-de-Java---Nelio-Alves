package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student st = new Student();
		
		st.name = sc.nextLine();
		st.nota1 = sc.nextDouble();
		st.nota2 = sc.nextDouble();
		st.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", st.finalGrade());
		
		if (st.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING " +st.aprovadoReprovado() + " POINTS");
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
