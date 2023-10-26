package O2;

public class Main {
    public static void main(String[] args) {
        //TekstBehandling text = new TekstBehandling("ah! ah! ah! ah!");
        TekstBehandling text = new TekstBehandling("hii i'm kaamya! nice to meet you. what's your name?");

        System.out.println("Total antall ord i teksten er " + text.getAntallOrd());
        System.out.println("Gjenomsnitt ordlendge er " + text.getAvgOrdlengde());
        System.out.println("Gjennomsnit antall ord per period er " + text.getAvgOrdPerPeriode());
        text.getByttetOrd("name", "age");
        text.getTeksten();
        System.out.println(text.getStoreBokstaver());
    }
}
