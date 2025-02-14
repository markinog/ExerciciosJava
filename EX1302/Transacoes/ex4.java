package com.agibank.EX1302.Transacoes;

public class ex4 {
    public static void main(String[] args) {

        double[][] transacoes = {

                {100, -50, 200, -30, 50},
                {-100, -200, 50,100,150},
                {300, -100, -50, -150, 200}

        };

        double[] movimentacao = calculaMovimentacao(transacoes);
        double[] saldoFinal = calculaSaldoFinal(transacoes);

        for (int i = 0; i < calculaSaldoFinal(transacoes).length ; i++) {

            System.out.printf("Cliente %d: Total Movimentado = %.2f | Saldo Final = %.2f\n", i + 1, movimentacao[i],saldoFinal[i]);

        }

    }

    public static double[] calculaMovimentacao(double[][] transacoes){

        double[] movimentacao = new double[transacoes.length];



        for (int i = 0; i < transacoes.length; i++) {
            for (int j = 0; j < transacoes[i].length; j++) {

                movimentacao[i] += transacoes[i][j];

            }
        }

        return movimentacao;

    }

    public static double[] calculaSaldoFinal(double[][] transacoes){

        double[] saldoFinal = new double[transacoes.length];
        double saldoConta = 1000;
        double[] saldo = calculaMovimentacao(transacoes);

        for (int i = 0; i < transacoes.length; i++) {
            for (int j = 0; j < transacoes[i].length; j++) {

                saldoFinal[i] = saldoConta + saldo[i];

            }
        }

        return  saldoFinal;
    }
}
