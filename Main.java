import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree morseTree = MorseTreeBuilder.buildMorseTree();

        // Leitura do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sequência em código Morse (use espaços entre letras e / entre palavras):\n> ");
        String input = scanner.nextLine().trim();
        scanner.close();

        // Decodificação e saída
        System.out.println("\nMorse Code: " + input);
        System.out.println("Decoded Message: " + MorseDecoder.decodeMorse(morseTree, input));

        // Impressão da árvore
        System.out.println("\n--- Morse Binary Tree ---");
        TreePrinter.printTree(morseTree);
    }
}
