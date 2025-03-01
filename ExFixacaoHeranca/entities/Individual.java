package com.agibank.ExFixacaoHeranca.entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;


    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double Tax(double anualIncome){

        super.Tax(anualIncome);

        if(anualIncome < 20000){
            return (anualIncome * 0.15) - (healthExpenditures * 0.5);
        }
        else if (anualIncome > 20000){

                return  (anualIncome * 0.25) - (healthExpenditures * 0.5);

        }
        return 0;

    }

}
