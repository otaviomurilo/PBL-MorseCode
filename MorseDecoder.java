public class MorseDecoder {
    public static char morseToChar(Tree morseTree, String sequence, int i) {
        if (morseTree == null) {
            return '\0'; // Caractere nulo se a árvore estiver vazia
        }
        if (i == sequence.length()) {
            return morseTree.letter;
        } else if (sequence.charAt(i) == '.') {
            return morseToChar(morseTree.left, sequence, i + 1);
        } else {
            return morseToChar(morseTree.right, sequence, i + 1);
        }
    }

    public static String decodeMorse(Tree morseTree, String input) {
        StringBuilder decodedMessage = new StringBuilder();
        String[] sequences = input.split(" ");

        for (String sequence : sequences) {
            if (sequence.equals("/")) { // representa um espaço entre palavras
                decodedMessage.append(" "); 
            } else {
                decodedMessage.append(morseToChar(morseTree, sequence, 0));
            }
        }
        return decodedMessage.toString();
    }
}
