package O1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        NyString str = new NyString("hello i am kaamya.");

        System.out.println("Teksten forkotet er: ");
        str.getForkortning();
        System.out.println("Teksten med en bokstav tatt vekk er: ");
        str.getFjernet("e");
    }
}
