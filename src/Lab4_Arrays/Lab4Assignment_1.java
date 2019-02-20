package Lab4_Arrays;
import java.util.Arrays;

public class Lab4Assignment_1 {
    public static void main(String[] args){
        double closingPrice[] = {25.0, 38.25, 39.50, 38.75, 37.33, 37.22, 29.56, 31.05, 30.77, 38.25};
        StockPriceTest test = new StockPriceTest();
        //a
        System.out.println("The stock’s highest closing price is "+ test.getHighest(closingPrice));
        //b
        System.out.println("The stock’s lowest closing price is "+test.getLowest(closingPrice));
        //c
        System.out.println("The stock's average closing price is "+ test.getAverage(closingPrice));

        //d
        int belowNum;
        belowNum = test.numOfAverage(closingPrice);
        System.out.println(belowNum + " are below the average price");

        //e
        double cost = 0;
        for(int i =0;i<closingPrice.length;i++){
            cost = cost + closingPrice[i];
        }
        System.out.println("The cost for two weeks would be "+ cost);

        //f
        double priceSummary[] = new double[3];

        //g
        priceSummary[0] = test.getHighest(closingPrice);
        priceSummary[1] = test.getLowest(closingPrice);
        priceSummary[2] = test.getAverage(closingPrice);

        //h
        for(int i=0;i<priceSummary.length;i++) System.out.println(priceSummary[i]);

        Arrays.sort(closingPrice);
        double[] descendingOrder = test.reverseSort(closingPrice);
        for(int i=0;i<descendingOrder.length;i++) System.out.println(descendingOrder[i]);

    }
}
