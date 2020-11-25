package sample;

import java.util.ArrayList;

public class CurrencyConvert {
    //1Euro = 124Yen

    public double toEuro(Currency currency, double value) {
        return value / currency.getValue();

    }

    public double toWährung(Currency currency, double value) {

        return value / currency.getValue();
    }
}
