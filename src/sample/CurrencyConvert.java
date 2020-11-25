package sample;

import java.util.ArrayList;

public class CurrencyConvert {
    final private ArrayList<Currency> currency = new ArrayList();
    //1Euro = 124Yen

    public void addCurrency(Currency currency){
        this.currency.add(currency);
    }

    public double toEuro(Currency currency, double value) {
        double Euro;
        Euro = value / currency.getValue();
        return Euro;

    }

    public double toWährung(String s, double v) {
        Currency c=searchDB(s);
        return v * c.getValue();
    }

    private Currency searchDB(String s)
    {
        for (Currency c:currency)
        {
            if (s.equals(c.getSing()))
                return c;
        }
        return null;
    }
}
