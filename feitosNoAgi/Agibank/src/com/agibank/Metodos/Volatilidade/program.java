package com.agibank.Metodos.Volatilidade;

public class program {
    public static void main(String[] args) {

        double[] retornos = {0.01, 0.02, -0.01, 0.03, -0.02};

        double teste = 0.0185;

        System.out.printf("%.3f", teste);

        System.out.printf("Volatilidade: %.3f", desvioPadrao(retornos));



    }

    public static double desvioPadrao(double[] vetor){

        double mediaVolatil = Media(vetor); //armazena a média da soma de todos os elementos pela tamanho do array
        double somaQuadrados = 0;

        for (double valoresEntrada : vetor) {
            somaQuadrados += Math.pow(valoresEntrada - mediaVolatil, 2);
        }

        return Math.sqrt(somaQuadrados / vetor.length);
    }

    public static double Media(double[] entradaMedia){
        double soma = 0;
        for(double entrada : entradaMedia){
            soma += entrada;
        }
        return soma / entradaMedia.length;
    }
}
