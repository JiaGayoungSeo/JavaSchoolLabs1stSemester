package Lab2_Whileandfor;
import java.util.Random;
import java.util.Scanner;


public class LabExercise2_5 {
    public static void main(String[] args){
        //Random 객체 생성
        Random generator= new Random();
        int counter=0;
        int answer;
        int correctAnswer=0;
        Scanner input = new Scanner(System.in);

        while (counter<10){
            //1~100까지 정수(int)랜덤으로 출력하기
            int a=generator.nextInt(100)+1;
            int b=generator.nextInt(100)+1;
            System.out.println("Please sum two integers");
            System.out.println(a);
            System.out.println(b);
            answer=input.nextInt();
            if(answer==(a+b)) correctAnswer = correctAnswer + 1;
            counter++;
        }
        System.out.print("You've got "+correctAnswer+" correct answers!");
    }
}
