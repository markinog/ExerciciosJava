package com.agibank.Vetores;

public class MaiorMenorValor {
    public static void main(String[] args) {

        double[] precoFechamento = {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5};

        double maior = precoFechamento[0];
        double menor = precoFechamento[0];


        for(int i = 0; i < precoFechamento.length ; i++){

            maior = (precoFechamento[i] > maior) ? precoFechamento[i] : maior;
            menor = (precoFechamento[i] < menor) ? precoFechamento[i] : menor;

            /*
            maior = Math.max(precoFechamento[i], maior);
            menor = Math.min(precoFechamento[i], menor);
            */

        }

        System.out.printf("Maior: %.2f", maior);
        System.out.print("\n");
        System.out.printf("Menor: %.2f", menor);

    }
}
