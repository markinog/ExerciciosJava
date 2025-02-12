package com.agibank.Vetores;

public class GanhoCapital {
    public static void main(String[] args) {

        double[] precoCompra = {10000.0, 8000.0, 12000.0, 7000.0, 15000.0};

        double[] precoVenda = {12000.0, 8500.0, 14000.0, 7200.0, 18000.0};

        double lucro = 0;

        for(int i = 0; i < precoCompra.length; i++){
            lucro+= precoVenda[i] - precoCompra[i];
        }

        System.out.printf("Lucro total: R$%.2f", lucro);
        System.out.println();

        if(lucro > 20000.0){
            lucro = lucro - ((lucro - 20000) * 0.15);
            System.out.printf("Lucro com imposto de 15%% sob o excedente: R$%.2f", lucro);
        }
        else{
            System.out.println("Sem imposto devido.");
        }
    }
}
