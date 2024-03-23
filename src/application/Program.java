package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Adicionar os números do usuário na lista
		List<Integer>numbers = new ArrayList<>();
		try {
			System.out.println("Quantos números você quer digitar? ");
			int n = sc.nextInt();
			
			for(int i = 1; i<=n; i++) {
				System.out.print(i +"#: ");
				int number = sc.nextInt();
				
				numbers.add(number);
			}
		
		// Executar o método Ordenar()	
		System.out.println();
		System.out.println("Lista ordenada:\n" + Arrays.asList((Ordenar(numbers))));
		
		}
		catch(InputMismatchException e ) {
			System.out.println("Digite apenas números inteiros!!");
		}
		
		sc.close();
	}

	public static Integer[] Ordenar(List <Integer> numbers) {
		
		//Verificar cada número e adicionar na respetiva lista 
		List<Integer> evens = new ArrayList<>();
		List<Integer> odds = new ArrayList<>();

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				evens.add(numbers.get(i));
			} 
			else {
				odds.add(numbers.get(i));
			}
		}
		
		//Ordenar do menor para o maior e unir tudo em um array
		Collections.sort(evens);
		Collections.sort(odds);

		Integer[] numbersFinal = new Integer[evens.size() + odds.size()];

		int i=0;
		for (int number : evens) {
			numbersFinal[i] = number;
			i++;
		}
		
		for (int number : odds) {
			numbersFinal[i] = number;
			i++;
		}

		 return numbersFinal;
		}
	}



