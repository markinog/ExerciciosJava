package com.agibank.EX1302.GastosMensais;

import static java.lang.Math.min;

public class ex2 {
    public static void main(String[] args) {

        double[] gastosMensais = {1200, 1350, 1100, 1250, 1400, 1300, 1250, 1400, 1500, 1600, 1550, 1650};

        System.out.printf("Média de gasto: R$%.2f", mediaGastosMensais(gastosMensais));
        System.out.println();
        System.out.printf("Meses acima da média: %d", mesesAcima(gastosMensais));

    }

    public static double mediaGastosMensais(double[] gastos){

        double somaGastos = 0;

        for (double medias : gastos) {
            somaGastos += medias;
        }
        return somaGastos / gastos.length;
    }

    public static int mesesAcima(double[] gastos){

        int countMesesAcima = 0;

        for (double d : gastos ){

            if(d > mediaGastosMensais(gastos)){
                countMesesAcima++;
            }

        }

        return countMesesAcima;

    }
}
