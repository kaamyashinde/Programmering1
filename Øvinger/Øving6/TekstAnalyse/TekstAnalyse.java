import java.sql.PreparedStatement;

public class TekstAnalyse {
    String tekst;
    //skal inneholde antall av de forskjellige tegn:
    int[] antallTegn = new int[30];
    //liste av de forskjellige bokstaver:
    char[] allCharacters = new char[29];
    int sumAntallCharacterer = 0; //alphabets + non-alphabets
    int sumAntallBokstaver = 0; //alphabets only
    int sumAntallTegn = 0; //non-alphabets only
    //constructor
    public TekstAnalyse(String tekst){
        this.tekst = tekst.toLowerCase();
    }
    //set-methods:
    public void setAlphabetsList(){ //create the list of alphabets
        for (char alph = 'a'; alph <= 'z'; alph++){
           allCharacters[alph-'a'] = alph;
        }
        //add the norwegian alphabets:
        allCharacters[26] = 'æ';
        allCharacters[27] = 'ø';
        allCharacters[28] = 'å';
        //System.out.println(allCharacters);
    }
    public void setList(){
        //finn antall tegn
        for (int i = 0; i < allCharacters.length; i++){
            int count = 0;
            for (int j = 0; j < tekst.length(); j++){
                if (tekst.charAt(j) == allCharacters[i]){
                    count++;
                }
                antallTegn[i] = count;
            }
        }
        //bytt alle bokstaver til a til å hjelpe med telling av ikke-bokstaver
        for (int i = 0; i < allCharacters.length; i++){
            String a = "a";
            for (int j = 0; j < tekst.length(); j++){
                if (allCharacters[i] == tekst.charAt(j)){
                    //reasssign the value of all characters to "a" avoid counting it again ----> helps in identifying the non-alphabetic characters:
                    tekst = tekst.replace(tekst.charAt(j), a.charAt(0));
                }
            }
        }
        //count the non-alphabetic characters:
        for (int k = 0; k < tekst.length(); k++){
            if ('a' != tekst.charAt(k)){
                antallTegn[29]+=1;
            }
        }
    }

    public void setToZeroCharacterer(){
        sumAntallCharacterer = 0;
    }

    //get-methods:

    public int totalAntallCharacterer(){ //alphabets and non-alphabets
        for (int l = 0; l < antallTegn.length; l++){ //antallTegn.length - 1 fordi vil ikke telle ikke-bokstaver tegner
            sumAntallCharacterer += antallTegn[l];
        }
       return sumAntallCharacterer;
    }

    public int totalAntallTegner(){ //non-alphabets
        sumAntallTegn = antallTegn[29];
        return sumAntallTegn;
    }
    public void getList(){ //get the frequency list
        for (int k = 0; k < antallTegn.length - 1; k++){
            System.out.println("Bokstav: " + allCharacters[k] + " -> Forekomster: " + antallTegn[k]);
        }
        //System.out.println("Character:   -> Frequency: " + antallTegn[29]);
    }
    public int totalAntallBokstaver(){ //alphabets
        sumAntallBokstaver = this.totalAntallCharacterer() - this.totalAntallTegner();
        return sumAntallBokstaver;
    }
    public double prosentIkkeBokstaver(){
        double result = 0;
        if (this.totalAntallTegner() == 0){
            result = 0;
        } else {
            result = this.totalAntallCharacterer() / this.totalAntallTegner();
            result = Math.pow(result, -1)*100;
        }

        return Math.round(result);
    }
    public int antallBestemtBokstav(char character){
        int result = 0;
         for (int m = 0; m < allCharacters.length; m++){
             if (character == allCharacters[m]){
                 result = antallTegn[m];
             }
         }
        return result;
    }
    public void   mestForekommer(){
        //find the most frequent character(s):
        int max = antallTegn[0];
        for (int n = 0; n < antallTegn.length; n++){
            if (antallTegn[n] > max){
                max = antallTegn[n];
            }
        }
        //print the most frequent character(s):
        for (int o = 0; o < antallTegn.length; o++){
            if (antallTegn[o] == max){
                System.out.println("Bokstav: " + allCharacters[o] + " -> Forekomst: " + antallTegn[o]);
            }
        }

    }

    //run all methods:
    public void runCore(){
        this.setAlphabetsList();
        this.setList();

    }
}
