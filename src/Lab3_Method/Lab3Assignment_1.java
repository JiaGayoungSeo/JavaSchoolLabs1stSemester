package Lab3_Method;
import java.util.Scanner;

public class Lab3Assignment_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Method test = new Method();

        System.out.println("Enter a Fahrenheit temperature");
        double f = input.nextDouble();
        System.out.println("Celsius is  "+test.celsius(f));
    }
}
