 package com.agibank.ExerciciosCondicionais;

import java.util.Scanner;

public class s2ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ser verificado: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.printf("O número %d é par!", n);
        }
            else {
            System.out.printf("O número %d é ímpar!", n);
        }

    }
}