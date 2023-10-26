import java.util.Scanner;

public class Primtall {
    public static void main(String[] args) {
        //create a scanner object
        Scanner scanner = new Scanner(System.in);
        //declare and initialise the isPrime variable
        boolean isPrime = true;
        //start a while loop to enable repeated input from user
        while (true) {
            //prompt user for input
            System.out.print("Enter a number (or string to exit): ");

           if (scanner.hasNextInt()){
               int num = scanner.nextInt(); //if input is number, then store it in var num
               if (num <= 1) { //1. less than one aren't prime numbers
                   isPrime = false;
                   //System.out.println("less than one");
               } if (num == 2 || num == 3 || num == 5 || num == 7 ) { //2. prime numbers between 1-10
                   isPrime = true;
                   //System.out.println("Two or three or five or seven");
               } if (num > 3) { //for numbers greater than 3
                   if (num % 2 == 0) { //if number is even - it is not a prime
                       isPrime = false;
                       //System.out.println("Even number");
                   } else { //find if the odd number is prime
                       for (int i = 3; i * i <= num; i+= 2) { //condition is (i**2 <= num) because a not-prime has a multiple that is less than or equal the square root of the num
                           if (num % i == 0) { //if num is divisible by smtg then it is not prime
                               isPrime = false;
                               //System.out.println("More than three and not prime" );
                           } else { //if num doesn't have a multiple that is less than or equal to the square root of itself
                               isPrime = true;
                               //System.out.println("More than three and prime");
                           }
                       }
                   }
               }
               //System.out.println(isPrime);
               if (isPrime) {
                   System.out.println(num + " er et primtall");
               } else {
                   System.out.println(num + " er ikke et primtall");
               }
           } else {
               System.out.println("Program stopped");
               break;
           }
        }
        scanner.close();
    }
}


