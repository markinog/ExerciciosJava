package com.agibank.EX1302.ConversaoMoeda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        double[] real = new double[7];
        double taxaCambio = 0;

        Scanner sc = new Scanner(System.in);



        try{
            System.out.print("Digite o valor da taxa (%): ");
            taxaCambio = sc.nextDouble();

            if(taxaCambio < 0){
                throw new IllegalArgumentException("Erro: número negativo inserido!");

            }

            for (int i = 0; i < real.length; i++) {

                System.out.printf("\nDigite o valor do dia %d em reais: ", i+1);
                real[i] = sc.nextDouble();

                if(real[i] < 0){
                    throw new IllegalArgumentException("Erro: número negativo inserido!");
                }
                System.out.println();

            }

            double[] saida = calculaSaida(real,taxaCambio);
            for(int i = 0; i < real.length; i++){

                System.out.printf("Dia %d > Reais = R$%.2f | Dólares = $%.2f\n",i+1, real[i], saida[i]);

            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Erro: valor não numérico digitado!");
        }



    }

    public static double[] calculaSaida(double[] valorEmReal, double cambio){

        cambio = cambio / 100;

        double[] valorDolar = new double[7];

        for (int i = 0; i < valorDolar.length; i++) {

            valorDolar[i] = valorEmReal[i] + (valorEmReal[i] * cambio);

        }

        return valorDolar;
    }
}
