package com.agibank.Debug;

public class testando {
    public static void main(String[] args) {

        System.out.println("Average finder v0.1");
        double avg = findAverage(args);

        System.out.println("The average is " + avg);

    }

    private static double findAverage(String[] input){

        double result = 0;

        for(String s : input){
            result += Integer.parseInt(s);
        }
        return result;
    }
}
