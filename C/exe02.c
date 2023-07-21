#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

//FUNÇÃO RECURSIVA PARA RETORNAR O FATORIAL DE UM NÚMERO QUALQUER

static int calculafatorial(int a){
    if (a == 0){
        return 1;
    }
    return a * calculafatorial(a-1);
}

void main(){
    int a, n;
    setlocale(LC_ALL,"Portuguese");
    setlocale(LC_ALL,"Portuguese");

    printf("Digite um número para receber o fatorial");
    scanf("%d",&a);

    n = calculafatorial(a);

    printf("O fatorial de %d é: %d",a,n);


return;
}
