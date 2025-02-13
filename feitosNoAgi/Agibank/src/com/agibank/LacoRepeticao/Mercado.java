package com.agibank.LacoRepeticao;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {

        /*
        * Em uma loja, todos os clientes que comprarem mais de R$ 300,00
          receberão um desconto proporcional ao valor de sua compra, de acordo com a tabela abaixo:
          Você foi incumbido de fazer um programa que permita que o cliente entre com o valor
          de cada produto comprados pelo cliente. Mostre o total da compra,
          o valor do desconto e o preço a pagar para cada cliente. Pergunte ao usuário
          se deseja terminar a digitação dos produtos, também é necessário verificar
          se existem mais clientes para serem atendidos
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("BEM VINDO AO SUPERMERCADO SOMADOR!");
        System.out.print("\n");

        float valorProd = 0;
        int quantProd = 0;
        char respMaisCliente, respMaisProd;

        //no programa há dois Do , um roda uma parte do programa dos produtos
        //o outro controla se há ou não mais clientes

        do {

            System.out.print("Digite quantos produtos serão lidos: ");
            quantProd = sc.nextInt();

            //soma é uma variável local do DoWhile para eventuais novos
            //produtos
            float soma = 0;

            //esse DoWhile serve para a soma dos valores dos produtos
            //e perguntar se deseja adicionar mais produtos
            do {
                for (int prod = 1; prod <= quantProd; prod++) {
                    System.out.printf("\nDigite o valor do produto %d: ", prod);
                    valorProd = sc.nextFloat();
                    soma += valorProd;
                }
                //faz a verificação se deseja adicionar mais produtos
                System.out.print("\nDeseja adicionar mais produtos? (s/n): ");
                respMaisProd = sc.next().charAt(0);

                //cria um laço que se repete até o usuário digitar
                //a resposta esperada
                while (respMaisProd != 's' && respMaisProd != 'n') {
                    System.out.print("Entrada inválida. Deseja adicionar mais produtos? (s/n): ");
                    respMaisProd = sc.next().charAt(0);
                }

                if (respMaisProd == 's') {
                    //pergunta quantos serão adicionados para saber
                    //até onde o laço for deve se repetir na variável "quantProd"
                    System.out.print("Quantos? ");
                    quantProd = sc.nextInt();
                }


                //faz o cálculo dos descontos com base no valor
                //o  "f" da divisão vem de float, por ser
                //divisão de inteiros mas com resultado em float
                if (soma >= 300 && soma <= 500) {
                    soma = soma - (soma * (5 / 100f));
                } else if (soma >= 501 && soma <= 1000) {
                    soma = soma - (soma * (10 / 100f));
                } else if (soma > 1000) {
                    soma = soma - (soma * (12 / 100f));
                }

            } while (respMaisProd == 's'); // sai do DoWhile


            //sai do DoWhile e imprime o valor da compra com o desconto já incluso
            System.out.printf("\nValor total da compra é igual a R$%.2f", soma);

            //caso a resposta seja 's' , reinicia o programa
            //caso a resposta seja 'n',  encerra o programa
            System.out.print("\nExistem mais clientes a serem atendidos? (s/n): ");
            respMaisCliente = sc.next().charAt(0);

            //cria um laço que se repete até o usuário digitar
            //a resposta esperada
            while (respMaisCliente != 's' && respMaisCliente != 'n') {
                System.out.print("Entrada inválida. Existem mais clientes a serem atendidos? (s/n): ");
                respMaisCliente = sc.next().charAt(0);
            }


        } while (respMaisCliente == 's'); //sai do DoWhile principal

        sc.close();

    }
}