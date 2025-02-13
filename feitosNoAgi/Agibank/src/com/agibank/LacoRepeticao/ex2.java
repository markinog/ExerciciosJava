package com.agibank.LacoRepeticao;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int impar = 1, soma = 0, numQuad;

        System.out.print("Digite um número para saber seu quadrado: ");
        numQuad = sc.nextInt();

        if(numQuad <= 0){
            System.out.print("Digite um número POSITIVO para saber seu quadrado: ");
            numQuad = sc.nextInt();

        }

        for(int i = 1 ; i <= numQuad; i++){
            soma += impar;
            impar+=2;

        }

        System.out.printf("Quadrado de %d é %d", numQuad, soma);

    }
}

