import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		
		System.out.println("Digite o numero de posicoes para o vetor:");
		int tamanho = scanner.nextInt();
		
		
		int[] C = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            C[i] = scanner.nextInt();
        }

        // Impressão dos elementos do vetor
        System.out.println("\nOs elementos do vetor sao:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

    }
}
//Rafaela Campos Correa Santos
