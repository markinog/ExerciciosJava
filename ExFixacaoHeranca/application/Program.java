package com.agibank.ExFixacaoHeranca.application;
import com.agibank.ExFixacaoHeranca.entities.TaxPayer;
import com.agibank.ExFixacaoHeranca.entities.Company;
import com.agibank.ExFixacaoHeranca.entities.Individual;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> payers = new ArrayList<>();

        int quantOfPayers;

        System.out.print("Enter the number of tax payers: ");
        quantOfPayers = sc.nextInt();

        for (int i = 1; i <= quantOfPayers; i++) {

            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char choose = sc.next().charAt(0);
            sc.nextLine();


            System.out.println();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.println();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            System.out.println();
            if(choose == 'i'){

                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                payers.add(new Individual(name, anualIncome,health));

            }
            else{

                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                payers.add(new Company(name, anualIncome, employees));

            }

        }

        System.out.println("TAXES PAIDS: ");
        double sum = 0;
        for(TaxPayer tax : payers){
            System.out.println(tax.getName() + ": R$" + String.format("%.2f",tax.Tax(tax.getAnualIncome())));

            sum += tax.Tax(tax.getAnualIncome());
        }

        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));



    }
}
