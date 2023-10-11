import java.util.Random;

public class TerningSpill {

    java.util.Random terning = new Random();
    int sumPoeng = 0;
    int runde = 1;

    public TerningSpill(int sumPoeng){
        this.sumPoeng = sumPoeng;
    }

    public int getSumPoeng(){
        return sumPoeng;
    }
    public int getRounds(){
        return runde;
    }
    public int kastTerning(){
        return 1 + terning.nextInt(6);
    }

    public boolean erFerdig(){
       return sumPoeng < 100;
    }

    public void spill() {

        while (erFerdig()) {
            int throwDice = kastTerning();
            sumPoeng += throwDice;
            if (throwDice == 1) {
                sumPoeng = 0;
            }
            if (sumPoeng >= 100) {
                break;
            }
            runde++;
        }

    }


}