public class Node {
    private Node left; //ponto
    private Node right; //traço
    private char letter;

    public Node(char letter) {
        this.letter = letter;
        this.left = null;
        this.right = null;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) { //atribui um nó à esquerda do nó atual
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
