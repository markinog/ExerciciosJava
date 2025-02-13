package com.agibank.Vetores.EXS0302;

public class MediaMovel {
    public static void main(String[] args) {

        double[] ativos = {100.0, 102.0, 101.0, 103.0, 105.0, 106.0, 108.0};
        double soma = 0;

        for(int i = 4; i < ativos.length; i++){
            soma += ativos[i];
        }

        System.out.printf("Média movel dos últimos 3 dias: %.2f", soma / 3);

    }
}
