import java.util.Scanner;
import java.util.Arrays;

public class Ex26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho do vetor
        System.out.print("Digite a dimensao do vetor: ");
        int n = scanner.nextInt();

        int[] AG = new int[n];
        int[] primos = new int[n];
        int count = 0;

        // Lendo os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            AG[i] = scanner.nextInt();
        }

        // Filtrando números primos
        for (int i = 0; i < n; i++) {
            boolean primo = true;
            if (AG[i] <= 1) primo = false;
            for (int j = 2; j <= Math.sqrt(AG[i]); j++) {
                if (AG[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos[count++] = AG[i];
            }
        }

        // Ordenando os números primos em ordem crescente
        primos = Arrays.copyOf(primos, count);
        Arrays.sort(primos);

        // Imprimindo os números primos ordenados
        System.out.println("Numeros primos em ordem crescente:");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i] + " ");
        }

    }
}
//Rafaela Campos Correa Santos
