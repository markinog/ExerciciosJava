package com.agibank.Vetores.EXS0402;

public class CarteiraAcoes {
    public static void main(String[] args) {

        double[] acoes = {5000.0, 3000.0, 7000.0, 4000.0, 6000.0};
        double somaAcoes = 0;
        double[] percentAcoes = new double[5];


        for(int i = 0; i < acoes.length; i++){
            somaAcoes += acoes[i];
        }
        System.out.printf("Soma das ações: %.2f", somaAcoes);
        System.out.println();
        System.out.print("Percentual de cada ação: ");

        for(int i = 0; i < percentAcoes.length ; i++){
            System.out.printf(" %.2f%%", (acoes[i] / somaAcoes) * 100);

        }




    }
}
