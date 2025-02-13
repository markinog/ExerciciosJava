package com.agibank.Maratona3101;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float saldoConta, valorSaque = 0;

        System.out.print("Digite o saldo da conta: ");
        saldoConta = sc.nextFloat();

        while(valorSaque >= 0){

            System.out.print("Digite o valor que deseja sacar: ");
            valorSaque = sc.nextFloat();

            //if principal para que caso o usuário digite um número negativo para sair,
            //esse número não interfere em nenhuma conta
            if(valorSaque > 0){
                if (valorSaque < saldoConta){
                    saldoConta -= valorSaque;
                    System.out.printf("Novo saldo: R$%.2f", saldoConta);
                    System.out.println();

                }
                //verifica se o valor do saque é maior do que o saldo da conta,
                //se for maior, inicia um looping até que o usuário digite um número
                //compatível com o saldo da conta
                else if(valorSaque > saldoConta){
                    while(valorSaque > saldoConta){

                        System.out.print("Erro! Saldo insuficiente!");
                        System.out.println();
                        System.out.print("Digite o valor que deseja sacar: ");
                        valorSaque = sc.nextFloat();
                    }
                    //ao sair do looping com um valor compatível, realiza a conta
                    saldoConta -= valorSaque;
            }
                //uma vez que a condição pro looping continuar é o valorSaque ser maior que 0
                if(saldoConta == 0){
                    valorSaque = -1;
                }
            }
        }

        //depois que sai do looping principal do while, verifica se o valor do saldo
        //está zerado ou não, se não estiver mostra o saldo
        //se estiver, avisa que a conta ta zerada
        if(saldoConta != 0){
            System.out.printf("Saldo restante: R$%.2f", saldoConta);
        }
        else{
            System.out.println("Saldo zerado!");

        }

    }

}