package com.agibank.TryCatch.S4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {


            double[] saldoContas = {100.0,102.0, 101.0, 103.0, 105.0};

            if (saldoContas.length < 3) {
                throw new IllegalArgumentException("O vetor precisa ter mais de 3 valores.");
            }

            double mediaMovel;

            for (int i = 2; i < saldoContas.length; i++) {

                mediaMovel = (saldoContas[i] + saldoContas[i - 1] + saldoContas[i - 2]) / 3;

                System.out.printf("\nMedia Móvel (dia %d): %.1f", i + 1, mediaMovel);
            }

        }

        catch(NumberFormatException e){
            System.out.println("Números informados incorretamente.");
        }

        catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }



    }
}
