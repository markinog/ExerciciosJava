package com.agibank.EX1302.Emprestimo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valorEmprestimo = 0;

        int quantParcelas = 0;


        try{

            System.out.print("Digite o valor do empréstimo: ");
            valorEmprestimo = sc.nextDouble();

            System.out.print("\nDigite a quantidade de parcelas: ");
            quantParcelas = sc.nextInt();

            if(valorEmprestimo < 0 || quantParcelas < 0){
                throw new IllegalArgumentException("Valor deve ser positivo.");
            }

            System.out.print("\nValor das parcelas: ");

            for(double p : calculaParcelas(valorEmprestimo, quantParcelas)){
                System.out.printf("%.2f | ", p);
            }

        }catch(IllegalArgumentException e){

            System.out.printf(e.getMessage());

        }catch(InputMismatchException e){
            System.out.println("Um valor numérico deve ser digitado.");
        }






    }

    public static double[] calculaParcelas(double emprestimo, int parcelas){

        double[] parcelasPagar = new double[parcelas];

        for (int i = 0; i < parcelasPagar.length; i++) {

            parcelasPagar[i] = emprestimo / parcelas;


        }

        return parcelasPagar;

    }
}
