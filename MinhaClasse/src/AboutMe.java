import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

       try {
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Didite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Didite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Eu sou o " + nome);
        System.out.printf("Tenho %.2f m e minha idade é %d", altura, idade);

        scanner.close();
       } catch (Exception InputMismatchException) {
        System.out.println("O separador de decimal deve ser um ponto e a idade e a altura devem ser númericos!");
       }

       
    }
}
