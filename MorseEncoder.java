public class MorseEncoder {
    private static Tree morseTree = MorseTreeBuilder.buildMorseTree();

    // Codifica um texto em Morse
    public static String encode(String text) {
        StringBuilder encoded = new StringBuilder();
        text = text.toUpperCase(); // logica parecida com a decodificação

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                encoded.append("/ "); 
                continue;
            }

            String code = findMorseCode(morseTree, c); // Busca o código Morse
            if (code == null) {
                throw new IllegalArgumentException("Caractere não suportado: " + c);
            }

            encoded.append(code).append(' '); // Adiciona o código com espaço
        }

        // Remove o último espaço, se houver
        if (encoded.length() > 0) {
            encoded.setLength(encoded.length() - 1);
        }

        return encoded.toString();
    }

    // Inicia a busca pelo código Morse de um caractere
    private static String findMorseCode(Tree root, char target) {
        return searchMorseCode(root, target, new StringBuilder());
    }

    // Busca recursiva pelo caractere na árvore, acumulando o caminho (código Morse)
    private static String searchMorseCode(Tree node, char target, StringBuilder path) {
        if (node == null) {
            return null;
        }

        // Se encontrou o caractere, retorna o caminho acumulado
        if (node.letter == target) {
            return path.toString();
        }

        // Procura à esquerda (adiciona '.' ao caminho)
        path.append('.');
        String leftResult = searchMorseCode(node.left, target, path);
        if (leftResult != null) {
            return leftResult;
        }
        path.deleteCharAt(path.length() - 1); // Backtrack

        // Procura à direita (adiciona '-' ao caminho)
        path.append('-');
        String rightResult = searchMorseCode(node.right, target, path);
        if (rightResult != null) {
            return rightResult;
        }
        path.deleteCharAt(path.length() - 1); // Backtrack

        return null; // Caractere não encontrado neste ramo
    }
}   