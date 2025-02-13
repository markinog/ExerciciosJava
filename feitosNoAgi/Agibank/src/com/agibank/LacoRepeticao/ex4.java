package com.agibank.LacoRepeticao;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fat, soma = 1;

        System.out.print("Digite um número para saber seu fatorial: ");
        fat = sc.nextInt();

            for(int i = fat; i >= 1; i--){
                if(i != 1){
                    System.out.printf("%d x ", i);
                    soma *= i;
                    //1 = 1 * 5
                    //5 = 5 * 4
                }
                else{
                    System.out.printf("%d = %d", i, soma);
                }

            }

    }
}