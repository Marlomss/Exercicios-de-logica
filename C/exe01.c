//1)Faça um programa que criptografe cada palavra de uma frase, substituindo por ? a última metade de  seus caracteres.  Exemplo: A aula é boa mas poderia ser mais curta.
//? au?? ? b?? m?? pod???? s?? ma?? cu???.

#include <stdio.h>
#include <locale.h>
#include <string.h>
#include <ctype.h>

void criptografia(char palavra[])
{
    int metade = strlen(palavra)/2;
    for (int i = metade; i < strlen(palavra); i++)
    {
        palavra[i] = '?';
    }
}

void main()
{
    setlocale(LC_ALL, "Portuguese");
    char text[250];
    printf("Digite uma frase para realizar a criptografia.\n");
    gets(text);
    char *palavra = strtok(text, " ");
    while(palavra != NULL)
    {
        criptografia(palavra);
        printf("%s ",palavra);
        palavra = strtok(NULL, " ");
    }
}
