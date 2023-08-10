nome = input('Digite o seu nome: ')
idade = input('Digite a sua idade: ')

if nome and idade != '':
    print(f'Seu nome é: {nome}')
    print(f'Seu nome invertido {nome[::-1]}')
    if ' ' in nome:
        print(f'Seu nome tem espaços')
        print(f'seu nome tem {(len(nome))} letras') 
    else:
        print('Seu nome não tem espaços')
        print(f'seu nome tem {len(nome)} letras')

    print(f'A primeira letra do seu nome é: {nome[0]}')
    print(f'A ultima letra do seu nome é: {nome[-1]}' )
else:
    print('Desculpe você deixou campos vazios')
    

    
    
