public class Main {
    public static void main(String[] args) {
        Tree morseTree = MorseTreeBuilder.buildMorseTree();

        String input = ".. -. ... .. -.. . / -.-. --- -.. .";
        System.out.println("Morse Code: " + input);
        System.out.println("Decoded Message: " + MorseDecoder.decodeMorse(morseTree, input));
    }
}
