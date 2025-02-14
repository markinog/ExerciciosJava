package com.agibank.EX1302.RetornoDiario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        double[] precoAcao = new double[5];
        Scanner sc = new Scanner(System.in);

        try{

            for (int i = 0; i < precoAcao.length; i++) {

                System.out.print("Digite um valor: ");
                precoAcao[i] = sc.nextDouble();

                if(precoAcao[i] < 0){
                    throw new Exception("O valor da ação não pode ser negativa.");
                }

            }
            double[] result = variacaoPercentual(precoAcao);

            for(int i = 0; i < result.length; i++){

                System.out.printf("%.2f | ", result[i]);

            }

        }catch (InputMismatchException e){
            System.out.print("Exception type InputMismatch (only numbers)");
        }

        catch (IllegalArgumentException e){
            System.out.println("Exception type IllegalArgumentException");
        }

        catch(Exception e){
            System.out.printf(e.getMessage());
        }
    }

    public static double[] variacaoPercentual(double[] acaoDiaria){

        double[] armazenaVariacoes = new double[acaoDiaria.length -1];

            for (int i = 1; i < acaoDiaria.length; i++) {

                armazenaVariacoes[i-1] = ((acaoDiaria[i] - acaoDiaria[i-1])/acaoDiaria[i-1]) * 100;

            }

        return armazenaVariacoes;


    }
}
