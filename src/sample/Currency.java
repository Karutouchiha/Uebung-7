package sample;

public class Currency {
    String sing;
    double value;

    public Currency(String sing, double value) {
        this.sing = sing;
        this.value = value;
    }

    public String getSing() {
        return sing;
    }
    public double getValue() {
        return value;
    }
}
