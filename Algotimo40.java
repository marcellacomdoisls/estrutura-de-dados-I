import java.util.Scanner;

public class Algotimo40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o dividendo: ");
        int valor1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Entre com o divisor: ");
        int valor2 = Integer.parseInt(teclado.nextLine());
        int quosciente = valor1 / valor2;
        int resto = valor1 % valor2;
        System.out.println("Dividendo: "+ valor1);
        System.out.println("Divisor: "+ valor2);
        System.out.println("Quosciente: "+ quosciente);
        System.out.println("Resto: "+ resto);
        teclado.close();
    }
}
