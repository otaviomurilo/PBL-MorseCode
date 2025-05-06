import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Constrói a árvore binária Morse com todas as letras do alfabeto
        Node morseTree = MorseTreeBuilder.buildMorseTree();

        // Cria um scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop principal do menu interativo
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Decodificar código Morse");
            System.out.println("2 - Codificar texto para Morse");
            System.out.println("3 - Imprimir Árvore Morse");
            System.out.println("4 - Encerrar programa");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine().trim(); // Lê a opção do usuário

            switch (input) {
                case "1":
                    // Decodificação de código Morse para texto
                    System.out.print("\nDigite a sequência em código Morse (use espaços entre letras e / entre palavras):\n> ");
                    String morseInput = scanner.nextLine().trim();

                    // Chama o método de decodificação e imprime o resultado
                    System.out.println("Mensagem decodificada: " + MorseDecoder.decodeMorse(morseTree, morseInput));
                    break;

                case "2":
                    // Codificação de texto para código Morse
                    System.out.print("\nDigite o texto a ser codificado:\n> ");
                    String textoInput = scanner.nextLine().trim();

                    try {
                        // Codifica e imprime o resultado
                        System.out.println("Código Morse: " + MorseEncoder.encode(textoInput));
                    } catch (IllegalArgumentException e) {
                        // Trata erro de entrada inválida
                        System.out.println("Erro: " + e.getMessage());
                        System.out.println("Retornando ao menu.");
                    }
                    break;

                case "3":
                    // Impressão da árvore Morse em forma textual no console
                    System.out.println("\n--- Árvore Binária Morse ---");
                    TreePrinter.printTree(morseTree);

                    // Inicia visualização gráfica da árvore usando JavaFX
                    new Thread(() -> javafx.application.Application.launch(TreeVisualizer.class)).start();
                    break;

                case "4":
                    // Encerra o programa
                    System.out.println("Até mais!");
                    scanner.close(); // Fecha o scanner
                    return;

                default:
                    // Entrada inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
