package com.agibank.Vetores;

public class JurosCompostos {
    public static void main(String[] args) {

        float[] valorFuturo = new float[6];
        float taxaJuros = 0.02f;
        float investimentoInicial = 1000.0f;


        for(int i = 0; i < valorFuturo.length; i++){
            valorFuturo[i] = investimentoInicial * (float)Math.pow((1 + taxaJuros), i + 1);
        }

        System.out.print("Valores futuros: ");
        for(int i = 0; i < valorFuturo.length; i++){
            System.out.printf("\nR$%.2f", valorFuturo[i]);

        }
    }
}
