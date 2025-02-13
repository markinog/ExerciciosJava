package com.agibank.Metodos.Ativos;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double ativo1 = 0 , ativo2 = 0;


        System.out.print("Ativo 1: ");
        ativo1 = sc.nextDouble();

        System.out.print("Ativo 2: ");
        ativo2 = sc.nextDouble();

        System.out.printf("O ativo com o maior valor de retorno é o %s", comparaAtivos(ativo1,ativo2));

    }


    public static String comparaAtivos(double at1, double at2){

        if(at1 > at2){
            return "Ativo 1";
        }
        else{
            return "Ativo 2";
        }

    }
}
