package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller c = new Controller();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        ChoiceBox<String> choiceBox = new ChoiceBox();
        choiceBox.setItems(FXCollections.observableArrayList("Yen(¥)","US-Dollar($)"));
        choiceBox.setValue("Yen(¥)");
        c.setCbox(choiceBox);
        primaryStage.setTitle("Currency Converter");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
