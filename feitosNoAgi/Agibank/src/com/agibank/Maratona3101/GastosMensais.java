package com.agibank.Maratona3101;
import java.util.Scanner;


public class GastosMensais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float gastoMensal, somaGasto = 0;

        //pergunta o valor do gasto até que um número negativo seja digitado
        do{
            System.out.print("\nDigite o valor do gasto: ");
            gastoMensal = sc.nextFloat();
            somaGasto += gastoMensal;

            //caso a soma dos gastos passe de R$5000, exibe um alerta
            if(somaGasto > 5000){
                System.out.print("\nALERTA: Seus gastos ultrapassaram R$5000!");
            }

        }while(gastoMensal > 0); //condição para o looping continuar rodando

        System.out.printf("\nTotal gasto: R$%.2f", somaGasto); // imprime o total gasto


    }
}