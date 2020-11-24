package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {

    @FXML private TextField txt_Euro;
    @FXML private TextField txt_Yen;
    @FXML private Text txt_error;
    @FXML private ChoiceBox cbox;

    public void setCbox(ChoiceBox cbox) {
        this.cbox = cbox;
    }

    @FXML
    public void convert(){
        CurrencyConvert cu = new CurrencyConvert();
        System.out.print(cbox.getItems());
        try {
            txt_error.setVisible(false);
            txt_Yen.setText(String.valueOf(cu.toWährung(Double.parseDouble(txt_Euro.getText()),Integer.parseInt(cbox.getValue().toString()))));
        }
        catch (Exception ex){
            try {
                txt_Euro.setText(String.valueOf(cu.toEuro(Double.parseDouble(txt_Yen.getText()))));
            }
            catch (Exception e){
                txt_error.setVisible(true);
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }
}
