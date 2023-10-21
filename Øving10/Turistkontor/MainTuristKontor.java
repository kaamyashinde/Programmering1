import java.util.*;
public class MainTuristKontor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrangementRegister register = new ArrangementRegister();


        while(true){
            System.out.println("""
                    -----------------------------------------------
                    Hva har du lyst til å gjøre?
                    1. Registrer et nytt arrangement
                    2. Skriv ut alle arrangementer
                    3. Sorter alle arrangementer etter sted, type og tid
                    4. Skriv ut arrangementer mellom to datoer
                    5. Skriv ut arrangementer på et bestemt dato
                    6. Skriv ut arrangementer på et bestemt sted
                    7. Avslutt programmet
                    """);
            int choice = getIntInput(input);
            if (choice == 7){
                System.out.println("programmet avsluttes");
                break;
            }
            switch (choice){
                case 1 -> {
                    System.out.println("Hva er navnet på arrangementet?");
                    String name = input.next();
                    System.out.println("Hvor skal arrangementet være?");
                    String place = input.next();
                    System.out.println("Hvem er ansvarlig for arrangementet?");
                    String responsible = input.next();
                    System.out.println("Hva slags type arrangement er det?");
                    String type = input.next();
                    System.out.println("Hva er datoen og tiden for arrangementet? (YYYYMMDDHHMM)");
                    long time = input.nextLong();
                    register.registerArrangement(name, place, responsible, type, time);
                }
                case 2 -> register.returnAllArrangements();
                case 3 -> {
                    System.out.println("""
                            Hva vil du sorter etter?
                            1. Sted
                            2. Type
                            3. Tid
                            """);
                    int valg = getIntInput(input);
                    if (valg == 1){
                        System.out.println(register.sortByPlace());
                    } else if (valg == 2){
                        System.out.println(register.sortByType());
                    } else if (valg ==3){
                        System.out.println(register.sortByTime());
                    } else {
                        System.out.println("Du må velge et tall mellom 1 og 3");
                        continue;
                    }
                }
                case 4 -> {
                    System.out.println("Hva er den første datoen? (YYYYMMDD)");
                    long dato1 = getLongInput(input);
                    System.out.println("Hva er den andre datoen? (YYYYMMDD)");
                    long dato2 = getLongInput(input);
                    if (dato2 <= dato1){
                        System.out.println("Den andre datoen må være større enn den første. Prøv igjen");
                        continue;
                    } else {
                        System.out.println(register.listBetweenDates(dato1, dato2));
                    }
                }
                case 5 -> {
                    System.out.println("Hva er datoen? (YYYY.MM.DD)");
                    String dato = input.next();
                    System.out.println(register.arrAtTime(dato));
                }
                case 6 -> {
                    System.out.println("Hvilket sted vil du sjekke for?");
                    input.nextLine(); // Consume the invalid input
                    String place = input.nextLine();
                    System.out.println( register.arrAtPlace(place));
                }
                default -> {
                    System.out.println("Error: Feil valg. Vennligst valg et tall mellom 1 og 6");
                    continue;
                }
            }
        }


    }

    // Methods for getting input from the user
    private static int getIntInput(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et heltall.");
                input.nextLine(); // Consume the invalid input
            }
        }
    }
    private static long getLongInput(Scanner input) {
        while (true) {
            try {
                return input.nextLong();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et heltall.");
                input.nextLine(); // Consume the invalid input
            }
        }
    }

}
