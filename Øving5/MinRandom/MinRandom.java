import java.util.Random;
public class MinRandom {
    Random random = new Random();
    public MinRandom(){}

    public int nesteHeltall(int nedre, int ovre){ //intervallet (nedre, ovre)
       // int tall = random.nextInt(nedre, ovre + 1); //fra og med nedre til og med ovre
        int differanse = ovre - nedre;
        int tall = nedre + random.nextInt(differanse);
        if (tall < nedre || tall > ovre) {
            System.out.println("Heltall utenfor interval");
        }
        return tall;
    }
   public double nesteDesimaltall(double nedre, double ovre) { //intervallet >nedre, ovre<^15
        double differanse = ovre - nedre;
        double tall = random.nextDouble() * differanse;
        double resultat = nedre + tall;
       if (resultat < nedre || resultat > ovre) {
           System.out.println("Desimaltall utenfor interval");
       }
        return resultat;
   }

   public void mangeRunder() {
        for (int i = 15; i <= 25; i++) {
            System.out.println(nesteDesimaltall(15, 25));
            System.out.println(nesteHeltall(15, 25));

       }
   }

}

