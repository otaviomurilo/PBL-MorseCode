public class MorseTreeBuilder {
    public static Tree buildMorseTree() {
        Tree root = new Tree('\0');

        insertMorseCode(root, ".", 'E');
        insertMorseCode(root, "-", 'T');
        insertMorseCode(root, ".-", 'A');
        insertMorseCode(root, "-...", 'B');
        insertMorseCode(root, "-.-.", 'C');
        insertMorseCode(root, "-..", 'D');
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

    private static void insertMorseCode(Tree root, String sequence, char letter) {
        Tree current = root;

        for (char symbol : sequence.toCharArray()) {
            if (symbol == '.') {
                if (current.left == null) {
                    current.left = new Tree('\0'); // Novo nó vazio
                }
                current = current.left;
            } else if (symbol == '-') {
                if (current.right == null) {
                    current.right = new Tree('\0');
                }
                current = current.right;
            }
        }
        current.letter = letter;
    }
}
