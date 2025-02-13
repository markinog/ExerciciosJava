package com.agibank.Vetores.EXS0302;

import static java.lang.Math.max;

public class MenorMaior {
    public static void main(String[] args) {

        double[] precos = {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5};

        double max = precos[0], min = precos[0];

        for(int i = 0; i < precos.length; i++){
            max = Math.max(max, precos[i]);
            min = Math.min(min, precos[i]);
        }



        System.out.printf("Max: %.2f", max);
        System.out.printf("\nMin: %.2f", min);

    }
}
