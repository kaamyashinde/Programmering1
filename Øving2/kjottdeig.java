/**
 * kjottdeig
 */
public class kjottdeig {

    public static void main(String[] args) {

        double merkeA = 35.90;
        double merkeB = 39.50;

        double prisPerGramA = merkeA / 450;
        double prisPerGramB = merkeB / 500;

        if (prisPerGramA > prisPerGramB) {
            System.out.println("Kjøttedeig av merke B er billigst");
        } else {
            System.out.println("Kjøttedeig av merke A er billigst");

        }

        /**
         * Kjøttdeig av merke A koster kr 35,90 for 450 gram,
         * mens kjøttdeig av merke B koster kr 39,50 for 500 gram.
         * Hvilket merke er billigst?
         */
    }
}