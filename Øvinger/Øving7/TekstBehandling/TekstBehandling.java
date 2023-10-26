package O2;

public class TekstBehandling {
    private String userInput;
    private String arrayOrd[];

    public TekstBehandling(String userInput){
       this.userInput = userInput;
        arrayOrd = userInput.split("\\s");
    }


    //metoder:
    public int getAntallOrd(){ //antall ord
        return arrayOrd.length;
    }

    public int getAvgOrdlengde(){ //gjennomsnit ordlengde
        return this.userInput.length() / arrayOrd.length;
    }

    public int getAvgOrdPerPeriode(){ //gjennomsnitt ord per period
        String arrayMedPeriod[] = this.userInput.split("[.!,?]");
        return arrayOrd.length / arrayMedPeriod.length;
    }

    public void getByttetOrd(String bytte, String bytteMed){ //bytte et ord med annet
       String arrayMedByttetOrd[] = new String[arrayOrd.length];

       for (int i = 0; i < arrayOrd.length; i++){ //lag en kopi av original string array
           arrayMedByttetOrd[i] = arrayOrd[i];
       }

        for (int i = 0; i < arrayOrd.length; i++){ //bytt ordene
            if (arrayOrd[i].equals(bytte) ){
                arrayMedByttetOrd[i] = bytteMed;
            } else if (bytte.equals(arrayOrd[i].substring(0, arrayOrd[i].length() - 1))){
                arrayMedByttetOrd[i] = bytteMed + arrayOrd[i].charAt(arrayOrd[i].length()-1);

            }
        }

        for (int i = 0; i < arrayMedByttetOrd.length; i++){ //printe tekst med endret ord
            System.out.print(arrayMedByttetOrd[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public void getTeksten(){ //print original teksten
        for (int i = 0; i < arrayOrd.length; i++){
            System.out.print(arrayOrd[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public String getStoreBokstaver(){ //print original teksten i store bokstaver
        return this.userInput.toUpperCase();
    }

}
