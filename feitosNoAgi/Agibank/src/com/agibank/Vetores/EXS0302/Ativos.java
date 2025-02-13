package com.agibank.Vetores.EXS0302;

import java.util.Scanner;

public class Ativos {
    public static void main(String[] args) {


        float[] ativos = new float[]{2, 3, 5, 8, 13};

        float crescDiario = 0, soma = 0;

        for(int i = 1; i < 5; i++){
            crescDiario = ((ativos[i] - ativos[i - 1]) / ativos[i - 1]) * 100;
            soma = soma + crescDiario;
        }

        System.out.printf("Percentual de crescimento acumulado do dia 1 ao 5 foi de: %.2f%%", soma);

    }
}
