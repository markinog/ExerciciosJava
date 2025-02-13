package com.agibank.LacoRepeticao;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        int base, expoente, expMod, resultado = 1;

        Scanner sc = new Scanner(System.in);

        //número a ser multiplicado
        System.out.print("Digite a base: ");
        base = sc.nextInt();

        //pega o limite (até onde vai multiplicar)
        System.out.print("Digite o expoente: ");
        expoente = sc.nextInt();
        expMod = Math.abs(expoente);

        sc.close();

        for (int i = 1; i <= expMod; i++) {
            //x = 3, y = 3
            //1 = 1 * 3 = 3 -> primeira iteração
            //3 = 3 * 3 = 9 -> segunda iteração
            //9 = 9 * 3 = 27 -> terceira iteração
            resultado *= base;
        }

        System.out.printf("O número %d elevado a %d é %d", base, expoente, resultado);


    }
}