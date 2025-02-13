package com.agibank.Matriz.Maratona0702;

import java.util.Scanner;

public class ExMaratona {
    public static void main(String[] args) {

        //ex2
        // i = 0 (4% na linha 0)
        //i = 1 ( 6% na linha 1)
        //cada linha vai ser uma projeção de taxa diferente
        //double[] contribuidaoAnual = double[anos]

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade atual:");
        int idadeAtual = scanner.nextInt();

        System.out.println("Digite a contribuição mensal:");
        double contribuicaoMensal = scanner.nextDouble();

        System.out.println("Digite a taxa de juros anual:");
        double taxaJurosAnual = scanner.nextDouble();

        double taxaJurosMensal = (taxaJurosAnual/100)/12;

        System.out.println("Digite a idade o qual quer se aposentar:");
        int idadeAposentadoria = scanner.nextInt();

        int deltaIdadeAnual = (idadeAposentadoria-idadeAtual);
        int deltaIdadeMeses = deltaIdadeAnual*12;
        double saldoAcumulado = 0;
        double[] contribuicaoAnual = new double[deltaIdadeAnual];



        for (int i = 0; i < deltaIdadeMeses; i++) {
            saldoAcumulado = (saldoAcumulado + contribuicaoMensal) * (1 + taxaJurosMensal);
            if((i+1)%12 == 0){
                contribuicaoAnual[i/12] = saldoAcumulado;
            }
        }

        for (int i = 0; i < contribuicaoAnual.length; i++) {
            System.out.println(contribuicaoAnual[i]);
        }

        int percentProjecao = 4;
        double[][] taxaJuros = new double[contribuicaoAnual.length][4];

        for(int i = 0; i < contribuicaoAnual.length; i++){
            for(int j = 0; j < contribuicaoMensal; j++){

                taxaJuros[i][j] = contribuicaoMensal * ((1 + taxaJurosAnual)* ((deltaIdadeAnual+1)*12 - 1)/12);

            }
        }
        System.out.println("\n");
        System.out.println("\n");

        for(int i = 0; i < contribuicaoAnual.length; i++){
            for(int j = 0; j < contribuicaoMensal; j++){


                System.out.printf("%.2f ", taxaJuros[i][j]);

            }
            System.out.println("\n");
        }
    }
}
