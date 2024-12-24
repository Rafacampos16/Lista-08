import java.util.Scanner;
import java.util.Arrays;

public class Ex12 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho = 5;
		int tamanho2 = 15;
		
		int[] P = new int[tamanho];
        System.out.println("Digite 5 numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            P[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
  
		
		int[] Q = new int[tamanho2];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho2; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            Q[j] = scanner.nextInt();
        }

	  //concatenacao-----------------------------------------------------
	  
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
