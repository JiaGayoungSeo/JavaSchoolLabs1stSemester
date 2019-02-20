package Lab2_Whileandfor;

import java.text.DecimalFormat;

public class LabExercise2_6 {
    public static void main(String[] args){
        int counter=0;
        int kiloGram=-1;
        double pounds=1;
        DecimalFormat form=new DecimalFormat();
        System.out.println(("kilograms"+"       "+"pounds:"));
        while(counter<100){

            kiloGram=kiloGram+2;
            pounds=kiloGram*2.2;
            counter++;
            System.out.println(kiloGram+"                "+(form.format(pounds))+"\n");
        }
    }
}
