import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		int tamanho;
	
		do{
			System.out.println("Entre com o tamanho do vetor 1 menor ou igual a 20: ");
			tamanho = scanner.nextInt();
		}while(tamanho > 20);
		
		int[] E = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            E[i] = scanner.nextInt();
        }
	
		int maiorNum = E[0]; // Inicializa com o primeiro elemento como o maior

        for (int i = 1; i < tamanho; i++) {
            if (E[i] > maiorNum) {
                maiorNum = E[i];
            }
        }
        
        System.out.print("O maior numero do vetor eh: " + maiorNum);
	}
}

//Rafaela Campos Correa Santos
