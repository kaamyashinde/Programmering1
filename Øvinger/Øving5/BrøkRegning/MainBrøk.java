public class MainBrøk {
    public static void main(String[] args) {
        //since i use throw in the constructor, i need to use try/catch
        BrøkRegning brøk1;
        BrøkRegning brøk2 = new BrøkRegning(7);
        try {
            brøk1 = new BrøkRegning( 1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            brøk1 = new BrøkRegning(1, 1);
        }


        System.out.println(brøk1);
        System.out.println(brøk2);

        brøk1.sumere(brøk2);
        System.out.println(brøk1);

        brøk1.subtrahere(brøk2);
        System.out.println(brøk1);

        brøk1.multiplisere(brøk2);
        System.out.println(brøk1);

        brøk1.dividere(brøk2);
        System.out.println(brøk1);



    }
}
