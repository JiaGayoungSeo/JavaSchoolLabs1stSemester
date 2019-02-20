package Lab3_Method;
import java.util.Random;
import java.util.Scanner;

public class Lab3Assignment_3 {

    public static int filp(){
        Random random = new Random();
        int toss;
        toss = random.nextInt(2);
        return toss;
    }
    public static void main(String[] args){
        int countRight=0;
        int countWrong=0;

        System.out.println("Head(0) or Tail(1)?");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        while(guess!=2){
            int toss = filp();
            if(guess==toss){
                System.out.println("Congrats Try again");
                countRight = countRight+1;
                guess = input.nextInt();
            }
            if(guess!=toss){
                System.out.println("Sorry Try again");
                countWrong =countWrong+1;
                guess =input.nextInt();
            }
        }
        System.out.println("You got "+countRight+" correct answers");
        System.out.println("You got "+countWrong+" wrong answers");

    }

}
