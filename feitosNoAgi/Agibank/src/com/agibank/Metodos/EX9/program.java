package com.agibank.Metodos.EX9;

public class program {
    public static void main(String[] args) {

            double[] serie1 = {100.0, 102.0, 104.0, 106.0};
            double[] serie2 = {50.0, 51.0, 52.0, 54.0};

        System.out.printf("%.1f", correlacao(serie1, serie2));

    }

    public static double correlacao(double[] x, double[] y){

        return covariancia(x,y) / (desvioPadrao(x) * desvioPadrao(y));

    }

    public static double covariancia(double[] x, double[] y){

        double MedX = Media(x);
        double MedY = Media(y);

        double somatoria = 0;
        for (int i = 0; i < x.length; i++) {

            somatoria += (x[i] - MedX) * (y[i] - MedY) ;

        }
        return somatoria / x.length;

    }

    public static double desvioPadrao(double[] vetor){

        double mediaVolatil = Media(vetor); //armazena a média da soma de todos os elementos pela tamanho do array
        double somaQuadrados = 0;

        for (double valoresEntrada : vetor) {
            somaQuadrados += Math.pow(valoresEntrada - mediaVolatil, 2);
        }

        return Math.sqrt(somaQuadrados / vetor.length);
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
