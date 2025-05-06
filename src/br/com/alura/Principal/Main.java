package br.com.alura.Principal;


import br.com.alura.Modelos.ConsultaMoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 7) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("*****************************");
            System.out.println("Seja bem vindo/a ao conversor de moedas  ");
            System.out.println("Escolha uma conversão no menu: ");
            System.out.println("1 - Dolar >>> Peso Argentinno");
            System.out.println("2 - Peso Argentino para Dolar");
            System.out.println("3 - Real  para Dolar");
            System.out.println("4 - Dolar para Real");
            System.out.println("5 - Euro  para Dolar");
            System.out.println("6 - Dolar  para Euro");
            System.out.println("7 - SAIR: ");
            System.out.println("*******************************");
            opcao = leitura.nextInt();
            System.out.println("*******************************");

            if (opcao == 1) {
                System.out.println("Digite o Valor:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consultaMoeda = new ConsultaMoeda();
                double resultado = consultaMoeda.buscaMoedas("USD", "ARS", valor);
                System.out.println("Resultado da Conversao: O valor de "+ valor+ "USD e igual a " + resultado + "ARS");
            } else if (opcao == 2) {
                System.out.println("Digite o Valor:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consultaMoeda = new ConsultaMoeda();
                double resultado = consultaMoeda.buscaMoedas("ARS", "USD", valor);
                System.out.println("Resultado da Conversao: O valor de "+ valor+ "ARS e igual a " + resultado + "USD");

            } else if (opcao == 3) {
                System.out.println("Digite o Valor:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consultaMoeda = new ConsultaMoeda();
                double resultado = consultaMoeda.buscaMoedas("BRL", "USD", valor);
                System.out.println("Resultado da Conversao: O valor de "+ valor+ "BRL e igual a " + resultado + "USD");
            } else if (opcao == 4) {
                System.out.println("Digite o Valor:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consultaMoeda = new ConsultaMoeda();
                double resultado = consultaMoeda.buscaMoedas("USD", "BRL", valor);
                System.out.println("Resultado da Conversao: O valor de "+ valor+ "USD e igual a " + resultado + "BRL");
            } else if (opcao == 5) {
                System.out.println("Digite o Valor:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consultaMoeda = new ConsultaMoeda();
                double resultado = consultaMoeda.buscaMoedas("EUR", "USD", valor);
                System.out.println("Resultado da Conversao: O valor de "+ valor+ "EUR e igual a " + resultado + "USD");
            } else if (opcao == 6) {
                System.out.println("Digite o Valor:");
                double valor = leitura.nextDouble();
                ConsultaMoeda consultaMoeda = new ConsultaMoeda();
                double resultado = consultaMoeda.buscaMoedas("USD", "EUR", valor);
                System.out.println("Resultado da Conversao: O valor de "+ valor+ "USD e igual a " + resultado + "EUR");
            }else {
            System.out.println("saindo do sistema");
            break;
        }
        }

    }
}