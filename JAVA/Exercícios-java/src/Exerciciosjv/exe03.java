package Exerciciosjv;
import java.util.Scanner;
//exercício que mostra todos os números inteiros menores do que o digitado pelo usuário



public class exe03 {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner leia = new Scanner (System.in);
int n1 = 0, c = 0;
        
        
System.out.println("Digite um número inteiro positivo");
n1 = leia.nextInt();
        
        for(int i = 2 ; i <= n1 ; i++) {
            c = 0 ;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0 ) {
                    c++;
                    break;
                }
               }
                if(c == 0) {
                    System.out.println(i);

                
            }
        }
    }
}
