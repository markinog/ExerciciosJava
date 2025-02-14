package com.agibank.EX1302.RetornoMedia;

import java.util.Scanner;

public class ex6 {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int quantidadeDias;

                System.out.print("Digite uma quantidade de dias: ");
                quantidadeDias = sc.nextInt();
                double[] precosAcoesDia = new double[quantidadeDias];

                for (int i = 0; i < quantidadeDias; i++) {
                    System.out.printf("\nDigite o valor da ação do dia %d: ", i+1);
                    precosAcoesDia[i] = sc.nextDouble();
                }


                double retorno = calculaRetornoMedio(precosAcoesDia, quantidadeDias);
                System.out.printf("Retorno médio diário: %.2f", retorno);

            }

            public static double calculaRetornoMedio(double[] precosAcoes, int quantDias) {

                double retornoMedio = 0;


                for (int i = 0; i < precosAcoes.length- 1; i++) {
                    retornoMedio += ((double)1 / (quantDias - 1)) * (((precosAcoes[i + 1] - precosAcoes[i]) / precosAcoes[i]) * 100);
                }

                return retornoMedio;
            }
}
