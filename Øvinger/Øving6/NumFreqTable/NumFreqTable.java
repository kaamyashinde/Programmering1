import java.util.Arrays;
import java.util.Random;
public class NumFreqTable {
    Random random = new Random();
    int tall; //gir en verdi i intervallet (0,9)
    int str = 1000;
    int[] antall = new int[str]; //lager en array med 1000 plasser
    int[] posNum = {0, 1, 2, 3, 4, 5 ,6, 7, 8, 9}; //alle mulige tall
    int[] frequency = new int[10]; //tøm frekvens liste til å lagre frekvens

    //constructor
    public NumFreqTable(){}

    public int getTall(){
        tall = random.nextInt(10);
        return tall;
    }
    public void createList(){
        for (int i = 0; i < antall.length; i++) {
            antall[i] = this.getTall();
        }
    }

    public void getFrequency(){
       int counted = -1;
       for (int i = 0; i < posNum.length; i++){
           int count = 0;
           for (int j = 0; j < antall.length; j++){
               if (posNum[i] == antall[j]){
                   count++;
                   antall[j] = counted;
               }
               frequency[i] = count;
           }
       }

       for (int i = 0; i < frequency.length; i++){
           System.out.println("Element: " + posNum[i] + " --> Frequency: " + frequency[i]);
       }
    }

    public void getSum(){
        int sum = 0;
        for (int value:frequency){
            sum+=value;
        }
        System.out.println(sum);
    }

    public void runAll(){
        this.createList();
        this.getFrequency();
        this.getSum();
    }
}
