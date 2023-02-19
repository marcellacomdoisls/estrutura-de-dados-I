import java.util.Scanner;

public class Algoritmo48 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o salário mínimo: ");
        int salarioMinimo = Integer.parseInt(teclado.nextLine());
        System.out.println("Entre com a quantidade de kilowatts: ");
        int quantidadeKW = Integer.parseInt(teclado.nextLine());
        int preçoKW = salarioMinimo / 700;
        int valorPago = preçoKW * quantidadeKW;
        int valorComDesconto = (int) (valorPago * 0.9);
        System.out.println("Preço do Kilowatt: "+ preçoKW); 
        System.out.println("Valor a ser pago: "+ valorPago);
        System.out.println("Valor com desconto: "+ valorComDesconto);
        teclado.close();
    }
}
