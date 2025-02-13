package com.agibank.Matriz;

public class EX7 {
    public static void main(String[] args) {

            int[][] matriz = {

                    {1,2,3},
                    {4,5,6},
                    {10,8,9}

            };

            int somaDiagonalP = 0;
            int somaDiagonalS = 0;

            for(int i = 0; i < matriz.length; i++){

               somaDiagonalS += matriz[i][ matriz.length -1 - i];
               somaDiagonalP += matriz[i][i];

            }

        System.out.printf("Soma dos elemento da diagonal principal: %d\n", somaDiagonalP);
        System.out.printf("Soma dos elemento da diagonal secundária: %d", somaDiagonalS);


    }
}
