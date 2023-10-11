import java.util.Scanner;
import java.util.Arrays;
public class MainMatrise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] matriseData1;
        double[][] matriseData2;


        //create matrix 1
        System.out.print("Enter the number of rows in the first matrix: ");
        int row1 = in.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int column1 = in.nextInt();

        matriseData1 = new double[row1][column1];

        for (int i = 0; i < row1; i++){
            for (int j = 0; j < column1; j++){
                System.out.print("Enter the element for placement [" + i + "][" + j + "]: ");
                int element = in.nextInt();
                matriseData1[i][j] = element;

            }
        }

        //create matrix 2
        System.out.print("Enter the number of rows in the second matrix: ");
        int row2 = in.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int column2 = in.nextInt();

        matriseData2 = new double[row2][column2];

        for (int i = 0; i < row1; i++){
            for (int j = 0; j < column1; j++){
                System.out.print("Enter the element for placement [" + i + "][" + j + "]: ");
                int element = in.nextInt();
                matriseData2[i][j] = element;

            }
        }

        //create instances
        Matrise m1 = new Matrise(matriseData1);
        Matrise m2 = new Matrise(matriseData2);


        //get menu
            while (true){
                System.out.println("Hva vil du gjøre med matriser? \n 1. Addere \n 2. Multiplisere \n 3. Transponere \n 4. Avslutte \n");
                int choice = in.nextInt();
                if (choice == 4) {
                    System.out.println("Avslutter programmet");
                    break;
                }


                switch (choice){
                    case 1:
                        m1.getAddition(matriseData2);
                        break;
                    case 2:
                        System.out.print("I hvilken rekefølge vil du multiplisere matriser 1 og 2? \n 1. matrise 1 x matrise 2 \n 2. matrise 2 x matrise 1? \n 3. matrise 1 x matrise 1 \n 4. matrise 2 x matrise 2 \n");
                        int valg2 = in.nextInt();
                        switch (valg2) {
                            case 1 -> m1.getMultiplication(matriseData2);
                            case 2 -> m2.getMultiplication(matriseData1);
                            case 3 -> m1.getMultiplication(matriseData1);
                            case 4 -> m2.getMultiplication(matriseData2);
                            default -> {
                                System.out.println("Error: Feil input.");
                                continue;
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Hvilken matrise vil du transponere? \n 1. matrise 1 \n 2. matrise 2 \n");
                        int valg3 = in.nextInt();
                        switch (valg3) {
                            case 1 -> m1.getTransponert();
                            case 2 -> m2.getTransponert();
                            default -> {
                                System.out.println("Error: Feil input ");
                                continue;
                            }
                        }
                        break;
                    default: {
                        System.out.println("Feilt input");
                        continue;
                    }
                }
            }










    }
}
