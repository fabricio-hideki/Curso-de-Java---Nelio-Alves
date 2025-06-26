package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee: #" + (i+1));
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			// validar se o id está disponível ou já está em uso.
			while (hasId(list, id)) {
				System.out.println("Id already taken, try another one: ");
				id = sc.nextInt();
			}
			
			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salary: ");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			list.add(func);
			
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		// Aqui é feito com estrutura lambda
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		// Aqui uma outra alternativa usando a posição como parametro.
		//Integer pos = posicao(list, id);
		
		
		if(func == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			func.aumentoSalario(porcentagem);
		}
	
		System.out.println();
		System.out.println("List of employees: ");
		for (Funcionario f : list) {
			System.out.println(f);
		}

		sc.close();

	}
	
	// Esse é o método auxilar, para descobrir a posição do objeto.
	public static Integer posicao(List<Funcionario> list, int id){
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	// Esse método auxilar retorna verdadeiro, caso já tenha um id de x valor.
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
