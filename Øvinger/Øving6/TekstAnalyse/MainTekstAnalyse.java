import java.util.Scanner;

public class MainTekstAnalyse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Skriv in en tekst som du vil analysere: ");
        String userTest = scanner.nextLine();
        TekstAnalyse tekst = new TekstAnalyse(userTest);

        tekst.runCore();

        while (true){
            System.out.println("Hvordan vil du analysere teksten din? ");
            System.out.println("0. Avslutt programmet");
            System.out.println("1. Finn antall forksjellige bokstaver ");
            System.out.println("2. Finn totalt antall bokstaver i teksten");
            System.out.println("3. Finn prosent ikke bokstaver");
            System.out.println("4. finn antall forekomster av bestemt bokstav");
            System.out.println("5. Finn bokstav(er) forekommer oftest");
            int analysis = scanner.nextInt();


            if (analysis == 0){
                System.out.println("Avslutter programmet.");
                break;
            }
            String bokstav;

            switch (analysis) {
                case 1:
                    tekst.getList();
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println(tekst.totalAntallBokstaver());
                    tekst.setToZeroCharacterer();
                    System.out.println("-------------------------------------");
                    break;
                case 3:
                    System.out.println(tekst.prosentIkkeBokstaver() + "%");
                    tekst.setToZeroCharacterer();
                    System.out.println("-------------------------------------");
                    break;
                case 4:
                    System.out.print("Hvilken bokstav vil du sjekke? ");
                    bokstav = scanner.next();
                    System.out.println(tekst.antallBestemtBokstav(bokstav.charAt(0)));
                    System.out.println("-------------------------------------");
                    break;
                case 5:
                    tekst.mestForekommer();
                    System.out.println("-------------------------------------");
                    break;
                default:
                    System.out.println("Error: Feil valg. Velg et tall mellom 0 og 5");
                    System.out.println("-------------------------------------");
                    continue;
            }
        }

        /*
        * 1. Finn antall forksjellige bokstaver -> getList()
        * 2. Finn totalt antall bokstaver i teksten -> totalAntallBokstaver()
        * 3. Finn prosent ikke bokstaver -> prosentIkkeBokstaver()
        * 4. finn antall forekomster av bestemt bokstav -> antallBestemtBokstav()
        * 5. Finn bokstav(er) forekommer oftest -> mestForekommer()
        * */
    }


}
