package com.agibank.Metodos.JurosComspostos;

import java.util.Locale;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double capital = 1000.0;
        double taxa =  0.02;
        int meses = 12;


        System.out.printf("%.2f",calculaJurosComposto(capital, taxa, meses));

    }

    public static double calculaJurosComposto(double capital,double taxa,int meses){

        return capital * Math.pow(1+taxa,meses);

    }
}
