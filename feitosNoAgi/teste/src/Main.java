import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Sua idade é válida: " + idade);
        }
        else {
            System.out.printf("idade inválida: ", idade);
        }   
    }
}