package com.agibank.Vetores;

public class PrecoDiario {

    public static void main(String[] args) {

        float[] precoDiario = {10, 20, 30, 5, 12, 15, 2, 9, 70, 1};
        boolean tendencia = false;
        int inicioTendencia = -1;
        int fimTendencia = -1;

        for (int i = 0; i < precoDiario.length - 1; i++) {
            if (precoDiario[i] < precoDiario[i + 1]) {
                if (inicioTendencia == -1) {
                    inicioTendencia = i;
                }
                fimTendencia = i + 1;
            } else {
                if (inicioTendencia != -1 && (fimTendencia - inicioTendencia + 1) >= 3) {
                    tendencia = true;
                    System.out.print("Tendência de alta encontrada nos dias: ");
                    for (int j = inicioTendencia; j <= fimTendencia; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                inicioTendencia = -1;
                fimTendencia = -1;
            }
        }



        if (!tendencia) {
            System.out.print("Sem tendência de alta identificada.");
        }
    }
}