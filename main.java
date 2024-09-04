import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Cria uma instância de Scanner para capturar o prompt do usuário
        Scanner scanner = new Scanner(System.in);

        // A IA escolhe um número aleatório entre 1 e 3
        int iaChoice = random.nextInt(3) + 1;

        // Variável para armazenar a escolha do jogador
        int choice = 0;

        // Solicita que o jogador digite um número
        System.out.println("[1] Pedra\n[2] Papel\n[3] Tesoura\n>>> ");
        choice = scanner.nextInt();

        // Verificando a esolha do jogador
        if (choice == 1) {
            System.out.println("Você escolheu Pedra");
        }
        else if (choice == 2) {
            System.out.println("Você escolheu Papel");
        }
        else if (choice == 3) {
            System.out.println("Você escolheu Tesoura");
        }
        else {
            System.out.println("Opção inválida");
        }

        // Verificando a esolha da I.A.
        if (iaChoice == 1) {
            System.out.println("A I.A. escolheu Pedra");
        }
        else if (iaChoice == 2) {
            System.out.println("A I.A. escolheu Papel");
        }
        else if (iaChoice == 3) {
            System.out.println("A I.A. escolheu Tesoura");
        }

        System.out.println();

        // Verificando vencedor
        if (choice == 1 && iaChoice == 2) {
            System.out.println("A I.A. embrulhou você!");
            System.out.println("Você perdeu :(");
        }
        else if (choice == 2 && iaChoice == 1) {
            System.out.println("Você embrulhou a I.A. !");
            System.out.println("Você VENCEU! :D");
        }
        else if (choice == 1 && iaChoice == 3) {
            System.out.println("Você ESMAGOU a I.A. !");
            System.out.println("Você VENCEU! :D");
        }
        else if (choice == 3 && iaChoice == 1) {
            System.out.println("A I.A. ESMAGOU a você!");
            System.out.println("Você perdeu :(");
        }
        else if (choice == 2 && iaChoice == 3) {
            System.out.println("A I.A. picotou você!");
            System.out.println("Você perdeu :(");
        }
        else if (choice == 3 && iaChoice == 2) {
            System.out.println("Você picotou a I.A. !");
            System.out.println("Você VENCEU! :D");
        }
        else {
            System.out.println("Empate!");
        }

        // Fecha o Scanner
        scanner.close();
    }
}
