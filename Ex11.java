import java.util.Scanner;
import java.util.Arrays;

public class Ex11 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamanho = 5;
	
		int[] QA = new int[tamanho];
        System.out.println("Digite 5 numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            QA[i] = scanner.nextInt();
        }

        
        //vetor 2--------------------------------------------------------
  
		
		int[] QB = new int[tamanho];
        System.out.println("Digite numeros para preencher o vetor:");
		
	
        // Leitura dos elementos do vetor
        for (int j = 0; j < tamanho; j++) {
            System.out.print("Elemento " + (j + 1) + ": ");
            QB[j] = scanner.nextInt();
        }

	  //intercalação-----------------------------------------------------
	  
        int[] QC = new int[QA.length + QB.length];

        // Intercala os elementos dos dois vetores
        int i = 0, j = 0, k = 0;
        while (i < QA.length && j < QB.length) {
            QC[k++] = QA[i++]; // Copia um elemento de PA
            QC[k++] = QB[j++]; // Copia um elemento de PB
        }

        // Copia os elementos restantes de PA, se houver
        while (i < QA.length) {
            QC[k++] = QA[i++];
        }

        // Copia os elementos restantes de PB, se houver
        while (j < QB.length) {
            QC[k++] = QB[j++];
        }

        // Exibe o vetor intercalado
        System.out.println("Vetor intercalado: " + Arrays.toString(QC));
	 
	  
    }
}
//Rafaela Campos Correa Santos
