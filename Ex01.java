import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor com 15 posições
        int[] A = new int[15];

        System.out.println("Digite 15 numeros para preencher o vetor:");

        // Leitura dos elementos do vetor
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Impressão dos elementos do vetor
        System.out.println("\nOs elementos do vetor sao:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }

    }
}
//Rafaela Campos Correa Santos
