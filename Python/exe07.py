nome = input('digite seu nome: ')

if len(nome) <= 4:
    print('Seu nome é pequeno')
elif len(nome) == 5 or len(nome) <=6:
    print('Seu nome é normal')
elif len(nome) > 6:
    print('Seu nome é grande')