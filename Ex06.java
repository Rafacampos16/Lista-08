import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	
		int tamanho, tamanho2;
	
		do{
			System.out.println("Entre com o tamanho do vetor 1 menor ou igual a 15: ");
			tamanho = scanner.nextInt();
		}while(tamanho > 15);
		
		int[] A = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
        do{
			System.out.println("Entre com o tamanho do vetor 2 menor ou igual a 15: ");
			tamanho2 = scanner.nextInt();
		}while(tamanho2 > 15);
		
		int[] B = new int[tamanho2];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho2; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            B[j] = scanner.nextInt();
        }

	   // Vetor 3
        int maiorTamanho = Math.max(tamanho, tamanho2); // Ajusta o tamanho máximo para a comparação

        for (int i = 0; i < maiorTamanho; i++) {
            if (i < tamanho && i < tamanho2) {
                if (A[i] == B[i]) {
                    System.out.println("Os vetores de posição [" + i + "] são iguais!!!");
                } else {
                    System.out.println("Os vetores de posição [" + i + "] são diferentes!!!");
                }
            } else {
                // Se uma das posições não existir em um dos vetores, considera que são diferentes
                System.out.println("Os vetores de posição [" + i + "] são diferentes!!!");
            }
        }
    }
}
//Rafaela Campos Correa Santos
