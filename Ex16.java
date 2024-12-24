import java.util.Scanner;
import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        // Solicita a quantidade de elementos da sequência (N <= 20)
        do {
            System.out.print("Digite a quantidade de elementos da sequencia de Fibonacci (N <= 20): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 20);

        // Cria um vetor para armazenar a sequência
        int[] fibonacci = new int[n];

        // Variáveis para calcular a sequência
        int a = 0, b = 1;

        // Gera a sequência de Fibonacci e preenche o vetor
        for (int i = 0; i < n; i++) {
            fibonacci[i] = a; // Armazena o valor atual no vetor
            int c = a + b;
            a = b;
            b = c;
        }

        // Exibe o vetor com a sequência de Fibonacci
        System.out.println("Sequencia de Fibonacci: " + Arrays.toString(fibonacci));
    }
}
//Rafaela Campos Correa Santos
