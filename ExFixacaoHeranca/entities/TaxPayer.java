package com.agibank.ExFixacaoHeranca.entities;

public class TaxPayer {

    private String name;
    private Double anualIncome;

    public TaxPayer(){

    }

    public TaxPayer(String name, Double anualIncome){

        this.name = name;
        this.anualIncome = anualIncome;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public double Tax(double anualIncome){


        return anualIncome;

    }
}
