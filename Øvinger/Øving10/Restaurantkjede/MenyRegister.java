import java.util.*;

public class MenyRegister {

  ArrayList<Rett> allDishes;
  Map<String, ArrayList<Rett>> allMeny;
  Map<Integer, ArrayList<Rett>> prisperMeny;
  ArrayList<Rett> newList = new ArrayList<>();

  public MenyRegister() {
    allDishes = new ArrayList<>();
  }

  // register en ny rett:
  public void registerRett(Rett rett) {
    boolean exists = false;
    for (Rett a : allDishes) {
      if (a.getName().equals(rett.getName())) {
        exists = true;
        break;
      }
    }
    if (exists) {
      System.out.println("The dish already exists.");
    } else {
      allDishes.add(rett);
      System.out.println("The dish has been registered.");
    }
  }

  // get-metoder
  public void getRettNavn(String navn) {
    if (allDishes.isEmpty()) {
      System.out.println("No dishes have been registered yet");
    } else {
      int count = -1;
      for (Rett a : allDishes) {
        if (a.getName().equals(navn.toLowerCase())) {
          System.out.println(a.toString());
          count = 0;
        }
      }
      if (count == -1) {
        System.out.println("No dishes of the name found");
      }
    }
  }

  public void getRettType(String type) {
    if (allDishes.isEmpty()) {
      System.out.println("No dishes have been registered yet");
    } else {
      String result = "";
      int count = -1;
      for (Rett b : allDishes) {
        if (b.getType().equals(type.toLowerCase())) {
          result += b.toString();
          count++;
        }
      }
      if (count == -1) {
        System.out.println("No dishes of the type found");
      } else {
        System.out.println(result);
      }
    }
  }

  public void getAllDishesName() {
    if (allDishes.isEmpty()) {
      System.out.println("No dishes have been registered yet");
    } else {
      String tekst = "";
      for (Rett a : allDishes) {
        tekst += a.getName() + "\n";
      }
      if (tekst.isEmpty()) {
        tekst = "Fant ingen retter";
      } else {
        System.out.println(tekst);
      }
    }
  }

  // metodene til å lage en ny meny:
  public void addDishesToMenu(String dishName) {
    newList.add(new Rett("name of the dish", "type of the dish", 0, "the recipe"));

    for (Rett a : allDishes) {
      if (a.getName().equals(dishName.toLowerCase())) {
        newList.add(a);
        System.out.println(dishName + " has been added");
      }
    }
  }

  public void printNewList() {
    for (Rett rett : newList) {
      System.out.println(rett.toString());
    }
  }

  public void newMeny(String menyName) {
    allMeny = new HashMap<String, ArrayList<Rett>>();
    allMeny.put(menyName, newList);
  }

  public void clearNewList() {
    newList.clear();
  }

  public void getTotalMenyPris() {
    int totalPris = 0;
    for (Rett a : newList) {
      totalPris += a.getPrice();
    }

    prisperMeny = new HashMap<Integer, ArrayList<Rett>>();
    prisperMeny.put(totalPris, newList);
  }

  public String getmenyInnenInterval(int start, int end) {
    String tekst = "";
    for (int i : prisperMeny.keySet()) {
      if (i >= start && i <= end) {
        tekst += prisperMeny.get(i);
      }
    }
    if (tekst.isEmpty()) {
      tekst = "Fant ingen menyer innenfor dette intervallet";
    }

    return tekst;
  }

  // viktig metoder:

  @Override
  public String toString() {
    String tekst = "";
    for (Rett a : allDishes) {
      tekst += a.toString();
    }
    return tekst;
  }

  // first create an empty list for the menu, then add the dishes to the list, then add this list to
  // the name of the menu in hashmap
}

/**
 * Not printing out the tekst for empty String in case 1 Add in.nextLine() as the first line for
 * case 2 and 3 (two instances in case 3)
 */
