import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		int tamanho;
		
		int[] F = new int[5];
        System.out.println("Digite 5 para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            F[i] = scanner.nextInt();
        }
	
		int soma = 0; // Inicializa com 0 para somar apenas números ímpares
        boolean encontrouImpares = false;

        for (int j = 0; j < F.length; j++) {
            if (F[j] % 2 != 0) {
                soma += F[j];
                encontrouImpares = true;
            }
        }

        if (encontrouImpares) {
            System.out.println("A soma dos numeros impares eh: " + soma);
        } else {
            System.out.println("Nao existem numeros impares no vetor.");
        }
    }
}
//Rafaela Campos Correa Santos
