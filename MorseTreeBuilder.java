public class MorseTreeBuilder {
    public static Node buildMorseTree() {
        Node root = new Node('\0');

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

        return root;
    }

    private static void insertMorseCode(Node root, String sequence, char letter) {
        Node current = root;
        for (char symbol : sequence.toCharArray()) {
            if (symbol == '.') {
                if (current.left == null) {
                    current.left = new Node('\0');
                }
                current = current.left;
            } else if (symbol == '-') {
                if (current.right == null) {
                    current.right = new Node('\0');
                }
                current = current.right;
            }
        }
        current.letter = letter;
    }
}