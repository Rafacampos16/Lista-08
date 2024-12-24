import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] AE = new int[10];
        Integer[] impares = new Integer [10];
        int count = 0; // Contador para rastrear quantos pares foram encontrados

        // Solicita ao usuário os elementos do vetor
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            AE[i] = scanner.nextInt();

            // Verifica se o número é par
            if (AE[i] % 2 != 0) {
                impares[count] = AE[i]; // Adiciona o número par ao vetor
                count++; // Incrementa o contador de números pares
            }
        }

        // Verifica se há pares para exibir
        if (count == 0) {
            System.out.println("Não há números pares no vetor.");
        } else {
            // Reduz o tamanho do vetor de pares para os elementos válidos
            impares = Arrays.copyOf(impares, count);

            // Ordena o vetor de pares em ordem crescente
			Arrays.sort(impares, Collections.reverseOrder());
			 
            // Exibe os números pares ordenados
            System.out.println("Números pares em ordem crescente:");
            for (int i = 0; i < impares.length; i++) {
                System.out.print(impares[i] + " ");
            }
        }
    }
}
//Rafaela Campos Correa Santos
