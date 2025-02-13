package com.agibank.Metodos.Crescimento;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        double dia1 = 0, dia2 = 0;

        System.out.print("Preço dia 1: ");
        dia1 = sc.nextDouble();

        System.out.print("Preço dia 2: ");
        dia2 = sc.nextDouble();


        System.out.printf("\nCresvimento = %.2f%%", calculaCrescimento(dia1, dia2));


    }

    public static double calculaCrescimento(double preco1, double preco2){

        return  Math.abs((preco1 - preco2) * 100 / 100 );

    }

}
