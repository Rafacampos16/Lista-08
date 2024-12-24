import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, maxElemento;

        do {
            System.out.print("Informe o numero de posicoes do vetor (1 a 20): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 20);

        // Solicita o número máximo para os elementos e valida a entrada
        do {
            System.out.print("Informe o numero maximo para os elementos do vetor (maior que 0): ");
            maxElemento = scanner.nextInt();
        } while (maxElemento <= 0);

        // Cria o vetor
        int[] AC = new int[n];

        // Preenche o vetor com validação
        System.out.println("Digite os elementos do vetor (entre 0 e " + maxElemento + "):");
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Elemento " + (i + 1) + ": ");
                AC[i] = scanner.nextInt();
                if (AC[i] < 0 || AC[i] > maxElemento) {
                    System.out.println("O numero deve estar entre 0 e " + maxElemento + ". Tente novamente.");
                }
            } while (AC[i] < 0 || AC[i] > maxElemento);
        }

        // Exibe o vetor
        System.out.println("Vetor AC:");
        for (int i = 0; i < n; i++) {
            System.out.print(AC[i] + " ");
        }
    }
}
//Rafaela Campos Correa Santos
