package com.agibank.Matriz;

public class EX2 {
    public static void main(String[] args) {

        int somaElementos = 0;
        int[]  somaLinha = new int[4];
        int[]  somaColuna  = new int[4];
        int[][] matriz = {

                {1,2,3,4}, //10
                {5,6,7,8}, //26
                {9,10, 11,12}, //42
                {13,14,15,16} //58

        };

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0 ; j < matriz[i].length; j++){

                somaElementos += matriz[i][j];
                somaLinha[i] += matriz[i][j];
                somaColuna[j] += matriz[i][j];


                }

            }

        System.out.printf("Soma de todos os elemento: %d\n", somaElementos);


        for(int i = 0; i < matriz.length; i++){

            System.out.println();
            System.out.printf("Soma da linha %d: %d", i+1, somaLinha[i]);
            System.out.println();
            System.out.printf("Soma da coluna %d: %d", i+1, somaColuna[i]);
            System.out.print("\n");

        }

    }
}
