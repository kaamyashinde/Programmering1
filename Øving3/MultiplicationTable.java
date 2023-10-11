import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //declare variables so that they can be used throughout the scope of main
        int startingNumber;
        int endingNumber;

        //create a scanner object
        Scanner scanner = new Scanner(System.in);

        //starting number
        while (true) { //condition is true so the while loop will always run unless is exited using break
            System.out.print("Enter starting number ");

            if (scanner.hasNextInt()){
                startingNumber = scanner.nextInt();
                break; //exit the loop if the input is an integer
            } else {
                System.out.println("Invalid data type. Please input a number.");
                scanner.next(); //basically clears out the input given by the user / discards it.
                // ^this is to avoid the infite loop i got earlier
            }
            /*
            since the break is between if and else, if the user inputs an incorrect data type,
            the program will keep asking for input because there is no break to escape the while loop until
            a number is inserted, thereby fulfilling the condition hasNextInt and resulting in break.
             */
        }

        //ending number
        while (true) {
            System.out.print("Enter ending number ");

            if (scanner.hasNextInt()) {
                endingNumber = scanner.nextInt();
                break; //exit the loop if the input is an integer
            } else {
                System.out.println("Invalid data type. Please input a number");
                scanner.next();
            }
        }

        //outer do-while loop -> responsible for printing out the table title + table
        do {
            System.out.println(startingNumber + "-gangen");
            //inner for loop -> responsible for printing out the parts of the table
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(startingNumber + " x " + multiplier + " = " + startingNumber * multiplier );
            }
            startingNumber++;
        } while (startingNumber <= endingNumber);

        scanner.close();

    }
}
