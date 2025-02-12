package com.agibank.Vetores;

public class CarteiraDeAcoes {
    public static void main(String[] args) {

        double[] carteiraValor = {5000.0, 3000.0, 7000.0, 4000.0, 6000.0};
        double[] percentualAcao = new double[5];
        double somaInvestimento = 0;


        for(int i = 0; i < carteiraValor.length; i++){
            somaInvestimento += carteiraValor[i];

        }

        System.out.printf("Soma das ações: R$%.2f\n", somaInvestimento);

        System.out.print("Percentual de cada ação: ");
        for(int i = 0; i < percentualAcao.length; i++){
            percentualAcao[i] = (carteiraValor[i] / somaInvestimento) * 100;
            System.out.printf("%.2f%%, ", percentualAcao[i]);
        }



    }
}
