import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ex29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lendo o tamanho do vetor AJ (deve ser >= 10)
        System.out.print("Digite a dimensao do vetor AJ (>= 10): ");
        int n = scanner.nextInt();
        if (n < 10) {
            System.out.println("Erro: A dimensao do vetor AJ deve ser maior ou igual a 10.");
            return;
        }

        int[] AJ = new int[n];

        // Gerando os elementos aleatórios e não repetidos
        for (int i = 0; i < n; i++) {
            int numeroAleatorio;
            boolean repetido;
            do {
                numeroAleatorio = random.nextInt(1000); // Números aleatórios grandes
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (AJ[j] == numeroAleatorio) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            AJ[i] = numeroAleatorio;
        }

        // Ordenando o vetor AJ em ordem crescente
        Arrays.sort(AJ);

        // Permitindo que o usuário tente adivinhar um elemento
        System.out.println("Tente adivinhar um elemento do vetor AJ. Voce tem 10 tentativas.");
        boolean acertou = false;
        int posicao = -1;

        for (int tentativa = 1; tentativa <= 10; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": Digite um numero: ");
            int chute = scanner.nextInt();

            // Verificando se o número está no vetor
            for (int i = 0; i < n; i++) {
                if (AJ[i] == chute) {
                    acertou = true;
                    posicao = i;
                    break;
                }
            }

            if (acertou) {
                System.out.println("Parabens! Voce acertou. O numero " + chute + " esta na posicao " + posicao + " do vetor.");
                break;
            } else {
                System.out.println("Numero incorreto. Tente novamente.");
            }
        }

        if (!acertou) {
            System.out.println("Que pena! Voce nao acertou nenhuma tentativa.");
        }

        // Exibindo o vetor AJ
        System.out.println("Vetor AJ ordenado: " + Arrays.toString(AJ));

        scanner.close();
    }
}
//Rafaela Campos Correa Santos
