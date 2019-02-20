package Lab2_Whileandfor;
import java.util.Scanner;
public class Lab2Assignment_2 {
    public static void main(String[] args){
        int counter=0;
        int marks;
        int numberOfPass=0;
        int numberOfFail=0;
        System.out.println("Input the marks of students");

        for(counter=0;counter<10;counter++){
            Scanner input = new Scanner(System.in);
            marks = input.nextInt();
            if(marks>50) numberOfPass = numberOfPass+1;
            else numberOfFail = numberOfFail+1;

        }
        System.out.println(numberOfPass+" students passed. ");
        System.out.println(numberOfFail+" students failed. ");

    }
}
