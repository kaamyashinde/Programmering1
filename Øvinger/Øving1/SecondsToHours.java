
public class SecondsToHours {
    public static void main(String[] args) {
        int totalSekunder = 3661;

        int timer = totalSekunder / 3600;
        int remainingSeconds = totalSekunder % 3600;
        int minutter = remainingSeconds / 60;
        int sekunder = remainingSeconds % 60;

        System.out.println(totalSekunder + " sekunder er " + timer + " timer " + minutter + " minutter og " + sekunder
                + " sekunder");

    }
}