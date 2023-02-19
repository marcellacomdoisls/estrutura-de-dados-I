import java.util.Scanner;

public class Algoritmo43 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o logaritmando: ");
        int numero = Integer.parseInt(teclado.nextLine());
        int logaritmo = (int) (Math.log(numero) / Math.log(10));
        System.out.println("Logaritmo: "+ logaritmo);
        teclado.close();
    }
}
