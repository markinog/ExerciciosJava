package com.agibank.Metodos.JurosSimples;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double capitalInicial = 0, taxaAnual = 0;
        int anos = 0;

        System.out.print("Capital: ");
        capitalInicial = sc.nextDouble();

        System.out.print("Taxa de juros anual (%%): ");
        taxaAnual = sc.nextDouble();
        taxaAnual = taxaAnual / 100 ;

        System.out.print("Tempo (em anos): ");
        anos = sc.nextInt();



        System.out.printf("\nMontante final: %.2f", calcularJurosSimples(capitalInicial, taxaAnual, anos));

    }

    public static double calcularJurosSimples(double capital, double taxa, int tempo){

        return capital * (1 + taxa * tempo);

    }

}
