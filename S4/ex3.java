package com.agibank.TryCatch.S4;

public class ex3 {
    public static void main(String[] args) {

        double[][] matrizRiscos = {
                {0.2, 0.5, 1.1, 0.4, 0.3},
                {0.7, 0.9, 0.1, 0.6, 0.8},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0},
                {0.0, 0.0, 0.0, 0.0, 0.0}

        };



        try{

            for (int i = 0; i < matrizRiscos.length; i++) {
                for (int j = 0; j < matrizRiscos[i].length; j++) {


                    if(matrizRiscos[i][j] > 1.0 || matrizRiscos[i][j] < 0.0){

                        System.out.printf("\nErro! Valor inválido encontrado na célula [%d][%d]: %.1f", i,j, matrizRiscos[i][j]);

                        throw new Exception("\nOs valores da matriz devem estar entre 0 e 1!");
                    }


                }
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nMatriz incompleta ou índice maior do que o tamanho da matriz.");
        }
        catch(Exception e){

            System.out.println(e.getMessage());

        }



    }
}
