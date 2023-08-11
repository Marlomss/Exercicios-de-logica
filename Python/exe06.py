h = input('Digite a hora ')
h = int(h)

if 0 <= h <= 11:
    print('Bom dia')
elif 12 <= h <= 17:
    print('Boa tarde')
elif 18 <= h <=23:
    print('Boa noite')