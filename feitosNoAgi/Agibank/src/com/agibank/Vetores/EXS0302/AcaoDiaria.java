package com.agibank.Vetores.EXS0302;

public class AcaoDiaria {

    public static void main(String[] args) {





        int[] precos = {102,100,104,105,110,111,95,91,96,101};
        boolean tendencia = false;

        for(int i =0; i < precos.length -2; i++){

            if(precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]){

                System.out.printf("Tendencia entre os dias %d e %d", i+1, i+3);
                System.out.println();
                tendencia = true;

            }
        }

        if(!tendencia){
            System.out.println("Não há tendência");
        }




    }

}
