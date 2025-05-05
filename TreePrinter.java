public class TreePrinter {

    public static void printTree(Node root) {
        printTree(root, 0);
    }

    private static void printTree(Node node, int depth) {
        if (node == null) return;

        // Imprime ramo direito (traços) primeiro
        printTree(node.right, depth + 1);

        // Constrói indentação sem usar String.repeat
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("    ");
        }
        System.out.print(indent.toString());

        // Mostra letra ou '*' para nós internos
        System.out.println(node.letter == '\0' ? "*" : node.letter);

        // Imprime ramo esquerdo (pontos)
        printTree(node.left, depth + 1);
    }
}
