package Lab2_Whileandfor;
import java.util.Scanner;

public class Lab2Assignment_4 {
    public static void main(String[] args){
        int counter;
        double theDistance;
        double theNumberOfLiters;
        double totalOfDistance=0;
        double litersPerKilometer;

        Scanner input = new Scanner(System.in);

        for(counter=0;counter<3;counter++) {
            System.out.println("Input the kilometers driven");
            theDistance = input.nextDouble();
            System.out.println("Input the number of liters used");
            theNumberOfLiters = input.nextDouble();
            totalOfDistance = totalOfDistance + theDistance;

            for (counter = 0; counter < 1; counter++) {
                litersPerKilometer = theNumberOfLiters / theDistance * 100;
                System.out.println("The liter used per 100 kilometers for this tank is  " + litersPerKilometer);
            }

        }
        System.out.println("The combined mileage for all tanks is "+totalOfDistance);

    }
}
