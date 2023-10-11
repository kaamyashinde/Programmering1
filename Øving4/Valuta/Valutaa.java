import java.util.Scanner;
import java.lang.Math;

public class Valutaa{
    double input;
    int currency;
    double rate;
    double amount;
    String currencyCode;

    //klasse
    public Valutaa(double input, int currency, double rate, String currencyCode) {
        this.input = input;
        this.currency = currency;
        this.rate = rate;
        this.currencyCode = currencyCode;
    }
    public double FraKroner() {
        amount = input * rate;
        return Math.round(amount);
    }
    public double TilKroner() {
        amount = input / rate;
        return Math.round(amount);
    }

    //--------



    //1 - dollar
    // 2- euro
    //3 - svenske kroner
}
