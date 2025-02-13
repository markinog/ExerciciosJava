package com.agibank.ExerciciosCondicionais;

import java.util.Scanner;

public class Ex1S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número: ");
        float n = sc.nextFloat();

        if(n > 0){
            System.out.printf("O número " + n + " é um número positivo");
        }
            else if(n < 0){
            System.out.printf("O número " + n + " é um número negativo");
        }
            else{
            System.out.printf("O número é igual  0.");
        }

    }
}