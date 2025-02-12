package com.agibank.Vetores;

public class VariacaoPercentual {
    public static void main(String[] args) {

        double[] valorVariacao = {100, 101.5, 99, 102.0, 105};

        double variacaoPercent = 0;

        System.out.print("Variações diárias: ");
        for(int i = 1; i < valorVariacao.length; i++){

            variacaoPercent = ((valorVariacao[i] - valorVariacao[i-1]) / valorVariacao[i-1]) * 100;
            System.out.printf("%.2f%% ", variacaoPercent);
        }

    }
}
