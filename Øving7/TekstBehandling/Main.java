package O2;

public class Main {
    public static void main(String[] args) {
        TekstBehandling text = new TekstBehandling("ah! ah! ah! ah!");
        System.out.println("Total antall ord i teksten er " + text.getAntallOrd());
        System.out.println("Gjenomsnitt ordlendge er " + text.getAvgOrdlengde());
        System.out.println("Gjennomsnit antall ord per period er " + text.getAvgOrdPerPeriode());
        text.getByttetOrd("ah", "boo");
        text.getTeksten();
        System.out.println(text.getStoreBokstaver());
    }
}
