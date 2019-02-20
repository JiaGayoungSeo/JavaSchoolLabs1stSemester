package PracticeFinalExam;

public class PracticeTest01 {
    public static void main(String[] args){
        ArrayMethods myMethods = new ArrayMethods ();

        String [] names = {"Gerry", "Lindsey", "Erin", "Brett", "Bob"};

        int [] units = {12,42,51,34,76};

        double [] commissionRate = {0.07, 0.075, 0.05, 0.08, 0.05,};

        int max=0;
        int maxSalesPerson=0;

        for(int i =0; i<units.length; i++){
            max = units[0];
            if(units[i]>max) {
                max = units[i];
                maxSalesPerson = i;
            }
        }

        System.out.println(names[maxSalesPerson]+" sold "+max+" units during the week");

        for (int i=0; i<names.length;i++){
            System.out.print ( names[i]+" earned " );
            System.out.printf("%.2f",myMethods.calculatePay ( myMethods.setCommission ( commissionRate,units ),units )[i]);
            System.out.println();


        }

    }
}



