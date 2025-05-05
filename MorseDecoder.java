public class MorseDecoder {
    public static char morseToChar(Node morseTree, String sequence, int i) {
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

    public static String decodeMorse(Node morseTree, String input) {
        StringBuilder decodedMessage = new StringBuilder();
        String[] sequences = input.trim().split(" ");
    
        for (String sequence : sequences) {
            if (sequence.equals("/")) {
                decodedMessage.append(" ");
            } else {
                char decodedChar = morseToChar(morseTree, sequence, 0);
                if (decodedChar == '\0') {
                    return "Erro: sequência inválida ou não encontrada -> \"" + sequence + "\"";
                }
                decodedMessage.append(decodedChar);
            }
        }
    
        return decodedMessage.toString();
    }
    
}