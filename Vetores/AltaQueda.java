package com.agibank.Vetores;

public class AltaQueda {
    public static void main(String[] args) {

        double[] precoDiario = {100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5, 107.0, 109.5, 110.0};

        int contaAlta = 0, contaBaixa = 0;

        for(int i = 0; i < precoDiario.length - 1; i++){

            if(precoDiario[i] < precoDiario[i + 1]){
                contaAlta++;
            }
            else{
                contaBaixa++;
            }
        }

        System.out.printf("Dias em alta: %d", contaAlta);
        System.out.println();
        System.out.printf("Dias em baixa: %d", contaBaixa);

    }
}
