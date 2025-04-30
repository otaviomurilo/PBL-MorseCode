public class Tree {
    char letter;
    Tree left;
    Tree right;

    public Tree(char letter, Tree left, Tree right) {
        this.letter = letter;
        this.left = left;
        this.right = right;
    }


    public boolean isEmpty() {// verifica se é uma árvore vazia
        return this == null;
    }
}
