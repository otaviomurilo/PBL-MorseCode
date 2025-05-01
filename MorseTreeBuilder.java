public class MorseTreeBuilder {
    public static Tree buildMorseTree() {
        Tree root = new Tree('\0');

        insertMorseCode(root, ".", 'E');
        insertMorseCode(root, "-", 'T');
        insertMorseCode(root, "..", 'I');
        insertMorseCode(root, ".-", 'A');
        insertMorseCode(root, "-.", 'N');
        insertMorseCode(root, "--", 'M');
        insertMorseCode(root, "...", 'S');
        insertMorseCode(root, "..-", 'U');
        insertMorseCode(root, ".-.", 'R');
        insertMorseCode(root, ".--", 'W');
        insertMorseCode(root, "-..", 'D');
        insertMorseCode(root, "-.-", 'K');
        insertMorseCode(root, "--.", 'G');
        insertMorseCode(root, "---", 'O');
        insertMorseCode(root, "-.-.", 'C');

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
