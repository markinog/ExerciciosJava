package com.agibank.TryCatch.S4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] saldoContas = new double[11];


        try {

            for (int i = 1; i < saldoContas.length; i++) {

                System.out.printf("Digite o valor da conta %d: ", i);
                saldoContas[i] = sc.nextDouble();
            }


            System.out.print("Digite o índice da conta: ");
            int indice = sc.nextInt();

            System.out.printf("Saldo da conta %d: %.2f", indice, saldoContas[indice]);


        } catch (InputMismatchException i) {

            System.out.println("Apenas valores numéricos devem ser inseridos!");

        }
        catch(ArrayIndexOutOfBoundsException error){

            System.out.print("Erro: Conta não encontrada.");

        }
    }
}



