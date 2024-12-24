import java.util.Scanner;
import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	
		int tamanho, tamanho2;
	
		do{
			System.out.println("Entre com o tamanho do vetor 1 menor ou igual a 10: ");
			tamanho = scanner.nextInt();
		}while(tamanho > 10);
		
		int[] P = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            P[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
        do{
			System.out.println("Entre com o tamanho do vetor 2 menor ou igual a 15: ");
			tamanho2 = scanner.nextInt();
		}while(tamanho2 > 15);
		
		int[] Q = new int[tamanho2];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho2; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            Q[j] = scanner.nextInt();
        }

	   // Vetor 3
        int [] R = new int [P.length + Q.length];
		
		//System.arraycopy(origem, posicaoInicialOrigem, destino, posicaoInicialDestino, quantidadeElementos);
		
        // Copiar os elementos de PA para PC
        System.arraycopy(P, 0, R, 0, P.length);

        // Copiar os elementos de PB para PC
        System.arraycopy(Q, 0, R, P.length, Q.length);
        
		System.out.println("Com Arrays.toString(): " + Arrays.toString(R));
	 
    }
}
//Rafaela Campos Correa Santos
