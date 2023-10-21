import java.util.*;
public class MainOversikt {
    public static void main(String[] args) {
        OppgaveOversikt oversikt = new OppgaveOversikt();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
                ------------------------------------------------------------
                Velkommen til Oppgave Oversikt. Hva har du lyst til å gjøre?
                1. Student oversikt
                2. Legg til ny student
                3. Endre antall oppgaver for en student
                4. Sjekke antall oppgaver for bestemt student
                5. Avslutt
                """);
            int valg = input.nextInt();
            if (valg == 5) {
                System.out.println("Programmet avsluttes. Ha en fin dag!");
                break;
            }
            switch (valg) {
                case 1 -> System.out.println(oversikt.toString());
                case 2 -> {
                    System.out.println("Hva heter studenten?");
                    String navn = input.next();
                    int k = -1;
                    for (int i = 0; i < oversikt.getAntStud(); i++){
                        if (navn.equals(oversikt.getStudentFornavn(i))){
                            k = i;
                        }
                    }
                    if (k == -1){
                        System.out.println("Hvor mange oppgaver har studenten levert inn?");
                        int ant = input.nextInt();
                        oversikt.nyStudent(navn, ant);
                        System.out.println(navn + " har blitt lagt inn i systemet");
                    } else System.out.println("Studenten finnes allerede");
                }
                case 3 -> {
                    System.out.println("Hva heter studenten?");
                    String navn = input.next();
                    int k = -1;
                    for (int i = 0; i < oversikt.getAntStud(); i++){
                        if (navn.equals(oversikt.getStudentFornavn(i))){
                            k = i;
                        }
                    }

                    if (k != -1){
                        System.out.println("Hvor mange oppgaver har studenten levert inn?");
                        int ant = input.nextInt();
                        oversikt.økAntOppgStud(navn, ant, k);
                        System.out.println(navn + " har nå " + ant + " oppgaver godkjent");
                    } else {
                        System.out.println("Studenten finnes ikke");
                    }

                }
                case 4 -> {
                    System.out.println("Hva heter studenten?");
                    String navn = input.next();
                    System.out.println(oversikt.getAntOppStud(navn));
                }
                default -> {
                    System.out.println("Feil input. Prøv igjen");
                    continue;
                }
            }
        }


    }
}
