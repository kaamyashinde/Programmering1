
public class Matrise {

    private final double[][] matriseOriginal;

    double[][] result; //initialise



    public Matrise(double[][] matriseOriginal){
        this.matriseOriginal = matriseOriginal;
    }


    public String getAddition(double[][] matriseInput){

        if (matriseOriginal.length != matriseInput.length || matriseOriginal[0].length != matriseInput[0].length){
            return null;
        } else {
            result = new double[matriseOriginal.length][matriseOriginal[0].length];
            for (int i = 0; i < matriseInput.length; i++){
                for (int j = 0; j < matriseInput[0].length; j++){
                    result[i][j] = matriseOriginal[i][j] + matriseInput[i][j];
                }
            }

            for (int i = 0; i < matriseInput.length; i++) {
                for (int j = 0; j < matriseInput[0].length; j++) {
                    System.out.print(this.result[i][j] + " "); //figure out how to print it in matrix form!
                }
                System.out.println(" ");
            }
        }

        return " ";

    }

    public String getMultiplication(double[][] matriseInput){
        if (matriseOriginal.length != matriseInput.length || matriseOriginal[0].length != matriseInput[0].length){
            return null;
        } else {
            result = new double[matriseOriginal.length][matriseOriginal[0].length];
            //perform matrix multiplication
            for (int i = 0; i < matriseInput.length; i++){
                for (int j = 0; j < matriseInput[0].length; j++){
                    result[i][j] = 0;
                    for(int k = 0; k < matriseInput.length; k++){
                        result[i][j] += matriseOriginal[i][k] * matriseInput[k][j];
                    }
                }

            }
            for (int i = 0; i < matriseInput.length; i++) {
                for (int j = 0; j < matriseInput.length; j++) {
                    System.out.print(this.result[i][j] + " "); //figure out how to print it in matrix form!
                }
                System.out.println(" ");
            }
            System.out.println(" ");

        }
        return " ";
    }

    public void getTransponert(){
        //perform transponering
        result = new double[matriseOriginal[0].length][matriseOriginal.length];
        for (int i = 0; i < matriseOriginal.length; i++){
            for (int j = 0; j < matriseOriginal[0].length; j++){
                result[j][i] = matriseOriginal[i][j];
            }
        }
        for (int i = 0; i < matriseOriginal[0].length; i++) {
            for (int j = 0; j < matriseOriginal.length; j++) {
                System.out.print(this.result[i][j] + " "); //figure out how to print it in matrix form!
            }
            System.out.println(" ");

        }
        System.out.println(" ");

    }


}

