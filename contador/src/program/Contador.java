package program;
import java.util.InputMismatchException;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

class InputNaoInteiroException extends Exception {
    public InputNaoInteiroException(String mensagem) {
        super(mensagem);
    }
}


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = obterInteiroDoUsuario("Digite o primeiro parâmetro", terminal);
        int parametroDois = obterInteiroDoUsuario("Digite o segundo parâmetro", terminal);

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

	static int obterInteiroDoUsuario(String mensagem, Scanner scanner) {
        while (true) {
            try {
                System.out.println(mensagem);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Entrada inválida. Digite um valor inteiro.");
                scanner.nextLine();
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		int contador = parametroDois - parametroUm;
        if (contador <= 0) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < (parametroDois - parametroUm); i++) {
			int n = i + 1;
			System.out.println();
            System.out.println(n);
        }
    }
}

