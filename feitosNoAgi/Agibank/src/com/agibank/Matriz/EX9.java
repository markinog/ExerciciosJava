package com.agibank.Matriz;

public class EX9 {
    public static void main(String[] args) {


        double maior = 0;
        double[][] matriz = {
                {2.0, 4.0, 6.0},
                {8.0, 10.0, 12.0}
        };
        System.out.print("Matriz antes da divisão: \n\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){

                if(maior < matriz[i][j]){
                    maior = matriz[i][j];
                }
                System.out.printf("%.2f ", matriz[i][j]);

            }
            System.out.print("\n\n");
        }


        System.out.printf("Matriz após divisão pelo número maior (%.2f): \n\n", maior);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){

                System.out.printf("%.2f " , matriz[i][j] / maior);

            }
            System.out.print("\n");

        }

    }
}
