#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

//FUN��O RECURSIVA PARA RETORNAR O FATORIAL DE UM N�MERO QUALQUER

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

    printf("Digite um n�mero para receber o fatorial");
    scanf("%d",&a);

    n = calculafatorial(a);

    printf("O fatorial de %d �: %d",a,n);


return;
}
