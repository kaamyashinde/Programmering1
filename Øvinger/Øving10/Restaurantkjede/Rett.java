import java.util.*;
public class Rett {
    private final String name;
    private final String type;
    private final int price;
    private final String recipe;

    public Rett(String name, String type, int price, String recipe){
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    //get-metoder
    public String getName(){
        return name.toLowerCase();
    }
    public String getType(){
        return type.toLowerCase();
    }
    public int getPrice(){
        return price;
    }
    public String getRecipe(){
        return recipe;
    }


    @Override
    public String toString() {
        return "\nRett: \n"
                + " Navn: " + name + "\n"
                + " Type: " + type + "\n"
                + " Pris: " + price + "\n"
                + ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
    }


    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int num = in.nextInt();
        System.out.println(num);

        in.nextLine();


        System.out.println("Enter string");
        String str = in.nextLine();
        System.out.println(str);

        System.out.println("Enter number");
        int newNum = in.nextInt();
        System.out.println(newNum);
    }*/
}

/*
  Å registrere en ny rett.
• !Å finne en rett, gitt navnet.
• !Å finne alle retter av en gitt type.
• !Å registrere en ny meny som består av ett sett med retter.
• Å finne alle menyer med totalpris innenfor et gitt intervall.
* */

