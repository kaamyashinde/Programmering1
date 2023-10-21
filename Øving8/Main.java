import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("fornavn: ");
        String fornavn = getStringInput(in);

        System.out.print("etternavn: ");
        String etternavn = getStringInput(in);

        System.out.print("fødselsår: ");
        int fødselsår = getIntInput(in);

        Person person1 = new Person(fornavn, etternavn, fødselsår);

        System.out.print("arbeidstakernr: ");
        int arbeidstakernr = getIntInput(in);

        System.out.print("ansattelsesår: ");
        int ansattelsesår = getIntInput(in);

        System.out.print("månedslønn: ");
        double månedslønn = getDoubleInput(in);

        System.out.print("skatteprosent: ");
        double skatteprosent = getDoubleInput(in);


        ArbTaker arbTaker1 = new ArbTaker(person1, arbeidstakernr, ansattelsesår, månedslønn, skatteprosent);

        while (true) {
            System.out.println("""
                    1. Endre månedslønn, skatteprosent eller ansattelsesår
                    2. Informasjon angående lønn og skatt
                    3. Din side
                    4. Avslutt programmet
                    """);
            int choice = getIntInput(in);
            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1 -> arbTaker1.endre();
                case 2 -> arbTaker1.infoLønnSkatt();
                case 3 -> arbTaker1.dinSide();
                default -> {
                    System.out.println("Error: Feil input");
                    continue;
                }
            }
        }
    }

    private static int getIntInput(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et heltall.");
                in.nextLine(); // Consume the invalid input
            }
        }
    }

    private static double getDoubleInput(Scanner in) {
        while(true) {
            try {
                return in.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et tall");
                in.nextLine(); // Consume the invalid input
            }
        }
    }

    private static String getStringInput(Scanner in) {
        while (true) {
            try {
                return in.next();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et heltall.");
                in.nextLine(); // Consume the invalid input
            }
        }
    }
}

