import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor (máximo 20): ");
        int n = scanner.nextInt();

        // Valida o tamanho do vetor
        while (n <= 0 || n > 20) {
            System.out.print("Tamanho inválido! Digite um valor entre 1 e 20: ");
            n = scanner.nextInt();
        }

        Integer[] AF = new Integer[n];
        Integer[] impares = new Integer[n];
        Integer[] pares = new Integer[n];
        int countImpares = 0, countPares = 0;

        // Preenche o vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            AF[i] = scanner.nextInt();

            // Classifica os elementos em pares e ímpares
            if (AF[i] % 2 == 0) {
                pares[countPares++] = AF[i];
            } else {
                impares[countImpares++] = AF[i];
            }
        }

        // Ajusta os tamanhos dos vetores de pares e ímpares
        pares = Arrays.copyOf(pares, countPares);
        impares = Arrays.copyOf(impares, countImpares);

        // Ordena os ímpares em ordem crescente e depois em ordem decrescente
        Arrays.sort(impares, Collections.reverseOrder());

        // Ordena os pares em ordem decrescente
        Arrays.sort(pares, Collections.reverseOrder());

        // Combina os vetores ordenados no vetor original
        int contador = 0;
        for (int i = 0; i < countImpares; i++) {
            AF[contador++] = impares[i];
        }
        for (int i = 0; i < countPares; i++) {
            AF[contador++] = pares[i];
        }

        // Imprime o vetor resultante
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < AF.length; i++) {
            System.out.print(AF[i] + " ");
        }
    }
}
//Rafaela Campos Correa Santos
