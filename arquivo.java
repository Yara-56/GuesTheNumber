import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhacao {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;

        System.out.println("Seja bem vindo(a) ao Jogo De Adivinhação! ");
        System.out.println("Você terá 5 chances de adivinhar o número aleatório entre 0 e 100");

        for (int i = 1; i <= tentativas ; i++) {
            System.out.println("Essa é a sua " + i + "° tentativa. Qual número você acha que é? ");
            int palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor");
            } else {
                System.out.println("Parabéns! Você acertou o número "+ numeroAleatorio + "em" +i+ " tentativa(s)!");
                break;
            }

            if (i == tentativas){
                System.out.println("Suas tentativas acabaram. O número era " +numeroAleatorio+ ".");
        }
        }

    }
}

