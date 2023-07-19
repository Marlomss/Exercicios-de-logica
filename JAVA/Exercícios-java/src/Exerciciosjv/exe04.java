package Exerciciosjv;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float nota = 0, n2 = 0;
		int n1;
		System.out.print("Quantas notas quer informar?");
		n1 = leia.nextInt();
		
		for(int i = 1; i <= n1 ;i++) {
			System.out.print("Digite a nota "+i+":");
			nota = leia.nextFloat();
			n2 += nota;
		}
		System.out.println("A média das notas é "+(n2/n1));
		
	}

}
