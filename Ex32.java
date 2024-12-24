import java.util.Scanner;
import java.util.Arrays;

public class Ex32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando a entrada de uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Separando as palavras da frase e calculando a quantidade
        String[] AN = frase.split(" ");
        int n = AN.length;

        // Exibindo a quantidade de palavras
        System.out.println("Quantidade de palavras: " + n);

        // Exibindo o vetor original
        System.out.println("Vetor AN original: " + Arrays.toString(AN));

        // Ordenando o vetor AN em ordem crescente
        Arrays.sort(AN);

        // Exibindo o vetor ordenado
        System.out.println("Vetor AN ordenado: " + Arrays.toString(AN));

    }
}
//Rafaela Campos Correa Santos
