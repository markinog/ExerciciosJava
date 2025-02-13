package com.agibank.ExerciciosCondicionais;
import java.util.Scanner;
import java.lang.Math;


public class s2ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite sua altura (ex: 1,60): ");
        float altura = sc.nextFloat();

        System.out.printf("Digite seu peso em kgs: ");
        float peso = sc.nextFloat();

        double imc = peso / Math.pow(altura,2);

        System.out.printf("Seu imc é de %.1f", imc);

    }
}