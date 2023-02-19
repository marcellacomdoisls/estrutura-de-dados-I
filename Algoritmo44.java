import java.util.Scanner;

public class Algoritmo44 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o logaritmando: ");
        int numero = Integer.parseInt(teclado.nextLine());
        System.out.println("Entre com a base: ");
        int base = Integer.parseInt(teclado.nextLine());
        int logaritmo = (int) (Math.log(numero) / Math.log(base));
        System.out.print("O logaritmo de "+ numero); System.out.print(" na base "+ base); System.out.println(": "+ logaritmo);
        teclado.close();
    }
}
