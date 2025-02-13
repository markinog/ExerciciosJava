package com.agibank.Metodos.Carteira;

public class program {
    public static void main(String[] args) {

        double[] valores = {1000, 2000, 1500};
        double[] retornos = {0.05, 0.03, 0.04};

        System.out.printf("Valor final da carteira: R$%.2f", simularCarteira(valores, retornos));

    }

    public static double simularCarteira(double[] valores, double[] retornos){

        double retornoEsperado = 0;

        for (int i = 0; i < valores.length; i++) {

            retornoEsperado += valores[i] * (1 + retornos[i]);
            //o 1 significa ele + o valor da taxa = 1000 + (1,0
        }

        return retornoEsperado;

    }
}
