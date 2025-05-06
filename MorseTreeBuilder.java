public class MorseTreeBuilder {

    // Método público que constrói e retorna a árvore de código Morse completa
    public static Node buildMorseTree() {
        // Criação da raiz da árvore, sem letra associada (caractere nulo)
        Node root = new Node('\0');

        // Inserção dos códigos Morse para cada letra do alfabeto
        // Cada chamada insere uma letra na posição correta da árvore com base na sequência Morse
        insertMorseCode(root, ".-", 'A');
        insertMorseCode(root, "-...", 'B');
        insertMorseCode(root, "-.-.", 'C');
        insertMorseCode(root, "-..", 'D');
        insertMorseCode(root, ".", 'E');
        insertMorseCode(root, "..-.", 'F');
        insertMorseCode(root, "--.", 'G');
        insertMorseCode(root, "....", 'H');
        insertMorseCode(root, "..", 'I');
        insertMorseCode(root, ".---", 'J');
        insertMorseCode(root, "-.-", 'K');
        insertMorseCode(root, ".-..", 'L');
        insertMorseCode(root, "--", 'M');
        insertMorseCode(root, "-.", 'N');
        insertMorseCode(root, "---", 'O');
        insertMorseCode(root, ".--.", 'P');
        insertMorseCode(root, "--.-", 'Q');
        insertMorseCode(root, ".-.", 'R');
        insertMorseCode(root, "...", 'S');
        insertMorseCode(root, "-", 'T');
        insertMorseCode(root, "..-", 'U');
        insertMorseCode(root, "...-", 'V');
        insertMorseCode(root, ".--", 'W');
        insertMorseCode(root, "-..-", 'X');
        insertMorseCode(root, "-.--", 'Y');
        insertMorseCode(root, "--..", 'Z');

        // Retorna a raiz da árvore construída
        return root;
    }

    // Método auxiliar privado para inserir uma letra na árvore, seguindo a sequência Morse
    private static void insertMorseCode(Node root, String sequence, char letter) {
        Node current = root;

        // Para cada símbolo da sequência Morse (ponto ou traço)
        for (char symbol : sequence.toCharArray()) {
            if (symbol == '.') {
                // Vai para a subárvore esquerda no caso de ponto
                if (current.left == null) {
                    current.left = new Node('\0'); // Cria o nó se não existir
                }
                current = current.left;
            } else if (symbol == '-') {
                // Vai para a subárvore direita no caso de traço
                if (current.right == null) {
                    current.right = new Node('\0'); // Cria o nó se não existir
                }
                current = current.right;
            }
        }

        // Ao final da sequência, atribui a letra ao nó correspondente
        current.letter = letter;
    }
}
