import java.util.Scanner; //first import the scanner method

public class Skuddar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create a scanner object

        System.out.print("Enter a year: ");
        int yearNum = scanner.nextInt();

        double divideBy4 = yearNum % 4;
        double divideBy100 = yearNum % 100;
        double divideBy400 = yearNum % 400;

        if (divideBy4 == 0.0 && divideBy100 != 0.0) { // skuddår og ikke et hundreår
            System.out.println(yearNum + " er et skuddår!");

        } else {
            if (divideBy100 == 0.0 && divideBy400 == 0.0) { //hundreår som er et skuddår fordi den kan bli delt på 400
                System.out.println(yearNum + " er et skuddår!");
            } else {
                System.out.println(yearNum + " er ikke et skuddår!");
            }
           

        }
        scanner.close();
    }
}

// System.out.println(yearNum + " er ikke et skuddår!");
