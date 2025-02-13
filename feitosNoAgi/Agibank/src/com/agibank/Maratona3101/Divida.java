package com.agibank.Maratona3101;
import java.util.Scanner;

public class Divida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float valorDivida , abateDivida = 0,saldoRestante = 0;


        System.out.print("Digite o valor da sua dívida: ");
        valorDivida = sc.nextFloat();

        //primeira verificação de número negativo
        if (valorDivida < 0) {

            while(valorDivida < 0){

                System.out.println("Números negativos não são aceitos.");
                System.out.print("\nDigite o valor da sua dívida: ");
                valorDivida = sc.nextFloat();
            }

        }

        //diz que o saldo restante é igual ao valor da dívida
        saldoRestante = valorDivida;

        int mes = 1;

        //o usuário digite um valor para mês, abatendo a dívida
        do{
            System.out.printf("Digite o valor do pagamento referente ao mês %d: ", mes);
            abateDivida = sc.nextFloat();

            //se o valor for menor que 0, imprime um alerta de que não pode ser negativo
            //enquanto o usuário não digitar um valor acima de 0, o programa não sai do looping
            if (abateDivida < 0) {

                while(abateDivida < 0){

                    System.out.println();
                    System.out.println("Números negativos não são aceitos.");
                    System.out.printf("Digite o valor do pagamento referente ao mês %d: ", mes);
                    abateDivida = sc.nextFloat();
                }

            }
            //subtrai o valor que o usuário digitou com a dívida que falta ser paga
            saldoRestante -= abateDivida;

            //imprime saldo restante
            System.out.printf("Mês %d -> Saldo Restante: R$%.2f", mes, saldoRestante);
            mes++; //contador para identificar o mês
            System.out.print("\n");

        }while(saldoRestante > 0);

        //quando a dívida for 0, imprime "Dívida quitada!"
        System.out.print("Dívida quitada!");

    }
}