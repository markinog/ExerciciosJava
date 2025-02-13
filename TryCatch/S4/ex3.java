package com.agibank.TryCatch.S4;

import java.util.Locale;

public class ex3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double[][] matrizRiscos = {
                {0.2, 0.5, 1.0, 0.4, 0.3},
                {0.7, 0.9, 0.1, 0.6, 0.8},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0}

        };



        validaRisco(matrizRiscos);



    }

    public static void validaRisco(double[][] riscos){

        try{

            for (int i = 0; i < riscos.length; i++) {
                for (int j = 0; j < riscos[i].length; j++) {


                    if(riscos[i][j] > 1.0 || riscos[i][j] < 0.0){

                        System.out.printf("\nErro! Valor inválido encontrado na célula [%d][%d]: %.1f", i,j, riscos[i][j]);

                        System.out.println();
                        throw new Exception("\nOs valores da matriz devem estar entre 0 e 1!");
                    }
                }
            }

            for (int i = 0; i < riscos.length; i++) {
                for (int j = 0; j < riscos[i].length; j++) {


                    System.out.printf("%.1f | ", riscos[i][j]);
                }
                System.out.println();
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nMatriz incompleta ou índice maior do que o tamanho da matriz.");
        }
        catch(Exception e){

            System.out.println(e.getMessage());

        }


    }
}
