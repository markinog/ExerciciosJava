package com.agibank.SwithCase;

import java.util.Scanner;

public class ex1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tipo = "";

        System.out.print("Digite o tipo de investimento (CDB, CDI, TesouroDireto ou FII): ");
        tipo = sc.nextLine();

        switch(tipo){
            case "CDB":
                System.out.printf("Investimento %s escolhido.", tipo);
                break;
            case "CDI":
                System.out.printf("Investimento %s escolhido.", tipo);
                break;
            case "TesouroDireto":
                System.out.printf("Investimento %s escolhido.", tipo);
                break;
            case "FII":
                System.out.printf("Investimento %s escolhido.", tipo);
                break;
            default:
                System.out.printf("Inválido");
                break;


        }




    }
}