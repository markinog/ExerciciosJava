package com.agibank.Maratona3101;
import java.util.Scanner;
import java.lang.Math;

//Dev -> Marcus Vinicius
//Tester -> Thiago Ferrer
//Esquema de nota:
//Nota de 0 a 100
//Verificar os problemas

//Problemas de lógica > -10 pontos
//Erro de sintaxe: -5 pontos

//A sintaxe está correta: nota 100! Parabéns!


public class ExMaratona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x,y, radiano = 0, velocity , gravity, time = 0.01;

        gravity = 9.8;

        System.out.print("Digite o valor do ângulo: ");
        radiano = Math.toRadians(sc.nextDouble());


        System.out.print("Digite a velocidade: ");
        velocity = sc.nextDouble();

        do{
            time += 0.01;
            x = velocity * Math.cos(radiano) * time;
            y = (velocity * Math.sin(radiano) * time) - (0.5 * gravity * (Math.pow(time, 2)));
            System.out.printf("\nX: %.2f  |  Y: %.2f ", x, y);
        }while(y >= 0);
    }
}