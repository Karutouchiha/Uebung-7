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
    private ArrayList<Currency> al = new ArrayList();

    @FXML public void setCbox (ChoiceBox cbox) {
        this.cbox = cbox;
    }

    @FXML
    public void convert(){
        CurrencyConvert cu = new CurrencyConvert();
        System.out.print(cbox.getItems());
        try {
            txt_error.setVisible(false);
            txt_Yen.setText(String.valueOf(cu.toWährung(al.get(Integer.getInteger(cbox.getValue().toString())),Integer.parseInt(txt_Euro.getText()))));
        }
        catch (Exception ex){
            try {
                txt_Euro.setText(String.valueOf(cu.toEuro(al.get(Integer.getInteger(cbox.getValue().toString())),Integer.parseInt(txt_Yen.getText()))));
            }
            catch (Exception e){
                txt_error.setVisible(true);
                txt_error.setText("Es ist ein Fehler beim Convertieren aufgetreten.");
            }
        }
    }

    public void setAl(Currency currency) {
        al.add(currency);
    }
}
