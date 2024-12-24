import java.util.Scanner;
import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        // Solicita ao usuário a quantidade de elementos da sequência de fatoriais
        do {
            System.out.print("Digite a quantidade de elementos da sequencia de fatoriais (N <= 15): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 15);

        // Cria o vetor para armazenar os fatoriais
        long[] fatoriais = new long[n];

        // Calcula os fatoriais e preenche o vetor
        for (int i = 0; i < n; i++) {
            long fatorial = 1;
            for (int j = 1; j <= i + 1; j++) {
                fatorial *= j;
            }
            fatoriais[i] = fatorial;
        }

        // Exibe o vetor com os fatoriais
        System.out.println("Sequencia de fatoriais: " + Arrays.toString(fatoriais));
    }
}
//Rafaela Campos Correa Santos
