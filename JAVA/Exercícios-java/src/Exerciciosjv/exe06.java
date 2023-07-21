package Exerciciosjv;

import java.util.Scanner;

public class exe06 {

public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
		int a = 0, b = 1, fibo = 0;
		
		
		System.out.println("Digite quantos números da sequência de Fibonacci você quer ver");
		int n = scanner.nextInt();
		int vet[] = new int[n];
		System.out.println("A sequência de Fibonacci até a "+n+"º posição é: ");
		
		
		for(int i = 0; i < vet.length ;i++) {
			fibo = a + b;
			a = b;
			b = fibo ;
			vet[i] = a;
			System.out.println(vet[i]);
		}
			
    
}
}