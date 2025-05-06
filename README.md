# conversor_de_moedas
Criação de sistema de conversão de moedas para o challenge curso alura ONE
Sistma desenvolvido em JAVA para o curso de BackEnd
# Caracteristicas 
O sistema apresenta uma tela de seleção para o usuario escolher uma opção de conversão de moedas 
Nesse sistemas temos as opções: REAL, DOLAR E PESO ARGENTINO 

![image](https://github.com/user-attachments/assets/690d553c-e144-4358-9743-c296dee76505)

O Usuario seleciona o numero da moeda que deseja fazer a conversão  e logo apos o valor que deseja coneverter : 

![image](https://github.com/user-attachments/assets/3cb75f93-2572-4f4b-a5d2-1ab456d79990)

Para sair do sistema deve-se diditar a tecla 7 

# DESENVOLVIMENTO: 
Para trazer os valores das moedas foi usada a api exchangerate-api e a biblioteca Gson para converter o array 

# Classes 

O sistema tem duas classes:  A principal onde ocorre o menu a a ConsultaMoeda que faz a requisição da API e faz o calculo da conversão
