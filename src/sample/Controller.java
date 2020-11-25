package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;


public class Controller {

    @FXML private TextField txt_Euro;
    @FXML private TextField txt_Yen;
    @FXML private Text txt_error;
    @FXML private ChoiceBox cbox;

    @FXML public void setCbox (ChoiceBox cbox) {
        this.cbox = cbox;
    }

    @FXML
    public void convert(){
        CurrencyConvert cu = new CurrencyConvert();
        System.out.print(cbox.getItems());
        try {
            txt_error.setVisible(false);
            txt_Yen.setText();
        }
        catch (Exception ex){
            try {
                txt_Euro.setText();
            }
            catch (Exception e){
                txt_error.setVisible(true);
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }
}
