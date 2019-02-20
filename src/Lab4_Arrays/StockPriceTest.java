package Lab4_Arrays;

public class StockPriceTest {
    public static double getHighest(double[] array){
        double max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max) max = array[i];
        }
        return max;
    }

    public static double getLowest(double[] array){
        double min=0;
        for(int i=0;i<array.length;i++){
            min = array[i];
            if(array[i]<min) min = array[i];
        }
        return min;
    }

    public static double getAverage(double[] array){
        double sum =0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    public static int numOfAverage(double[] array){
        int number =0;
        for(int i=0;i<array.length;i++){
            if(array[i]<getAverage(array)){
                number++;
            }
        }
        return number;
    }

    public static double[] reverseSort(double[] array) {

        double[] reversed = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
