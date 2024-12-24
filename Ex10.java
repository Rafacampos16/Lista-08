import java.util.Scanner;
import java.util.Arrays;

public class Ex10 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho = 5;
	
		int[] PA = new int[tamanho];
        System.out.println("Digite 5 numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            PA[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
  
		
		int[] PB = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            PB[j] = scanner.nextInt();
        }

	  //concatenacao-----------------------------------------------------
	  
	  int [] PC = new int [PA.length + PB.length];
		
		//System.arraycopy(origem, posicaoInicialOrigem, destino, posicaoInicialDestino, quantidadeElementos);
		
        // Copiar os elementos de PA para PC
        System.arraycopy(PA, 0, PC, 0, PA.length);

        // Copiar os elementos de PB para PC
        System.arraycopy(PB, 0, PC, PA.length, PB.length);
        
		System.out.println("Com Arrays.toString(): " + Arrays.toString(PC));
	 
	  
    }
}
//Rafaela Campos Correa Santos
