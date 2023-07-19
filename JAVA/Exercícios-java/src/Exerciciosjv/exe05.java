package Exerciciosjv;
import java.util.Scanner;

public class exe05 {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n;
		float n1 =0;
		System.out.print("Digite a quantidade de números: ");
		n = leia.nextInt();
		
		int vet[] = new int [n];
		
		System.out.print("Digite os "+n+" de números:");
		
		for(int i = 0; i<n;i++) {
			vet[i] = leia.nextInt();
			n1 += (float)vet[i];
	
		}
		float r = (float) (n1/n);
		System.out.println("A média é: "+r);

	}

}

