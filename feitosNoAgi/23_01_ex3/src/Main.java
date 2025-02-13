import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double inicial = 1000, investimento = 0;

        for(int i = 0; i <= 11; i++){
            System.out.printf("digite o investimento referente ao mês %d: ", i+1);
            investimento = leia.nextFloat();

            inicial = (investimento * 0.005) + inicial;
        }
        System.out.printf("Rendimento total: %.2f", inicial);
    }   
}