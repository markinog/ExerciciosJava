package com.agibank.Vetores;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] precosAtivos = new double[7];

        for(int i = 0; i < precosAtivos.length; i++){
            System.out.printf("\nDigite o preço do ativo no dia %d: ", i+1);
            precosAtivos[i] = sc.nextDouble();
        }

        double mediaMovel = (precosAtivos[4] + precosAtivos[5] + precosAtivos[6]) / 3;
        System.out.printf("Média móvel dos últimos 3 dias: %.2f", mediaMovel);

    }
}
