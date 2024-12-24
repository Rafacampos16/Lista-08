import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] AA = new Integer[10];

        // Solicita ao usuário os elementos do vetor
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            AA[i] = scanner.nextInt();
        }

        // Ordena o vetor em ordem decrescente
        Arrays.sort(AA, Collections.reverseOrder());

        // Exibe o vetor ordenado
        System.out.println("Vetor ordenado em ordem decrescente: " + Arrays.toString(AA));
    }
}

/*import java.util.Scanner;
import java.util.Arrays;

public class OrdenarVetorDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] AA = new int[10];

        // Solicita ao usuário os elementos do vetor
        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            AA[i] = scanner.nextInt();
        }

        // Ordena o vetor em ordem decrescente manualmente
        for (int i = 0; i < AA.length - 1; i++) {
            for (int j = i + 1; j < AA.length; j++) {
                if (AA[i] < AA[j]) {
                    // Troca os elementos
                    int temp = AA[i];
                    AA[i] = AA[j];
                    AA[j] = temp;
                }
            }
        }

        // Exibe o vetor ordenado
        System.out.println("Vetor ordenado em ordem decrescente: " + Arrays.toString(AA));
    }
}
*/
//Rafaela Campos Correa Santos
