import java.util.Arrays;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] AB = new int[10];
        int[] pares = new int[10];
        int countPares = 0; // Contador para rastrear quantos pares foram encontrados

        // Solicita ao usuário os elementos do vetor
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            AB[i] = scanner.nextInt();

            // Verifica se o número é par
            if (AB[i] % 2 == 0) {
                pares[countPares] = AB[i]; // Adiciona o número par ao vetor
                countPares++; // Incrementa o contador de números pares
            }
        }

        // Verifica se há pares para exibir
        if (countPares == 0) {
            System.out.println("Não há números pares no vetor.");
        } else {
            // Reduz o tamanho do vetor de pares para os elementos válidos
            pares = Arrays.copyOf(pares, countPares);

            // Ordena o vetor de pares em ordem crescente
            Arrays.sort(pares);

            // Exibe os números pares ordenados
            System.out.println("Números pares em ordem crescente:");
            for (int i = 0; i < pares.length; i++) {
                System.out.print(pares[i] + " ");
            }
        }
    }
}
//Rafaela Campos Correa Santos
