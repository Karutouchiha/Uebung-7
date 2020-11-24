package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Controller c = new Controller();
        ChoiceBox<Currency> choiceBox = new ChoiceBox();
        Currency Yen = new Currency("Yen(¥)",124);
        Currency USD = new Currency("US-Dollar($)",1.28);
        c.setAl(Yen);
        c.setAl(USD);
        choiceBox.getItems().addAll(Yen,USD);
        choiceBox.getSelectionModel().select(Yen);
        c.setCbox(choiceBox);
        primaryStage.setTitle("Currency Converter");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
