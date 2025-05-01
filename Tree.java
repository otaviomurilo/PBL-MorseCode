public class Tree {

    char letter;
    Tree left;
    Tree right;

    public Tree(char letter) {
        this.letter = letter;
        this.left = null;
        this.right = null;
    }

    public boolean isEmpty() {// verifica se é uma árvore vazia
        return this == null;
    }
}
