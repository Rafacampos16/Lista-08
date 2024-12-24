import java.util.Scanner;
import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	
		int tamanho, tamanho2;
	
		do{
			System.out.println("Entre com o tamanho do vetor 1 menor ou igual a 10: ");
			tamanho = scanner.nextInt();
		}while(tamanho > 10);
		
		int[] S = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            S[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
        do{
			System.out.println("Entre com o tamanho do vetor 2 menor ou igual a 15: ");
			tamanho2 = scanner.nextInt();
		}while(tamanho2 > 15);
		
		int[] T = new int[tamanho2];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho2; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            T[j] = scanner.nextInt();
        }

	   // Vetor 3
        int[] U = new int[S.length + T.length];

        // Intercala os elementos dos dois vetores
        int i = 0, j = 0, k = 0;
        while (i < S.length && j < T.length) {
            U[k++] = S[i++]; // Copia um elemento de PA
            U[k++] = T[j++]; // Copia um elemento de PB
        }

        // Copia os elementos restantes de PA, se houver
        while (i < S.length) {
            U[k++] = S[i++];
        }

        // Copia os elementos restantes de PB, se houver
        while (j < T.length) {
            U[k++] = T[j++];
        }

        // Exibe o vetor intercalado
        System.out.println("Vetor intercalado: " + Arrays.toString(U));
	 
    }
}
//Rafaela Campos Correa Santos
