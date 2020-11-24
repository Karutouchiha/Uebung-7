package sample;

import java.util.ArrayList;

public class CurrencyConvert {
    private int toConvert;
    private ArrayList al = new ArrayList();
    //1Euro = 124Yen

    public double toEuro(double Yen) {
        double Euro;
        Euro = Yen / 124;
        return Euro;

    }

    public double toWährung(double Euro, int index) {
        double w;
        w = Euro * Double.parseDouble(al.get(index).toString());
        return w;
    }
}
