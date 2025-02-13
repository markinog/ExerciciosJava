package com.agibank.Matriz;

public class EX1 {
    public static void main(String[] args) {

        int[][] matriz = {
                {42,18,20},
                {7,65,70},
                {10,12,13}
        };

       /* for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j <  matriz[i].length; j++){
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.print("\n");
        } */

        //usando foreach
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%d\t", elemento);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");




    }
}
