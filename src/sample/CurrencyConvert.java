package sample;

public class CurrencyConvert {
    //1Euro = 124Yen

    public double toEuro(Currency currency, double value) {
        double Euro;
        Euro = value / currency.getValue();
        return Euro;

    }

    public double toWährung(Currency currency, double value) {
        double w;
        w = value * currency.getValue();
        return w;
    }
}
