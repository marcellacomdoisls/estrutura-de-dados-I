import java.util.Scanner;

public class Algoritmo46 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o saldo: ");
        int saldo = Integer.parseInt(teclado.nextLine());
        int novoSaldo = (int) (saldo * 1.01);
        System.out.println("O novo saldo: "+ novoSaldo);
        teclado.close();
    }
}
