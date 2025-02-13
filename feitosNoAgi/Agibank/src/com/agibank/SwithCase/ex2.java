package com.agibank.SwithCase;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int satisfacao = 0;

        System.out.print("Dê sua nota de satisfação de 1 a 5: " );
        satisfacao = sc.nextInt();



        switch(satisfacao){
            case 0:
                System.out.printf("Obrigado, sua avaliação foi %d", satisfacao);
                break;
            case 1:
                System.out.printf("Obrigado, sua avaliação foi %d", satisfacao);
                break;
            case 2:
                System.out.printf("Obrigado, sua avaliação foi %d", satisfacao);
                break;

            case 3:
                System.out.printf("Obrigado, sua avaliação foi %d", satisfacao);
                break;

            case 4:
                System.out.printf("Obrigado, sua avaliação foi %d", satisfacao);
                break;

            case 5:
                System.out.printf("Obrigado, sua avaliação foi %d", satisfacao);
                break;

        }

    }
}