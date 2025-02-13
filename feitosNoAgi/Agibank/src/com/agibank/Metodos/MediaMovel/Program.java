package com.agibank.Metodos.MediaMovel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int intervalo = 0;
        double[] acoes = {100.0, 102.0, 101.0, 103.0, 105.0};

        System.out.print("Digite o intervalo: ");
        intervalo = sc.nextInt();

        double[] mediasMoveis = calculaMediaMovel(acoes, intervalo);

        System.out.println("Médias móveis:");
        for (double media : mediasMoveis) {
            System.out.printf("%.2f\n", media);
        }
    }



    public static double[] calculaMediaMovel(double[] precosAcao, int intervalo) {
        int n = precosAcao.length;
        double[] mediasMoveis = new double[n - intervalo + 1];

        for (int i = 0; i <= n - intervalo; i++) {
            double soma = 0;
            for (int j = 0; j < intervalo; j++) {
                soma += precosAcao[i + j];
            }
            mediasMoveis[i] = soma / intervalo;
        }

        return mediasMoveis;


    }
}


