import java.util.Scanner;

public class Algoritmo23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de 3 casas: ");
        int numero = Integer.parseInt(teclado.nextLine());
        int restoCentena = numero % 100;
        int dezena = restoCentena / 10;
        System.out.println("Algarismo da casa das dezenas: " + dezena);
        teclado.close();
    }
}
