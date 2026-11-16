import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        Button topButton = new Button("NORTH");
        Button rightButton = new Button("EAST");
        Button bottomButton = new Button("SOUTH");
        Button leftButton = new Button("WEST");
        Button centerButton = new Button("CENTER");

        layout.setTop(topButton);
        layout.setRight(rightButton);
        layout.setBottom(bottomButton);
        layout.setLeft(leftButton);
        layout.setCenter(centerButton);

        centerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                layout.setAlignment(topButton, Pos.CENTER);
                layout.setAlignment(bottomButton, Pos.CENTER);
                layout.setAlignment(leftButton, Pos.CENTER);
                layout.setAlignment(rightButton, Pos.CENTER);
            }
        });

        Scene view = new Scene(layout);

        // GridPane
        GridPane layout2 = new GridPane();

        Button button1 = new Button("TOP LEFT");
        Button button2 = new Button("TOP RIGHT");
        Button button3 = new Button("BOTTOM LEFT");
        Button button4 = new Button("BOTTOM RIGHT");
        Button button5 = new Button("MIDDLE (with long text)");

        layout2.add(button1, 0, 0);
        layout2.add(button2, 1, 0);
        layout2.add(button3, 0, 2);
        layout2.add(button4, 1, 2);
        layout2.add(button5, 0, 1, 2, 1);

        Scene view2 = new Scene(layout2);

        topButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(view2);   // Change the scene to GridPane
            }
        });

        // HBOX
        HBox layout3 = new HBox();
        Button[] buttons = new Button[12];
        for (int i = 0; i < 12; i++) {
            buttons[i] = new Button("" + (i + 1));
            layout3.getChildren().add(buttons[i]);
        }

        //Scene view3 = new Scene(layout);
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                layout2.add(layout3, 0, 3, 2, 1);
            }
        });


        // StackPane:
        StackPane layout4 = new StackPane();

        Button button1_ = new Button("[           ]");
        Label label = new Label("Hello!");

        label.setOpacity(0.5);

        layout4.getChildren().add(button1_);
        layout4.getChildren().add(label);

        buttons[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                layout3.getChildren().add(layout4); // Add as 13th element to HBox
            }
        });

        // AnchorPane - doesn't make any sense to put it as 14th element to HBox
        AnchorPane layout5 = new AnchorPane();

        Button button1__ = new Button("TOP LEFT");
        Button button2__ = new Button("TOP RIGHT");
        Button button3__ = new Button("BOTTOM LEFT");
        Button button4__ = new Button("BOTTOM RIGHT");

        layout5.getChildren().add(button1__);
        layout5.getChildren().add(button2__);
        layout5.getChildren().add(button3__);
        layout5.getChildren().add(button4__);

        AnchorPane.setTopAnchor(button1__, 10.0);
        AnchorPane.setLeftAnchor(button1__, 10.0);

        AnchorPane.setTopAnchor(button2__, 10.0);
        AnchorPane.setRightAnchor(button2__, 10.0);

        AnchorPane.setBottomAnchor(button3__, 10.0);
        AnchorPane.setLeftAnchor(button3__, 10.0);

        AnchorPane.setBottomAnchor(button4__, 10.0);
        AnchorPane.setRightAnchor(button4__, 10.0);

        button1_.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                layout3.getChildren().add(layout5); // Add as 14th element
            }
        });

        stage.setScene(view);
        stage.show();

    }
}