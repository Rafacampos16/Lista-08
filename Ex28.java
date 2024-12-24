import java.util.Scanner;
import java.util.Arrays;

public class Ex28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho do vetor AH (deve ser >= 25)
        System.out.print("Digite a dimensão do vetor AH (>= 25): ");
        int n = scanner.nextInt();
        if (n < 25) {
            System.out.println("Erro: A dimensão do vetor AH deve ser maior ou igual a 25.");
            return;
        }

        int[] AH = new int[n];

        // Lendo os elementos do vetor AH
        System.out.println("Digite os elementos do vetor AH:");
        for (int i = 0; i < n; i++) {
            AH[i] = scanner.nextInt();
        }

        // Lendo a dimensão do vetor AI (entre 2 e 5)
        System.out.print("Digite a dimensão do vetor AI (entre 2 e 5): ");
        int m = scanner.nextInt();
        if (m < 2 || m > 5) {
            System.out.println("Erro: A dimensão do vetor AI deve estar entre 2 e 5.");
            return;
        }

        int[] AI = new int[m];

        // Gerando os elementos do vetor AI
        System.out.println("Digite os elementos do vetor AI:");
        for (int i = 0; i < m; i++) {
            AI[i] = scanner.nextInt();
        }

        // Verificando se o vetor AI está contido no vetor AH
        boolean encontrado = false;
        System.out.println("Ocorrências do vetor AI no vetor AH:");

        for (int i = 0; i <= n - m; i++) {
            boolean contem = true;
            for (int j = 0; j < m; j++) {
                if (AH[i + j] != AI[j]) {
                    contem = false;
                    break;
                }
            }
            if (contem) {
                encontrado = true;
                System.out.println("Encontrado na posição inicial: " + i);
            }
        }

        // Caso não tenha encontrado nenhuma ocorrência
        if (!encontrado) {
            System.out.println("Erro: O vetor AI não está contido no vetor AH.");
        }

    }
}
//Rafaela Campos Correa Santos
