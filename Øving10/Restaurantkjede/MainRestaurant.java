import java.util.Scanner;

public class MainRestaurant {

    public static void main(String[] args) {
        MenyRegister meny = new MenyRegister();
        Scanner in = new Scanner(System.in);

        while(true){

            System.out.println("""
                    Welcome to the restaurant menu register, what would you like to do?
                    1. List of names of all existing dishes
                    2. Find information of an existing dish based on the name
                    3. Register a new dish
                    4. Find all dishes of a given type
                    5. Register a new menu with a set of dishes
                    6. Find all menus with a total price within a given interval
                    7. End program
                    """);
            int choice = getIntInput(in);

            if (choice == 7){
                System.out.println("Ending the program. Have a nice day!");
                break;
            }

            switch (choice){
                case 1 -> meny.getAllDishesName();
                case 2 -> {
                    in.nextLine(); //clear the input buffer
                    System.out.println("Which dish would you like to get the information about?");
                    String dishName = in.nextLine();
                    meny.getRettNavn(dishName);
                }
                case 3 -> {
                    in.nextLine(); //clear the input buffer
                    System.out.println("What is the name of the dish?");
                    String dishName = in.nextLine();
                    System.out.println("What type of dish is it?");
                    String dishType = in.nextLine();
                    System.out.println("What is the price of the dish?");
                    int dishPrice = getIntInput(in);
                    in.nextLine(); //clear the input buffer
                    System.out.println("What is the recipe of the dish?");
                    String dishRecipe = in.nextLine();
                    meny.registerRett(new Rett(dishName, dishType, dishPrice, dishRecipe));
                }
                case 4 -> {
                    in.nextLine(); //clear the input buffer
                    System.out.println("What type of dishes would you like to look for?");
                    String dishType = in.nextLine();
                    meny.getRettType(dishType);
                }
                case 5 -> {
                    in.nextLine(); //clear the input buffer
                    System.out.println("How many dishes would u like to add to the menu? Make sure that you have already registered the dishes. If not, then enter 0");
                    int num = getIntInput(in);
                    if (num == 0){
                        break;
                    } else {
                        in.nextLine(); //clear the input buffer
                        for (int i = 0; i < num; i++){
                            System.out.println("What is the name of the dish?");
                            String dishName = in.nextLine();
                            meny.addDishesToMenu(dishName);
                        }

                        System.out.println("What would u like to call this menu?");
                        String menuName = in.nextLine();
                        meny.newMeny(menuName);
                    }
                }
                case 6 -> {
                    meny.getTotalMenyPris();
                    System.out.println("What is the lower limit of the interval?");
                    int min = getIntInput(in);
                    System.out.println("What is the upper limit of the interval?");
                    int max = getIntInput(in);
                    System.out.println(meny.getmenyInnenInterval(min, max));
                }

            }

        }
/*
        meny.getRettType("pasta");
        meny.getRettNavn("pasta");
        meny.registerRett(new Rett("Pasta", "Pasta", 100, "Pasta"));
        meny.getRettNavn("Pasta");
        meny.getRettType("Pasta");
        meny.registerRett(new Rett("Pasta", "maincourse", 100, "Pasta"));
        meny.registerRett(new Rett("Milkshake", "dessert", 180, "Milkshake"));

        System.out.println("-------------");
        meny.getAllDishesName();
        System.out.println("--------------");

        meny.addDishesToMenu("Pasta");
        meny.addDishesToMenu("Milkshake");
*/


    }

    private static int getIntInput(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("You need to write a whole number");
                in.nextLine(); // Consume the invalid input
            }
        }
    }

}
