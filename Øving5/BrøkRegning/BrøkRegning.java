public class BrøkRegning {

    private int teller;
    private int nevner;


    public BrøkRegning(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være 0. ");
        } else {
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    public BrøkRegning(int teller) {
        this.teller = teller;
        this.nevner = 1;

    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void sumere(BrøkRegning brøk) {
        teller = teller * brøk.getNevner() + brøk.getTeller() * nevner;
        nevner = nevner * brøk.getNevner();
    }

    public void subtrahere(BrøkRegning brøk) {
        teller = teller * brøk.getNevner() - brøk.getTeller() * nevner;
        nevner = nevner * brøk.getNevner();
    }

    public void multiplisere(BrøkRegning brøk) {
        teller = teller * brøk.getTeller();
        nevner = nevner * brøk.getNevner();
    }

    public void dividere(BrøkRegning brøk) {
        teller = teller * brøk.getNevner();
        nevner = nevner * brøk.getTeller();
    }

    @Override
    public String toString() {
        return teller + "/" + nevner;
    }
    //When you print an object without a toString() method, Java uses the default implementation from the Object class, which displays the class name and a hash code representation of the object (e.g., BrøkRegning@a09ee92).




}

/*
 *to konstruktør
 *   1. tar teller og nevner som argument. if nevn = 0, unntaksobjekt av typen IllegalArgumentException throw
 *       så bruk try and catch and trow greie
 *   2. tar telleren. nevneren = 1
 *
 * -> bør ha get-metoder men ikke set-metoder
 *   - sumere
 *   - subtrahere
 *   - multiplisere
 *   - dividere
 *
 *   en brøk (this) med en annen brøk (parameter)
 *
 * ingen returverdi - men resultatet ligger i this
 *
 */