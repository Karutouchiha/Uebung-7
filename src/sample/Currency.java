package sample;

public class Currency {
    String sing;

    public Currency(String sing, double value) {
        this.sing = sing;
        this.value = value;
    }

    double value;

    public String getSing() {
        return sing;
    }
    public double getValue() {
        return value;
    }
}
