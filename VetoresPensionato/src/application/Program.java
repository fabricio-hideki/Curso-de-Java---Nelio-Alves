package application;

import java.util.Arrays;
import java.util.Locale;
import java.security.*;
import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Pensionato [] pensionato = new Pensionato[10];
		
		String name;
		String email;
		int room = 0;
		
		sc.nextLine();
		for (int i = 0;  i < n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("E-mail: ");
			email = sc.nextLine();
			System.out.println("Room: ");
			room = sc.nextInt();
			
			pensionato[room] = new Pensionato(name, email);
			
			sc.nextLine();
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < pensionato.length; i++) {
			if (pensionato[i] != null) {
				System.out.println(i + ": " + pensionato[i].toString());
			}
			
		}
		sc.close();
	}

}
