package com.agibank.Matriz;

public class MatrizDiagonal {
    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.print("Diagonal inversa: ");

        for(int i = 0; i < matriz.length; i++){

                System.out.printf("%d ", matriz[i][ matriz.length -1 - i]);
                //primeiro looping        i = 0         //matriz[0][3 - 1 - 0] = matriz[0] = 3
                //segundo looping         i = 1         //matriz[1][3 - 1 - 1] = matriz[1] = 5
                //terceiro looping        i = 2          //matriz[2][3 - 1 - 2] = matriz[1] = 7
                // o 3 é um valor fixo, a matriz tem tamanho igual a 3x3
                //onde os indices vao de 0 a 2 = tamanho de 3 elementos


        }


    }
}
