import java.util.Scanner;
import java.lang.Math;

public class Valuta {
    double input;
    int currency;
    double rate;
    double amount;

    public Valuta(double input, int currency, double rate) {
       this.input = input;
       this.currency = currency;
       this.rate = rate;
    }
    public double FraKroner(double fraKroner, double rate) {
        fraKroner = input * rate;
        return Math.round(fraKroner);
    }
    public double TilKroner(double tilKroner, double rate) {
        tilKroner = input / rate;
        return Math.round(tilKroner);
    }

    //--------
    public static void main(String[] args) {
        Scanner userEnteredAmount = new Scanner(System.in);
        Scanner conversionDecider = new Scanner(System.in);
        Scanner typeCurrency = new Scanner(System.in);


        while(true) {
            System.out.print("Enter a value ");
            double input = userEnteredAmount.nextDouble();

            System.out.print("Convert 'from NOK' or 'to NOK'? Press 0 and 1 respectively ");
            int toOrFrom = conversionDecider.nextInt();

            System.out.print("Which currency? 1. Dollar, 2. Euro, 3. Swedish Kroner, 4. Stop program ");
            int currency = typeCurrency.nextInt();

            Valuta dollar = new Valuta(input, currency, 0.094 );
            Valuta euro = new Valuta(input, currency, 0.087);


            if (toOrFrom == 0) {
                System.out.println("You want to convert from NOK.");
            } else if (toOrFrom == 1) {
                System.out.println("You want to convert to NOK");
            } else if (toOrFrom != 0 && toOrFrom != 1){
                break;
            }
            Valuta svenskeKroner = new Valuta(input, currency, 1.04);
            if (currency == 1) {
                if (toOrFrom == 0) {
                    System.out.println(dollar.FraKroner(dollar.amount, 0.094));
                } else if (toOrFrom == 1){
                    System.out.println(dollar.TilKroner(dollar.amount, 0.094));
                } else {
                    System.out.println("Error: Chosen number does not correspond to an option");
                }
            } else if (currency == 2) {
                if (toOrFrom == 0) {
                    System.out.println(euro.FraKroner(euro.amount, 0.087));
                } else if (toOrFrom == 1){
                    System.out.println(euro.TilKroner(euro.amount, 0.087));
                } else {
                    System.out.println("Error: Chosen number does not correspond to an option");
                }
            } else if (currency == 3) {
                if (toOrFrom == 0) {
                    System.out.println(svenskeKroner.FraKroner(svenskeKroner.amount, 1.04));
                } else if (toOrFrom == 1){
                    System.out.println(svenskeKroner.TilKroner(svenskeKroner.amount, 1.04));
                } else {
                    System.out.println("Error: Chosen number does not correspond to an option");
                }
            } else if (currency >= 4 || currency < 1) {
                System.out.println("program stopped");
                break;
            }




        }
        userEnteredAmount.next();
        conversionDecider.next();
        typeCurrency.next();

        userEnteredAmount.close();
        conversionDecider.close();
        typeCurrency.close();
    }


    //1 - dollar
    // 2- euro
    //3 - svenske kroner
}
