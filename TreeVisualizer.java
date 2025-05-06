import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

public class TreeVisualizer extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Árvore Morse - Visualização");

        MorseBST morseTree = new MorseBST(); // Usa a árvore do MorseTreeBuilder
        Canvas canvas = new Canvas(1200, 800);
        morseTree.drawTree(canvas.getGraphicsContext2D(), canvas.getWidth());

        Group root = new Group();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void launchVisualizer() {
        launch(new String[0]);
    }
}