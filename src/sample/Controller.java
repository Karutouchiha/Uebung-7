package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class Controller {

    @FXML private TextField txt_Euro;
    @FXML private TextField txt_Yen;
    @FXML private Text txt_error;
    @FXML private ChoiceBox<Currency> cbox;

    @FXML public void setCbox (Currency c) {
        try{
        cbox.getItems().add(c);}
        catch(Exception e){
            cbox.setItems(FXCollections.observableArrayList(c));
        }
    }

    @FXML
    public void convert(){
        CurrencyConvert cu = new CurrencyConvert();
        System.out.print(cbox.getItems());
        try {
            txt_error.setVisible(false);
            //txt_Yen.setText();
        }
        catch (Exception ex){
            try {
               //txt_Euro.setText();
            }
            catch (Exception e){
                txt_error.setVisible(true);
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }
}
