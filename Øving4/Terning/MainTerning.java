public class MainTerning {
    public static void main(String[] args) {
        TerningSpill spillerA = new TerningSpill(0);
        TerningSpill spillerB = new TerningSpill(0);

        while (spillerA.erFerdig() && spillerB.erFerdig()){
            spillerA.spill();
            spillerB.spill();
            if (spillerA.getSumPoeng() > spillerB.getSumPoeng()) {
                System.out.println("player A wins with " + spillerA.getSumPoeng() + " and after " + spillerA.getRounds() + " rounds.");
            } else {
                System.out.println("player B wins with " + spillerB.getSumPoeng() + " and after " + spillerB.getRounds() + " rounds.");
            }
        }
    }
}
