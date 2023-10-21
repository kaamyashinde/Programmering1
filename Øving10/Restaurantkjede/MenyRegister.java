
import java.util.*;
public class MenyRegister {

    ArrayList<Rett> allDishes;
    Map<String, ArrayList<Rett>> allMeny;
    Map<Integer, ArrayList<Rett>> prisperMeny;
    ArrayList<Rett> newList = new ArrayList<>();


    public MenyRegister(){
        allDishes = new ArrayList<>();
    }


    //register en ny rett:
    public void registerRett(String name, String type, int price, String recipe){
        for (Rett a: allDishes){
            if (a.getName().equals(name)){
                System.out.println("The dish already exists.");
            } else {
                allDishes.add(new Rett(name, type, price, recipe));
                System.out.println("The dish has been registered.");
            }
        }
    }

    //get-metoder
    public String getRettNavn(String navn){
        String result = "";
        for (Rett a : allDishes){
            if (a.getName().toLowerCase().equals(navn.toLowerCase())){
                result = a.getName();
            }
        }
        if (result.isEmpty()){
            result = "Fant ikke retten";
        }

        return result;
    }

    public String getRettType(String type){
        String result = "";
        int count = -1;
        for (Rett b : allDishes){
            if (b.getType().toLowerCase().equals(type.toLowerCase())){
                result += b.toString();
                count++;
            }
        }
        if (count == -1){
            result = "Fant ingen retter av denne typen";
        }

        return result;
    }

    public String getAllDishesName(){
        String tekst = "";
        for (Rett a: allDishes){
            tekst += a.getName();
        }
        if (tekst.isEmpty()){
            tekst = "Fant ingen retter";
        }
        return tekst;
    }

   //metodene til å lage en ny meny:
    public void addDishesToMenu(String dishName){

            for (Rett a: allDishes){
                if (a.getName().toLowerCase().equals(dishName)){
                    newList.add(a);
                }
            }


    }

    public void printNewList(){
        for (Rett rett : newList) {
            System.out.println(rett.toString());
        }

    }

    public void newMeny(String menyName){
        allMeny = new HashMap<String, ArrayList<Rett>>();
        allMeny.put(menyName, newList);
    }

    public void clearNewList(){
        newList.clear();
    }

    public void printMeny(){
        for (String i: allMeny.keySet()) {
            System.out.println(i);
        }
    }
    public void getTotalMenyPris(){
        int totalPris = 0;
        for (Rett a: newList){
            totalPris += a.getPrice();
        }

        prisperMeny = new HashMap<Integer, ArrayList<Rett>>();
        prisperMeny.put(totalPris, newList);
    }



    public String getmenyInnenInterval(int start, int end){
        String tekst = "";
        for (int i : prisperMeny.keySet()){
            if (i >= start && i <= end){
                tekst += prisperMeny.get(i);
            }
        }
        if (tekst.isEmpty()){
            tekst = "Fant ingen menyer innenfor dette intervallet";
        }

        return tekst;
    }


    //viktig metoder:


    @Override
    public String toString() {
        String tekst = "";
        for (Rett a : allDishes){
            tekst += a.toString();
        }
        return tekst;
    }

    //first create an empty list for the menu, then add the dishes to the list, then add this list to the name of the menu in hashmap
}

/**
 * Not printing out the tekst for empty String in case 1
 * Add in.nextLine() as the first line for case 2 and 3 (two instances in case 3)
 *
 * */
