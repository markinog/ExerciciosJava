package com.agibank.ExerciciosCondicionais;
import java.util.Scanner;

public class s2ex4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        float valor, media, dist, porc;

        System.out.print("digite o valor: ");
        valor = sc.nextFloat();

        System.out.print("digite a média: ");
        media = sc.nextFloat();
        sc.close();

        dist = Math.abs(valor-media);
        porc = (dist/media) * 100;

        System.out.printf("A aproximação da média é: %.2f%%", porc);





    }
}