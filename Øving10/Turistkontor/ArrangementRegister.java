import java.util.*;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangments;


    public ArrangementRegister(){
        arrangments = new ArrayList<>();
    }


    //metodene:
    public void registerArrangement(String name, String place, String responsible, String type, double time){
        int num = arrangments.size() + 1;
        arrangments.add(new Arrangement(num, name, place, responsible, type, time));
    }
    public void returnAllArrangements(){
        if (arrangments.size() == 0){
            System.out.println("Det er ingen arrangementer i registeret");
        } else {
            for (int i = 0; i < arrangments.size(); i++){
                System.out.println(arrangments.get(i).toString());
            }
        }
    }

    public String arrAtPlace(String place){
        String result = "";
        int count = 0;
        for (int i = 0; i < arrangments.size(); i++){
            if (place.toLowerCase().equals(arrangments.get(i).getArrPlace().toLowerCase())){
                result =  arrangments.get(i).toString();
                count++;
            }
        }

        if (count == 0){
            result = "Det er ingen arrangementer på dette stedet";
        } else if (count > 1){
            result += "\nDet er " + count + " arrangementer på dette stedet";
        }

        return result;
    }

   public String arrAtTime(String date){
       String result = "";
       int count = 0;
       for (int i = 0; i < arrangments.size(); i++){
           String theDate = arrangments.get(i).getArrDate();
           if (date.equals(theDate)){
               result +=  arrangments.get(i).toString();
               count++;
           }
       }

       if (count == 0){
           result = "Det er ingen arrangementer på denne datoen";
       } else if (count > 1){
           result += "\nDet er " + count + " arrangementer på denne datoen";
       }
       return result;
   }

    public String listBetweenDates(double dato1, double dato2) {
        String result = "";
        int count = 0;
        ArrayList<Arrangement> dateArr = new ArrayList<Arrangement>();
        for (int i = 0; i < arrangments.size(); i++) {
            int arrangementDato = (int)Math.floor(arrangments.get(i).getArrTime() / 10000);
            if (arrangementDato >= (int)dato1 && arrangementDato <= (int)dato2) {
                dateArr.add(arrangments.get(i));
                count++;
            }
        }
        Comparator<Arrangement> sorterEtterTid = (Arrangement a1, Arrangement a2) -> {
            int time1 = (int)(a1.getArrTime() % 10000); // Extracts the time part (HHmm)
            int time2 = (int)(a2.getArrTime() % 10000); // Extracts the time part (HHmm)
            return time1 - time2; // Compare the time parts for sorting
        };

        Collections.sort(dateArr, sorterEtterTid);
        if (count == 0){
            result = "Det er ingen arrangementer mellom disse datoene.";
        } else {
            for (Arrangement arranged: dateArr){
                result += arranged.toString() + "\n";
            }
        }

        return result;
    }

    public String sortByPlace(){
        Comparator<Arrangement> sortedPlace = (Arrangement a1, Arrangement a2) -> {
            return a1.getArrPlace().toLowerCase().compareTo(a2.getArrPlace().toLowerCase());
        };
        Collections.sort(arrangments, sortedPlace);
        String tekst = "";
        int count = 0;
        for (Arrangement arranged: arrangments){
            tekst += arranged.toString() + "\n";
            count++;
        }
        if (count==0){
            tekst = "Det er ingen arrangementer i registeret";
        }
        return tekst;
    }

    public String sortByType(){
        Comparator<Arrangement> sortedType = (Arrangement a1, Arrangement a2) -> {
            return a1.getArrType().toLowerCase().compareTo(a2.getArrType().toLowerCase());
        };
        Collections.sort(arrangments, sortedType);
        String tekst = "";
        int count = 0;
        for (Arrangement arranged: arrangments){
            tekst += arranged.toString() + "\n";
            count++;
        }
        if (count == 0){
            tekst = "Det er ingen arrangementer i registeret";
        }
        return tekst;
    }
    public String sortByTime(){
        Comparator<Arrangement> sortedTime = (Arrangement a1, Arrangement a2) -> {
            int time1 = (int)(a1.getArrTime() % 10000); // Extracts the time part (HHmm)
            int time2 = (int)(a2.getArrTime() % 10000); // Extracts the time part (HHmm)
            return time1 - time2; // Compare the time parts for sorting
        };
        Collections.sort(arrangments, sortedTime);
        String tekst = "";
        int count = 0;
        for (Arrangement arranged: arrangments){
            tekst += arranged.toString() + "\n";
            count++;
        }
        if (count == 0){
            tekst = "Det er ingen arrangementer i registeret";
        }
        return tekst;
    }



}

