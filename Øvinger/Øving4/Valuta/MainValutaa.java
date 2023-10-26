import java.util.Scanner;

public class MainValutaa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a value to convert (or any character to exit the program) ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Program successfully exited");
                break;
            }

            double input = scanner.nextDouble();

            System.out.print("Convert 'from NOK' or 'to NOK'? Press 0 and 1 respectively ");
            int toAndFrom = scanner.nextInt();

            if (toAndFrom != 0 && toAndFrom != 1) {
                System.out.print("Error: Chosen number does not correspond to an option ");
                break;
            }

            System.out.print("Which currency? 1. Dollar, 2. Euro, 3. Swedish Kroner, 4. Stop program ");
            int currency = scanner.nextInt();

            Valutaa valuta;

            switch (currency) {
                case 1 -> valuta = new Valutaa(input, currency, 0.094, "USD");
                case 2 -> valuta = new Valutaa(input, currency, 0.087, "EUR");
                case 3 -> valuta = new Valutaa(input, currency, 1.04, "SEK");
                default -> {
                    System.out.println("Error: Invalid currency chosen");
                    continue;
                }
            }

            if (toAndFrom == 0) {
                System.out.println(input + " NOK is approximately " + valuta.FraKroner() + " " + valuta.currencyCode );
            } else
                System.out.println(input + " " + valuta.currencyCode + " is approximately " + valuta.FraKroner() + " NOK");
        }

    }
}
