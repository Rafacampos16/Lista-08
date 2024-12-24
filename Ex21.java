import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] AB = new int[10];
        int[] pares = new int[10];

        // Solicita ao usuário os elementos do vetor
        System.out.println("Digite 10 numeros para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            AB[i] = scanner.nextInt();

            // Multiplica números ímpares por 2
            if (AB[i] % 2 != 0) {
                pares[i] = AB[i] * 2; // Se for ímpar, multiplica por 2
            } else {
                pares[i] = AB[i]; // Se for par, mantém o número
            }
        }

        // Exibe o vetor resultante usando um for tradicional
        System.out.println("Vetor com elementos transformados:");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
    }
}
//Rafaela Campos Correa Santos
