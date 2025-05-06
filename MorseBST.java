import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MorseBST {
    private Node root;

    // Construtor: usa a árvore já construída pelo MorseTreeBuilder
    public MorseBST() {
        this.root = MorseTreeBuilder.buildMorseTree(); // Reaproveita a árvore existente
    }

    // Método para desenhar a árvore (JavaFX)
    public void drawTree(GraphicsContext gc, double canvasWidth) {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvasWidth, 1000);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        drawNode(gc, root, canvasWidth / 2, 50, canvasWidth / 4);
    }

    private void drawNode(GraphicsContext gc, Node node, double x, double y, double xOffset) {
        if (node == null) return;

        // Desenha o nó
        gc.strokeOval(x - 15, y - 15, 30, 30);
        gc.strokeText(node.letter != '\0' ? String.valueOf(node.letter) : "", x - 5, y + 5);

        // Desenha os filhos
        if (node.left != null) {
            double childX = x - xOffset;
            double childY = y + 80;
            gc.strokeLine(x, y + 15, childX, childY - 15);
            drawNode(gc, node.left, childX, childY, xOffset / 2);
        }

        if (node.right != null) {
            double childX = x + xOffset;
            double childY = y + 80;
            gc.strokeLine(x, y + 15, childX, childY - 15);
            drawNode(gc, node.right, childX, childY, xOffset / 2);
        }
    }
}