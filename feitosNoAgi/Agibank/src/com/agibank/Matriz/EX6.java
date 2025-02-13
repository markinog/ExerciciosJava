package com.agibank.Matriz;

public class EX6 {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrizB = {
                    {10,20, 30},
                    {40,50, 60},
                    {70,80, 90}
        };

        int[][]  matrizC = new int[matrizA.length][matrizB[0].length];

        if (matrizA[0].length != matrizB.length) {
            System.out.println("O número de colunas de matrizA deve ser igual ao número de linhas de matrizB.");
            return;
        }
        for(int i = 0; i < matrizA.length ; i++){
            for(int j = 0; j < matrizA[i].length; j++){
                int resultado = 0;
                for(int k = 0; k < matrizB.length; k++){

                    resultado += matrizA[i][k] * matrizB [k][j];

                }

                matrizC[i][j] = resultado;

            }
        }





        for(int i = 0; i < matrizA.length; i++){
            for(int j = 0; j < matrizA[i].length; j++){

                System.out.printf("%d ", matrizC[i][j]);

            }
            System.out.print("\n");
        }

    }
}
