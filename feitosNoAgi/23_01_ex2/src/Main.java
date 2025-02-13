import javax.sound.midi.SysexMessage;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float saldo = 0, aux = 0 ;

        for (int i = 0; i <= 11; i++) {

            System.out.printf("digite o valor a ser depositado no mês %d: ", i + 1);
            saldo = leia.nextFloat();
            aux = saldo + aux;

        }

        System.out.printf("Valor total do saldo da conta: " + aux);
    }
}