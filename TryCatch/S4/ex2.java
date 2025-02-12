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

            for (int i = 2; i < saldoContas.length; i++) {

                double[] media = mediaMovel(saldoContas);

                System.out.printf("\nMedia móvel (dia %d): %.1f", i+1, media[i]);

            }

        }

        catch(NumberFormatException e){
            System.out.println("Números informados incorretamente.");
        }

        catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }



    }

    public static double[] mediaMovel(double[] saldos){

        if(saldos.length < 3){
            throw new IllegalArgumentException();
        }

        double[] mediaMovel = new double[saldos.length];

        for (int i = 2; i < saldos.length; i++) {

            mediaMovel[i] = (saldos[i] + saldos[i - 1] + saldos[i - 2]) / 3;

            }
        return mediaMovel;

        }

    }


