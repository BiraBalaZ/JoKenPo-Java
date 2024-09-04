import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Cria uma instância de Scanner para capturar o prompt do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria uma lista com as opções de jogo
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // A IA escolhe um número aleatório entre 1 e 3
        int iaChoice = random.nextInt(3);

        // Solicita que o jogador digite um número
        System.out.println("[1] Pedra\n[2] Papel\n[3] Tesoura\n>>> ");
        int choice = scanner.nextInt() - 1;

        // Imprime as escolhas
        System.out.println("Você escolheu " + opcoes[choice]);
        System.out.println("A I.A. escolheu " + opcoes[iaChoice] + "\n");

        // Verificando vencedor
        if (choice == iaChoice) {
            System.out.println("Empate!");
        } else if ((choice == 0 && iaChoice == 2) || 
                   (choice == 1 && iaChoice == 0) || 
                   (choice == 2 && iaChoice == 1)) {
            System.out.println("Você VENCEU! :D");
        } else {
            System.out.println("Você perdeu :(");
        }

        // Fecha o Scanner
        scanner.close();
    }
}
