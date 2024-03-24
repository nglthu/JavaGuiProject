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
import javafx.scene.control.Alert;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//Import PatientRecord
import PatientRecord;

public class JFXExp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();

            // Scene scene = new Scene(root,500,500);
            primaryStage.setTitle("Paitient Management");

            // Creating a Grid Pane
            GridPane gridPane = new GridPane();

            // gridPane css
            // Setting size for the pane
            gridPane.setMinSize(400, 200);

            // Setting the padding
            gridPane.setPadding(new Insets(10, 10, 10, 10));

            // Setting the vertical and horizontal gaps between the columns
            gridPane.setVgap(5);
            gridPane.setHgap(5);

            HBox iHBox = new HBox();

            Label iLableName = new Label("Paitent Name:");
            Label iLabelDoB = new Label("Date of Birth");

            TextField iTextFieldName = new TextField();
            TextField iTextFieldDoB = new TextField();

            Button iButton = new Button("Create");

            iHBox.getChildren().add(iLableName);

            iHBox.setSpacing(10);
            iHBox.getChildren().add(iTextFieldName);
            iHBox.getChildren().add(iButton);
            gridPane.add(iLableName, 0, 0);
            gridPane.add(iTextFieldName, 1, 0);
            gridPane.add(iLabelDoB, 0, 1);
            gridPane.add(iTextFieldDoB, 1, 1);
            gridPane.add(iButton, 1, 2);

            // Scene scene = new Scene(iHBox);
            Scene scene = new Scene(gridPane);
            // Insets(double topRightBottomLeft)
            // iHBox.setMargin(iLable, new Insets(20, 20, 20, 20));
            // iHBox.setMargin(iTextField, new Insets(20, 20, 20, 20));
            // iHBox.setMargin(iButton, new Insets(20, 20, 20, 20));
            iButton.setOnAction(e -> {
                PatientRecord pR = new PatientRecord();
                //Add patient to the Record
                pR.insertPatient(iTextFieldName.toString(),iTextFieldDoB.toString());
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
