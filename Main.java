import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node morseTree = MorseTreeBuilder.buildMorseTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Decodificar código Morse");
            System.out.println("2 - Codificar texto para Morse");
            System.out.println("3 - Imprimir Árvore Morse");
            System.out.println("4 - Encerrar programa");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.print("\nDigite a sequência em código Morse (use espaços entre letras e / entre palavras):\n> ");
                    String morseInput = scanner.nextLine().trim();
                    System.out.println("Mensagem decodificada: " + MorseDecoder.decodeMorse(morseTree, morseInput));
                    break;

                    case "2":
                    System.out.print("\nDigite o texto a ser codificado:\n> ");
                    String textoInput = scanner.nextLine().trim();
                    try {
                        System.out.println("Código Morse: " + MorseEncoder.encode(textoInput));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                        System.out.println("Retornando ao menu.");
                    }
                    break;
                

                case "3":
                    System.out.println("\n--- Árvore Binária Morse ---");
                    TreePrinter.printTree(morseTree);
                    break;

                case "4":
                    System.out.println("Até mais!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}