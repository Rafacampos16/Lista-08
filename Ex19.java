import java.util.Scanner;
import java.util.Arrays;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Z = new int[10];

        // Solicita ao usuário os elementos do vetor
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            Z[i] = scanner.nextInt();
        }

        // Ordena o vetor em ordem crescente
        Arrays.sort(Z);

        // Exibe o vetor ordenado
        System.out.println("Vetor ordenado: " + Arrays.toString(Z));
    }
}
//Rafaela Campos Correa Santos
