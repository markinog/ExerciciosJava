package com.agibank.LacoRepeticao;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, a = 0 , b = 1, aux ;

        System.out.print("Digite um número para saber os números maiores que ele na sequência de Fibonacci: ");
        n = sc.nextInt();

        System.out.print("Sequência de Fibonacci: ");
        while(a <= n){

            System.out.printf(a + " ");
            aux = a + b; // aux = 0 + 1     // 1 = 1 + 1    // 2 = 1 + 1    // 2 = 1 + 2        // 3 = 2 + 3
            a = b;      //a = 1             // a = 1        // a = 1        // a = 2            // a = 3
            b = aux;    //b = 1             // b = 1        // b = 2        // b = 3            // b = 5

                                                        //imprime:
                                                     //0, 1, 1, 2, 3

        }




    }
}