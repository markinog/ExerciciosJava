package com.agibank.Matriz;

public class EX8 {
    public static void main(String[] args) {

        int somaDiagonalP = 0, somaTotal = 0;
        int[][] matriz = {

                {1,0,0},
                {0,1,0},
                {0,0,1}

        };


        for(int i = 0; i < matriz.length; i++){

            somaDiagonalP += matriz[i][i];

            for(int j = 0; j < matriz[i].length; j++){

                somaTotal+= matriz[i][j];

            }


        }

        if(somaDiagonalP == matriz.length && (somaDiagonalP - somaTotal) == 0 ){
            System.out.println("A matriz é identidade.");
        }
        else{
            System.out.println("A matriz não é a identidade.");
        }


    }
}
