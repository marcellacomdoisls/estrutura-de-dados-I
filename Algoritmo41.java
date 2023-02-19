import java.util.Scanner;

public class Algoritmo41 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com 1 número: ");
        int a = Integer.parseInt(teclado.nextLine());
        System.out.println("Entre com 2 número: ");
        int b = Integer.parseInt(teclado.nextLine());
        System.out.println("Entre com 3 número: ");
        int c = Integer.parseInt(teclado.nextLine());
        System.out.println("Entre com 4 número: ");
        int d = Integer.parseInt(teclado.nextLine());
        int mediaPonderada = (a * 1 + b * 2 + c * 3 + d * 4) / 10;
        System.out.println("Média ponderada: "+ mediaPonderada);
        teclado.close();
    }
}
