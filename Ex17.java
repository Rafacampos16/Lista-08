import java.util.Scanner;
import java.util.Arrays;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        // Solicita ao usuário a quantidade de números primos
        do {
            System.out.print("Digite a quantidade de numeros primos (N <= 20): ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 20);

        // Cria o vetor para armazenar os números primos
        int[] primos = new int[n];

        // Variáveis para encontrar números primos
        int numero = 2; // Começa com o primeiro número primo
        int contadorPrimos = 0;

        // Gera os números primos
        while (contadorPrimos < n) {
            boolean ehPrimo = true;

            // Verifica se o número é primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            // Se for primo, adiciona ao vetor
            if (ehPrimo) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            }

            numero++;
        }

        // Exibe o vetor com os números primos
        System.out.println("Sequencia de numeros primos: " + Arrays.toString(primos));
    }
}
//Rafaela Campos Correa Santos
