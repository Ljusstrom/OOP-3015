import javafx.scene.canvas.Canvas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;

enum Elements {
    CIRCLE, RECT, OVAL;
}

public class CanvasExample extends Application {
    private Color color;
    private Elements elements;

    @Override
    public void start(Stage stage) {
        Button button1 = new Button("Color");    // Dark green -> dark blue -> dark red
        Button button2 = new Button("Element");  // Circle -> Rectangle -> Oval
        Canvas canvas = new Canvas(200, 200);
        elements = Elements.CIRCLE;
        color = Color.RED;


        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillOval(10, 10, 30, 30);

        gc.moveTo(0, 0);
        gc.lineTo(20, 20);
        gc.stroke();        // this is needed to actually draw the line

        TilePane layout = new TilePane();
        layout.getChildren().add(canvas);
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);

        canvas.setFocusTraversable(true);
        canvas.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            System.out.println("Key pressed: " + keyCode);
        });

        canvas.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
            System.out.println("Mouse moved to (" + x + ", " + y + ")");
        });

        canvas.setOnMouseClicked(event -> {
            if (elements == Elements.CIRCLE) {
                gc.fillOval(event.getX(), event.getY(), 20, 20);
            } else if (elements == Elements.RECT) {
                gc.fillRoundRect(event.getX(), event.getY(), 20, 20, 2, 2);
            } else if (elements == Elements.OVAL) {
                gc.fillRoundRect(event.getX(), event.getY(), 20, 10, 2, 2);
            }
        });

        button1.setOnAction(event -> {
            if (color.equals(Color.DARKGREEN)) {
                color = Color.DARKRED;
            } else if (color.equals(Color.DARKRED)) {
                color = Color.DARKBLUE;
            } else if (color.equals(Color.DARKBLUE)) {
                color = Color.DARKGREEN;
            } else {
                color = Color.DARKGREEN;
            }
            gc.setFill(color);
        });

        button2.setOnAction(event -> {
            if (elements == Elements.CIRCLE) {
                elements = Elements.RECT;
            } else if (elements == Elements.RECT) {
                elements = Elements.OVAL;
            } else if (elements == Elements.OVAL) {
                elements = Elements.CIRCLE;
            }
        });

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
}
