import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		int tamanho;
	
		do{
			System.out.println("Entre com um tamanho de vetor menor ou igual a 20: ");
			tamanho = scanner.nextInt();
		}while(tamanho > 20);
		
		int[] D = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            D[i] = scanner.nextInt();
        }

        // Impressão dos elementos do vetor
        System.out.println("\nOs elementos do vetor sao:");
        for (int i = 0; i < D.length; i++) {
            System.out.println("D[" + i + "] = " + D[i]);
        }

    }
}
//Rafaela Campos Correa Santos
