public class Student {

    private String navn;
    private int antOppg; //skall holde antall oppgaver levert inn (som er godkjent)

    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn(){
        return navn;
    }

    public int getAntOppg(){
        return antOppg;
    }
    public void øktAntOppg(int nyAntOppg){
        antOppg = nyAntOppg;
    }

    @Override
    public String toString() {
        return "[Navn -> " + this.getNavn() + ", Antall Oppgaver -> " + this.getAntOppg() + "]";
    }

    /*
     * Oppgave 1
     * Lag en klasse Student. Den skal ha to objektvariabler:
     * private String navn; // entydig(!)
     * private int antOppg;
     * antOppg holder orden på hvor mange av de oppgavene studenten har levert inn, som er
     * godkjent. Klassen skal tilby følgende operasjoner:
     * 1. public String getNAvn()
     * 2. public int getAntOppg()
     * 3. public void økAntOppg(int økning)
     * 4. public String toString()
     * Lag et enkelt testprogram for klassen.
     */

}
