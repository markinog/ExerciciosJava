package com.agibank.Vetores.EXS0302;

public class AcaoDiariaParte2 {
    public static void main(String[] args) {

        int[] precos = {1,100,104,105,110,111,955,91,96,101};
        boolean tendencia = false;
        int primeiroDia = 0, ultimoDia = 0;

        for(int i =0; i < precos.length -2; i++){


            if(precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]){
                 primeiroDia =  i+1;
                i+=2;
                while(precos[i] < precos[i+1]){
                    if(i == precos.length -1){
                        break;
                    }
                }

                ultimoDia = i+1;
                System.out.printf("Tendencia entre os dias %d e %d", primeiroDia, ultimoDia);
                System.out.println();
                tendencia = true;


                break;
            }
        }


        if(!tendencia){
            System.out.println("Não há tendência");
        }

    }
}
