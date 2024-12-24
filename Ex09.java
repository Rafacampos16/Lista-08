import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] G = new int[tamanho];
        System.out.println("Digite 5 numeros para preencher o vetor G:");

        // Leitura dos elementos do vetor G
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            G[i] = scanner.nextInt();
        }

        // Criar um vetor H para armazenar elementos pares de G
        int[] H = new int[tamanho];
        int contadorPares = 0;

        // Encontrar números pares
        for (int j = 0; j < tamanho; j++) {
            if (G[j] % 2 == 0) {
                H[contadorPares] = G[j];
                contadorPares++;
            }
        }

        // Se houver elementos pares, imprimir vetor H, senão informar que não há números pares
        if (contadorPares > 0) {
            System.out.print("Vetor H: ");
            for (int k = 0; k < contadorPares; k++) {
                System.out.print(H[k] + " ");
            }
        } else {
            System.out.println("Nao existem numeros pares no vetor G.");
        }
    }
}
//Rafaela Campos Correa Santos
