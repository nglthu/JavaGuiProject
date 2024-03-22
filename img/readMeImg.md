
# JavaFX Layout


## Layer

<img src="https://nglthu.github.io/JavaGuiProject/img/Screenshot%202024-03-18%20092325.png">

<img src="https://nglthu.github.io/JavaGuiProject/img/JavaFX_Stage_Scene.png">

Image retrieved from https://www.baeldung.com/javafx

## Description
<img src="https://nglthu.github.io/JavaGuiProject/img/Screenshot%202024-03-18%20090738.png">

<img src="https://nglthu.github.io/JavaGuiProject/img/Screenshot%202024-03-18%20091052.png">


# Example

<img src="https://nglthu.github.io/JavaGuiProject/img/Screenshot%202024-03-18%20091011.png">

```

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Insets;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JFXExp extends Application {
/*
*Life Cycle of JavaFX
*init() – is called after the application instance is created. At this point, the JavaFX API isn’t ready yet, so we can’t create graphical components here.
*start(Stage stage) – all the graphical components are created here. Also, the main thread for the graphical activities starts here.
*stop() – is called before the application shutdown; 
*/

   //Stage is the main container and the entry point of the application
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Paitient Management");
            BorderPane root = new BorderPane();

            //Scene is a container for holding the UI elements, such as GridPane, Label, TextField, Button.
            Scene scene = new Scene(gridPane);
            
            // Creating a Grid Pane
            GridPane gridPane = new GridPane();

            // gridPane css -  Setting size for the pane
            gridPane.setMinSize(400, 200);

            // Setting the padding
            gridPane.setPadding(new Insets(10, 10, 10, 10));

            // Setting the vertical and horizontal gaps between the columns
            gridPane.setVgap(5);
            gridPane.setHgap(5);

            //Components: Label, TextField, Button
            Label iLableName = new Label("Paitent Name:");
            Label iLabelDoB = new Label("Date of Birth");
            TextField iTextFieldName = new TextField();
            TextField iTextFieldDoB = new TextField();
            Button iButton = new Button("Create");

            //Arrange components/items in Grid
            gridPane.add(iLableName, 0, 0);
            gridPane.add(iTextFieldName, 1, 0);
            gridPane.add(iLabelDoB, 0, 1);
            gridPane.add(iTextFieldDoB, 1, 1);
            gridPane.add(iButton, 1, 2);

            //Action; Event handle on Button
            iButton.setOnAction(e -> {
              primaryStage.setTitle(iTextFieldName.toString());
            });
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```
