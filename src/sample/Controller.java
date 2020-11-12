package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class Controller {

    @FXML private Button b_convert;
    @FXML private TextField txt_Euro;
    @FXML private TextField txt_Yen;
    @FXML private TextField txt_error;

    @FXML
    public void convert(){
        CurrencyConvert cu = new CurrencyConvert();
        try {
            txt_Euro.setText(cu.toEuro(Double.parseDouble(txt_Yen.getText())).toString());
        }
        catch (Exception ex){
            try {
                txt_Yen.setText(cu.toYen(Double.parseDouble(txt_Euro.getText())).toString());
            }
            catch (Exception e){
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }
}
