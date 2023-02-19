import java.util.Scanner;

public class Algoritmo26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a data no formato ddmmaa: ");
        int entrada = Integer.parseInt(teclado.nextLine());
        int dia = entrada / 10000;
        int mes = (entrada % 10000) / 100;
        int ano = entrada % 100;
        int entradaGringa = mes * 10000 + dia * 100 + ano;

        System.out.println("DIA: " + dia);
        System.out.println("MÊS: "+ mes);
        System.out.println("ANO: "+ ano);
        System.out.println("DATA NO FORMATO MMDDAA: "+ entradaGringa);
        teclado.close();
    }
}
