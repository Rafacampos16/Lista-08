import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	
		int tamanho, tamanho2;
	
		do{
			System.out.println("Entre com o tamanho do vetor 1 menor ou igual a 15: ");
			tamanho = scanner.nextInt();
		}while(tamanho > 15);
		
		int[] E = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            E[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
        do{
			System.out.println("Entre com o tamanho do vetor 2 menor ou igual a 15: ");
			tamanho2 = scanner.nextInt();
		}while(tamanho2 > 15);
		
		int[] F = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho2; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            F[j] = scanner.nextInt();
        }

	//Vetor 3 ------------------------------------------------------------
		int[] soma = new int[tamanho];
		
		  for (int i = 0; i < soma.length; i++) {
            soma[i] = E[i] + F[i];
        }
		
		  System.out.println("\nA soma dos dois vetores eh:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("soma[" + i + "] = " + soma[i]);
        }

    }
}
//Rafaela Campos Correa Santos
