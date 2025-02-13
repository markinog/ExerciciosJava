package com.agibank.Vetores.EXS0402;

public class Drawdown {

    public static void main(String[] args) {

        double[] precos = {100.0, 105.0, 102.0, 110.0, 108.0, 107.0, 95.0, 97.0, 99.0,  103.0};

        double drawdown = 0;
        double valorMinimo = precos[0];

        double pico = precos[0];

        for(int i =0; i < precos.length - 1; i++){

            if (precos[i] > pico) {
                pico = precos[i];
            } else {
                double queda = (pico - precos[i]) / pico * 100;
                if (queda > drawdown) {
                    drawdown = queda;
                    valorMinimo = precos[i];
                }
            }

        }

        System.out.printf("Maior drawdrown: -%.2f%%\n", drawdown);
        System.out.printf("A maior queda aconteceu no pico de %.1f para %.1f", pico, valorMinimo);

        }

}
