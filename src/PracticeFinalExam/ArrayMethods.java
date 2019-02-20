package PracticeFinalExam;

public class ArrayMethods {


    public double[] setCommission(double[] commissions, int[] units){


        for(int i=0; i< units.length; i++){
            if(units[i]>=50){
                commissions[i] = commissions[i]*1.005;
            }
        }

        return commissions;

    }

    public double[] calculatePay(double[] commissions, int[] units){
        double[] weeklyPay = new double[units.length];
        for(int i = 0; i<units.length; i++){
            weeklyPay[i]=4.99*units[i]+units[i]*commissions[i];
        }
        return weeklyPay;
    }


}
