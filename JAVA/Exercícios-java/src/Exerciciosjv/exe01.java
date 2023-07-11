package Exerciciosjv;
import java.util.Scanner;

public class exe01 {
    	
  public static void main(String[] args) {
    
		//CABEÇALHO DE VARIÁVEIS
		double ale = Math.random();//FUNÇÃO QUE CRIA A ALEATORIEDADE
		Scanner e = new Scanner (System.in);//FUNÇÃO QUE EXECUTA A LEITURA IMPORTANDO A CLASSE SCANNER
		int n, i = 0, p = 0; 
		int r = (int) (ale * 11);
        System.out.println("Estou pensando num número entre 0 e 10, você consegue adivinhar?");


		//LOOP DO JOGO
	do {
			i++;
			n = e.nextInt();
			if(n > r) {
			System.out.println("Errou! tenta um pouco menos");
			}else if (n < r) {
			System.out.println("Errou! tenta um pouco mais");
			}
		}while(n!=r);

		//SISTEMA DE PONTUAÇÃO
		if(i<=3){
			p = i*100;
		}else if (i<=6) {
			p = i*10;
		}else {
			p = i*5;
		}
		System.out.println("Acertou! em "+i+ " tentativas, Parabéns!");
		System.out.println("Sua pontuação foi: "+p);
		
    
}
}
