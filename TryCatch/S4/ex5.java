package com.agibank.TryCatch.S4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* {

                {0.05, 0.08, 0.00},
                {0.07, 0.06, 0.09},
                {0.02, 0.03, 0.04}

        };*/

        double[] medias = new double[3];
        double[][] portfolios = new double[3][3];

        try{

            for (int i = 0; i < portfolios.length; i++) {
                for (int j = 0; j < portfolios[i].length; j++) {

                    System.out.print("Digite um numero: ");
                    portfolios[i][j] = sc.nextDouble();
                }
            }



            for (int i = 0; i < portfolios.length; i++) {
                double soma = 0;
                for (int j = 0; j < portfolios[i].length; j++) {

                    soma += portfolios[i][j] / 3;

                }
                medias[i] = soma;
            }

            for (int i = 0; i < medias.length; i++) {
                System.out.printf("\nMedia do portfólio %d: %.3f", i+1, medias[i]);
            }


        }catch(InputMismatchException e){ //se pegar uma letra como elemento da matriz cai aqui
            System.out.println("Somente números, decimais ou inteiros.");
        }
        catch(NumberFormatException n){

            System.out.println("A matriz deve conter exclusivamente valores numéricos.");

        }

        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("\nMatriz incompleta ou índice maior do que o tamanho da matriz.");
        }

    }

}
