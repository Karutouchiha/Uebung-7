package sample;

public class CurrencyConvert {
    private int toConvert;
    //1Euro = 124Yen

    public double toEuro(double Yen) {
        double Euro;
        Euro = Yen / 124;
        return Euro;

    }

    public double toYen(double Euro){
        double Yen;
        Yen = Euro * 124;
        return Yen;
    }
}
