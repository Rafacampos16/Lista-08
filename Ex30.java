import java.util.Scanner;
import java.util.Arrays;

public class Ex30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho do vetor AK
        System.out.print("Digite a dimensao do vetor AK: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Erro: A dimensao do vetor AK deve ser maior que zero.");
            return;
        }

        double[] AK = new double[n];

        // Lendo os elementos do vetor AK
        System.out.println("Digite os elementos do vetor AK:");
        for (int i = 0; i < n; i++) {
            AK[i] = scanner.nextDouble();
        }

        // Ordenando o vetor AK em ordem crescente
        Arrays.sort(AK);

        // Criando o vetor AL com as médias entre os elementos
        double[] AL = new double[(n - 1) * 2 + 1];

        int index = 0;
        for (int i = 0; i < n; i++) {
            AL[index++] = AK[i];
            if (i < n - 1) {
                AL[index++] = (AK[i] + AK[i + 1]) / 2.0;
            }
        }

        // Exibindo os resultados
        System.out.println("Vetor AK ordenado: " + Arrays.toString(AK));
        System.out.println("Vetor AL com as medias: " + Arrays.toString(AL));

    }
}
//Rafaela Campos Correa Santos
