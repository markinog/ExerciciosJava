package com.agibank.Maratona1402;

import java.util.InputMismatchException;
import java.util.Scanner;


import static java.lang.Math.max;

public class maratona {
    public static void main(String[] args) {

        //NOTA: 100
        //NOME DO DEV: MARCUS VINICIUS DE SOUZA GOMES
        //NOME DO TESTER: THIAGO FERRER
        //TESTER COMENTÁRIO:

        String reset = "\u001B[0m";

        String green = "\u001B[32m";

        String bold = "\u001B[1m";


        Scanner sc = new Scanner(System.in);

        double[][] precosAtivos = {

                {22.5, 23.0, 22.0, 24.5, 25.0},
                {85.0, 86.5, 84.0, 83.5, 87.0},
                {30.0, 29.5, 30.5, 31.0, 32.5}

        };

        int ativoEscolhido = 0;
        int diaEscolhido = 0;

        System.out.println(bold + green + "\n\n------------------------------------------------" + reset);

        System.out.println("\t\t\t\tPETR4 -> 1\n");
        System.out.println("\t\t\t\tVALE3 -> 2\n");
        System.out.println("\t\t\t\tITUB4 -> 3\n");
        System.out.println(bold + green + "\n------------------------------------------------" + reset);


        try {

            System.out.print("\nDigite qual ativo deseja saber a media dos dias: ");
            int ativos = sc.nextInt();


            System.out.print("\nAgora, digite um ativo para visualizar seu preço:");
            ativoEscolhido = sc.nextInt();

            System.out.print("\nDigite um dia para visualizar o preço do ativo escolhido:");
            diaEscolhido = sc.nextInt();

            if (ativos < 0 || ativoEscolhido < 0 || diaEscolhido < 0) {

                throw new IllegalArgumentException("Erro. Os campos devem ser preenchidos exclusivamente com números positivos.");

            }
            System.out.println(bold + green + "\n\n------------------------------------------------" + reset);


            ativos = ativos - 1; //o indice do primeiro é 0, então o ativos-1 corrije o número do indicie i

            if (ativos == 0) {
                System.out.printf("\nMédia do ativo PETR4: %.2f", calculaMediaPrecos(precosAtivos, ativos));
            } else if (ativos == 1) {
                System.out.printf("\nMédia do ativo VALE3: %.2f", calculaMediaPrecos(precosAtivos, ativos));
            } else if (ativos == 2) {
                System.out.printf("\nMédia do ativo ITUB4: %.2f", calculaMediaPrecos(precosAtivos, ativos));
            }

            System.out.println(bold + green + "\n\n------------------------------------------------" + reset);
            System.out.printf("%s", calcularMaiorValorizacao(precosAtivos));

            System.out.println(bold + green + "\n\n------------------------------------------------" + reset);

            System.out.printf("%s", calcularLucroOuPrejuizo(precosAtivos));

            System.out.println(bold + green + "\n\n------------------------------------------------" + reset);


            System.out.printf("\nPreço do dia %d: R$%.2f", diaEscolhido, consultaPreco(precosAtivos, diaEscolhido, ativoEscolhido));

        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro. Apenas números são aceitos.");
        }


    }

    //METODO CORRETO !
    public static double calculaMediaPrecos(double[][] precos, int ativo) {

        double mediaAtivo = 0;
        int quantDias = 0;

        for (int i = ativo; i <= ativo; i++) {
            for (int j = 0; j < precos[i].length; j++) {
                mediaAtivo = mediaAtivo + precos[i][j];
                quantDias++;
            }

        }
        mediaAtivo = mediaAtivo / quantDias;

        return mediaAtivo;
    }

    public static String calcularMaiorValorizacao(double[][] precos) {
        double maiorValorizacao = 0;
        double precoInicial = 0;
        double precoFinal = 0;

        for (int i = 0; i < precos.length; i++) {
            double menorValor = precos[i][0];
            double maiorValor = precos[i][0];

            for (int j = 0; j < precos[i].length; j++) {
                if (precos[i][j] < menorValor) {
                    menorValor = precos[i][j];
                }
                if (precos[i][j] > maiorValor) {
                    maiorValor = precos[i][j];
                }
            }

            double variacao = maiorValor - menorValor;
            if (variacao > maiorValorizacao) {
                maiorValorizacao = variacao;
                precoInicial = menorValor;
                precoFinal = maiorValor;
            }
        }

        return "\nMaior variação: " + maiorValorizacao + " (de " + precoInicial + " para " + precoFinal + " ->  +%" + String.format("%.2f", (maiorValorizacao / precoFinal) * 100) + ")";
    }

    public static String calcularLucroOuPrejuizo(double[][] precos) {
        String resultado = "\nLucro / Perda de cada ativo: \n";

        for (int i = 0; i < precos.length; i++) {
            double precoInicial = precos[i][0];
            double precoFinal = precos[i][precos[i].length - 1];
            double variacaoPercentual = ((precoFinal - precoInicial) / precoInicial) * 100;
            String status;

            if (variacaoPercentual >= 0) {
                status = "LUCRO";
            } else {
                status = "PREJUÍZO";
            }


            resultado += "\nAtivo " + (i + 1) + ": " + status + " (" + String.format("%.2f", variacaoPercentual) + "%)";

            if (i != precos.length - 1) {
                resultado += ", ";
            }
        }

        return resultado;
    }

    public static double consultaPreco(double[][] precos, int dia, int ativo) {

        double retornoValor = 0;
        dia = dia - 1;
        ativo = ativo - 1;

        for (int i = ativo; i <= ativo; i++) {
            for (int j = dia; j <= dia; j++) {

                retornoValor = precos[ativo][dia];
                break;
            }
        }

        return retornoValor;
    }


}