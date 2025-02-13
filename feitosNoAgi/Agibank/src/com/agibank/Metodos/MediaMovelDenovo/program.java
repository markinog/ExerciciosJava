package com.agibank.Metodos.MediaMovelDenovo;

public class program {
    public static void main(String[] args) {

        double[] entrada = {0.01, 0.02, -0.01, 0.03, -0.02};
        System.out.printf("Desvio padrao = %.3f", calcularVolatilidade(entrada));

    }

    public static double calcularVolatilidade(double[] entrada){

        double mediaVolatil = Media(entrada); //armazena a média da soma de todos os elementos pela tamanho do array
        double somaQuadrados = 0;

        for (int i = 0; i < entrada.length; i++) {
            somaQuadrados += Math.pow(entrada[i] - mediaVolatil, 2);
        }

        return Math.sqrt(somaQuadrados / entrada.length);


    }

    //faz a média de todos os elementos do vetor
    public static double Media(double[] entradaMedia){
        double soma = 0;
        for(double entrada : entradaMedia){
            soma += entrada;
        }
        return soma / entradaMedia.length;
    }
}
