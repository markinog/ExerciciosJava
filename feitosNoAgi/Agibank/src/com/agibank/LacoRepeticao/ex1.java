package com.agibank.LacoRepeticao;
import java.util.Scanner;

/* Implementar um programa que imprima a
tabuada de um número digitado pelo usário*/

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número para saber a tabuada: ");
        num = sc.nextInt();

        for(int i = 1; i<= 10; i++ ){
            System.out.printf("\n%d x %d = %d", num, i , num * i);
        }
        

    }
}