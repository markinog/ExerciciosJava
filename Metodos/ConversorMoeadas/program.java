package com.agibank.Metodos.ConversorMoeadas;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double reais = 0;

        System.out.print("Digite um valor em R$ para convertê-lo em dólares: ");
        reais = sc.nextDouble();

        System.out.printf("\n%.2f convertido em dólares é igual a %.2f", reais, Conversor(reais));

    }
    public static double Conversor(double reais){
        return reais / 5.81;
    }

}




