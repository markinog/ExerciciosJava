package com.agibank.Vetores.EXS0402;

public class AltaQueda {
    public static void main(String[] args) {

        double[] precosAcao = {100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5,107.0, 109.5, 110.0};

        int somaAlta = 0, somaBaixa = 0;

        for(int i = 0; i < precosAcao.length -1; i++){
            if(precosAcao[i] < precosAcao[i + 1]){
                somaAlta++;
            }
            else{
                somaBaixa++;
            }
        }

        System.out.printf("Dias de alta: %d", somaAlta);
        System.out.printf("\nDias de baixa: %d", somaBaixa);

    }
}
