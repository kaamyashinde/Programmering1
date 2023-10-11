package O1;

import java.util.Objects;

public class NyString {

    private String input;
    private String s1[];
    private String s2[];

    public NyString(String input){
        this.input = input;
    }

    public void getForkortning(){
        s1 = input.split("\\s");

        for (int i = 0; i < s1.length; i++){
            String separateWords = s1[i];
            System.out.print(separateWords.charAt(0));
        }
        System.out.println("");

    }

    public void getFjernet(String letter){
        s2 = new String[input.length()];

        for (int i = 0; i < s2.length; i++) s2[i] = String.valueOf(input.charAt(i));

       for(String x:s2){
           if (!Objects.equals(x, letter)) {
               System.out.print(x);
           }
       }

    }




}