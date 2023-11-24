import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Didite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Eu sou o " + nome);
        System.out.printf("Tenho %.2f m", altura);
    }
}
