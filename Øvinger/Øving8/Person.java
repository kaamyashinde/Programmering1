public class Person {
    final private String fornavn;
    final private String etternavn;
    final private int birthYear;

    public Person(String fornavn, String etternavn, int birthYear){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.birthYear = birthYear;
    }

    public String getFornavn(){
        return fornavn;
    }
    public String getEtternavn(){
        return etternavn;
    }
    public int getBirthYear(){
        return birthYear;
    }
}
