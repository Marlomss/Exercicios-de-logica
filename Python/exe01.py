
nome = str(input("Digite o nome: "))
sobrenome = str(input("Digite o sobrenome: "))
idade = int(input("Digite a idade: "))
ano = int(input("Digite o ano de nascimento: "))
if idade >= 18:
    midade = bool(True)
else:
    midade = bool(False)
altmetros = float(input("Digite a altura em metros: "))

print('Nome: ', nome)
print('Sobrenome: ', sobrenome)
print('Idade: ', idade)
print('Ano de nasciment: ', ano)
print('É maior de idade? ', midade)
print('Altura em metros: ', altmetros)