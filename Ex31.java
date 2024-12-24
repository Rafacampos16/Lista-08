import java.util.Scanner;
import java.util.Arrays;

public class Ex31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho do vetor AM
        System.out.print("Digite a dimensao do vetor AM (<= 10): ");
        int n = scanner.nextInt();
        if (n <= 0 || n > 10) {
            System.out.println("Erro: A dimensao do vetor AM deve ser maior que zero e menor ou igual a 10.");
            return;
        }

        String[] AM = new String[n];

        // Lendo os elementos do vetor AM
        System.out.println("Digite os elementos do vetor AM (palavras ou frases):");
        scanner.nextLine(); // Consumir o newline pendente
        for (int i = 0; i < n; i++) {
            AM[i] = scanner.nextLine();
        }

        // Exibindo o vetor original
        System.out.println("Vetor AM original: " + Arrays.toString(AM));

        // Ordenando o vetor AM em ordem crescente
        Arrays.sort(AM);

        // Exibindo o vetor ordenado
        System.out.println("Vetor AM ordenado: " + Arrays.toString(AM));

        scanner.close();
    }
}
//Rafaela Campos Correa Santos
