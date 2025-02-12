package com.agibank.TryCatch.S4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int meses = 12;
        double emprestimo ;
        double taxaJuros , parcelaMensal;

        try{


            System.out.print("Digite o valor do empréstimo: ");
            emprestimo = sc.nextDouble();

            if(emprestimo <= 0){
                throw new ArithmeticException("Exceção de aritmética. O empréstimo não pode ser 0 ou abaixo de 0.");
            }

            System.out.print("Digite a taxa de juros: ");
            taxaJuros = sc.nextDouble();
            taxaJuros = taxaJuros / 100;

            if(taxaJuros < 0.0){
                throw new IllegalArgumentException("Exceção de argumento. Taxa de juros não pode ser negativa");
            }

            System.out.printf("\n%.2f", parcelaMensal(emprestimo, taxaJuros, meses));


        }catch (ArithmeticException i) {
            System.out.println(i.getMessage());

        } catch (IllegalArgumentException a) {
            System.out.println(a.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido.");
        }


    }

    public static double parcelaMensal(double emprestimo, double taxa, int meses){


        return (emprestimo * taxa) / (1 - Math.pow((1+taxa), -meses));



    }
}
