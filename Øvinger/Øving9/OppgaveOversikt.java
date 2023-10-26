import java.util.ArrayList;
public class OppgaveOversikt {



    private ArrayList<Student> studenter;
    private int antStud = 0; //økes med 1 for hver ny student

    public OppgaveOversikt(){
        studenter = new ArrayList<Student>();
    }

    //metodene:
    public int getAntStud(){
        return studenter.size();
    }
    public String getAntOppStud(String navn){
        boolean exists = false;
        int index = -1;
        for (int i = 0; i < this.getAntStud(); i++){
            if (navn.equals(studenter.get(i).getNavn())){
                exists = true;
                index = i;
            }
        }
        if (exists){
            return navn + " har " + studenter.get(index).getAntOppg() + " oppgaver godkjent";
        } else
            return "Studenten finnes ikke";
    }
    public String getStudentFornavn(int index){
        return studenter.get(index).getNavn();
    }


    public void nyStudent(String navn, int antOppg) {
        studenter.add(new Student(navn, antOppg));
    }

    public void økAntOppgStud(String navn, int nyAntOppg, int index){
        studenter.get(index).øktAntOppg(nyAntOppg);

    }


    @Override
    public String toString() {
        return "OppgaveOversikt: \n" +
                "Antall studenter: " + this.getAntStud() + "\n" +
                studenter.toString();
    }

    /*
    * Lag en klasse Oppgaveoversikt som holder orden på hvor mange oppgaver hver enkelt
     * student har fått godkjent. Denne klassen skal ha to objektvariabler:
     *
     * private int antStud = 0; // økes med 1 for hver ny student
     * Du skal lage metoder for følgende operasjoner (gjerne også flere, dersom du finner at det er
     * behov for det):
     * • Finn antall studenter registrert
     * • Finn antall oppgaver som en bestemt student har løst
     * • Registrer en ny student
     * • Øk antall oppgaver for en bestemt student.
     * I tillegg skal du lage toString()-metode
     * Lag et enkelt klientprogram.
     *
     *
     * */
}
