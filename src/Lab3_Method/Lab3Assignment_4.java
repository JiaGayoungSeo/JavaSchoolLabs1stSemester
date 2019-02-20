package Lab3_Method;
import java.util.Scanner;

public class Lab3Assignment_4 {

    public  static void main(String[] args){
        int random = (int)(Math.random()*1000+1);
        int validNumber;
        System.out.println("guess the number");
        validNumber=guess();

        while(random!=validNumber){
            if(validNumber>random){
                System.out.println("Too high,guess again");
            }
            if(validNumber<random){
                System.out.println("Too low,guess again");
            }
            validNumber = guess();
        }
        if(random==validNumber) System.out.println("Congrats!");

    }

    public  static int guess(){
        int validNumber=0;
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if(a<1||a>1000){
            System.out.println("enter a valid number");
            a = input.nextInt();
        }
        if(0<a && a<1000){
            validNumber = a;
        }
        return validNumber;
    }

}
