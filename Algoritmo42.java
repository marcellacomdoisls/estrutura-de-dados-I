import java.util.Scanner;

public class Algoritmo42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um ângulo em graus: ");
        int angulo = Integer.parseInt(teclado.nextLine());
        int angRadiano = (int) (angulo * Math.PI / 180);
        System.out.println("Seno: "+ Math.sin(angRadiano));
        System.out.println("Cosseno: "+ Math.cos(angRadiano));
        System.out.println("Tangente: "+ Math.tan(angRadiano));
        System.out.println("Cossecante: "+ 1 / Math.sin(angRadiano));
        System.out.println("Secante: "+ 1 / Math.cos(angRadiano));
        System.out.println("Cotangente: "+ 1/ Math.tan(angRadiano));
        teclado.close();
    }
}
