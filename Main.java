import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree morseTree = MorseTreeBuilder.buildMorseTree();

                // decodificação
 Scanner scanner = new Scanner(System.in);
System.out.print("Digite a sequência em código Morse (use espaços entre letras e / entre palavras):\n> ");
String input = scanner.nextLine().trim();
scanner.close();


 System.out.println("\nMorse Code: " + input);
System.out.println("Decoded Message: " + MorseDecoder.decodeMorse(morseTree, input));

                //codificação
// System.out.print("\nDigite o texto a ser codificado:\n> ");
//  String input = scanner.nextLine().trim();  
//  scanner.close();

//  System.out.println("\nTexto: " + input);
//  System.out.println("Código Morse: " + MorseEncoder.encode(input));


        // Impressão da árvore
        System.out.println("\n--- Morse Binary Tree ---");
        TreePrinter.printTree(morseTree);
    }
}
