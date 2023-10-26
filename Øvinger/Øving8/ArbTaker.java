import java.util.Scanner;
public class ArbTaker {
    Person personalia;
    private int arbtakernr;
    private int ansattelsesår;
    private double månedslønn;
    private double skatteprosent;

    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int år = kalender.get(java.util.Calendar.YEAR);

    public ArbTaker(Person personalia, int arbtakernr, int ansattelsesår, double månedslønn, double skatteprosent){
        this.personalia = personalia;
        this.arbtakernr = arbtakernr;
        this.ansattelsesår = ansattelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    //set-metodene
    public void setMånedslønn(double månedslønn){
        this.månedslønn = månedslønn;
    }
    public void setSkatteprosent(double skatteprosent){
        this.skatteprosent = skatteprosent;
    }
    public void setAnsattelsesår(int ansattelsesår){
        this.ansattelsesår = ansattelsesår;
    }

    //get-metodene
    public Person getPersonalia(){
        return personalia;
    }
    public int getArbtakernr(){
        return arbtakernr;
    }
    public int getAnsattelsesår(){
        return ansattelsesår;
    }
    public double getMånedslønn(){
        return månedslønn;
    }
    public double getSkatteprosent(){
        return skatteprosent;
    }


    //metodene

    public double skattetrekkPerMåned(){
        return månedslønn * skatteprosent / 100;
    }
    public double bruttolønnPerÅr(){
        return månedslønn * 12;
    }
    public double skattetrekk(){
        //juni er skattefri (-1) + desember er halv skatt (-0.5) så til slutt 12 - 1.5 = 10.5
        return 10.5 * månedslønn * skatteprosent / 100;
    }
    public String fullNavn(){
        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }
    public int alder(){
        return år - personalia.getBirthYear();
    }
    public int antallÅrIBedriften(){
        return år - ansattelsesår;
    }
    public boolean sammenlignAnsattelseår(int år){
        boolean result = false;
        if (år - ansattelsesår > år){
            result = true;
        }
        return result;
    }

    //all-in-one metoder
    public void endre(){
        Scanner input = new Scanner(System.in);

        System.out.println("""
                
                Hva vil du endre?
                1. Månedslønn
                2. Skatteprosent
                3. Asnattelsesår
                """);
        int choice1 = getIntInput(input);
        switch (choice1) {
            case 1 -> {
                System.out.println("ny månedslønn: ");
                double nyMånedsLønn = getDoubleInput(input);
                this.setMånedslønn(nyMånedsLønn);
                System.out.println("Du har endret månedslønn til " + nyMånedsLønn);
            }
            case 2 -> {
                System.out.println("ny skatteprosent: ");
                double nySkatteprosent = getDoubleInput(input);
                this.setSkatteprosent(nySkatteprosent);
                System.out.println("Du har endret skatteprosent til " + nySkatteprosent);
            }
            case 3 -> {
                System.out.println("nytt ansattelsesår: ");
                int nyttAnsattelsesår = getIntInput(input);
                this.setAnsattelsesår(nyttAnsattelsesår);
                System.out.println("Du har endret ansattelsesår til " + nyttAnsattelsesår);
            }
            default -> {
                System.out.println("Error: Feil input. Vennligst prøv igjen med et gyldig tall");
                this.endre();
            }
        }
    }

    public void infoLønnSkatt(){
        System.out.println("kroner trekkes i skatt per måned: " + this.skattetrekkPerMåned());
        System.out.println("bruttolønn per år: " + this.bruttolønnPerÅr());
        System.out.println("skattetrekk per år: " + this.skattetrekk());

    }

    public void dinSide(){
        Scanner input = new Scanner(System.in);
        System.out.println("ArbTaker nummer: " + this.getArbtakernr());
        System.out.println("fullt navn: " + this.fullNavn());
        System.out.println("alder: " + this.alder());
        System.out.println("Ansattelsesår: " + this.getAnsattelsesår());
        System.out.println("antall år i bedriften: " + this.antallÅrIBedriften());
        System.out.println("Hvor mange år vil du sjekke om du har vært ansatt lenger enn?");
        int år = getIntInput(input);
        System.out.println("har du vært ansatt lenger enn " + år + " år? " + this.sammenlignAnsattelseår(år));
        
    }

    private static int getIntInput(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et heltall.");
                input.nextLine(); // Consume the invalid input
            }
        }
    }
    private static double getDoubleInput(Scanner in) {
        while(true) {
            try {
                return in.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Du må skrive inn et tall");
                in.nextLine(); // Consume the invalid input
            }
        }
    }







}
