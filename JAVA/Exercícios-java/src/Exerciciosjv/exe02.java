package Exerciciosjv;
import java.util.Arrays;
//soma de dados para RPG

public class exe02{

public static void main(String[] args) {
  
    int n[] = new int[4];//ARRAY INICIALIZADO COM 4 ESPAÇOS
    int s = 0;

     for(int i = 0; i <= 3; i++) { //LOOP PARA FAZER AS ATRIBUIÇÕES DE VALORES ALEATÓRIOS DOS "DADOS"
        n[i] = (int) (1+(5 * Math.random()));//ATRIBUIÇÃO DOS VALORES NO ARRAY
        }
         Arrays.sort(n);//ORGANIZAÇÃO DO ARRAY

    for(int i = 1; i <= 3; i++) {//LOOP PARA SOMAR OS VALORES DENTRO DA VARIÁVEL "S" EXCLUINDO O PRIMEIRO E MENOR ELEMENTO DO ARRAY COMO É DE PRAXE EM JOGOS DE RPG
        s += n[i];
    }
    System.out.println("O número sorteado foi: "+s);//SAÍDA DA SOMA DOS "DADOS JOGADOS"
   
}
}
