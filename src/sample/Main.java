package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Controller c = new Controller();
        Currency Yen = new Currency("Yen(¥)", 124.00);
        Currency USD = new Currency("US Dollar($)", 1.18);
        c.setCbox(Yen);
        c.setCbox(USD);
        primaryStage.setTitle("Currency Converter");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
