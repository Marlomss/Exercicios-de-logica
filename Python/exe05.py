num = input('Digite um número inteiro: ')

if num.isdigit():
    num = int(num)
    if num % 2 == 0:
        print('O número é par')
    else:
        print('O número é impar')
else:
    print('Isso não é um número')

#OU

# try:
#     num = int(num)
#     if num % 2 == 0:
#         print('O número é par')
#     else:
#         print('O número é impar')
# except:
#      print('Isso não é um número')