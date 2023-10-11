public class TotalSeconds {
    public static void main(String[] args) {

        /*
         * Skriv et program som regner om timer, minutter og sekunder til totalt antall
         * sekunder.
         * Sett opp testdatasett og prøv ut programmet.
         */

        int timer = 1;
        int minutter = 1;
        int sekunder = 1;

        int timerTilSekunder = timer * 3600;
        int minutterTilSekunder = minutter * 60;
        int totalSekunder = timerTilSekunder + minutterTilSekunder + sekunder;

        System.out.println(timer + " timer " + minutter + " minutter og " + sekunder + " sekunder er " + totalSekunder
                + " sekunder.");

    }
}