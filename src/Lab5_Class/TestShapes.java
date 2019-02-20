package Lab5_Class;
import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        Circle myCircle = new Circle(radius);

        double height = (Math.random()*10+1);
        double width = (Math.random()*10+1);
        Rectangle myRectangle = new Rectangle(height,width);

        System.out.print("Circle area is: ");
        System.out.println(myCircle.computeArea());
        System.out.print("Circle perimeter is: ");
        System.out.println(myCircle.computeCircumference());

        System.out.print("Rectangle ares is: ");
        System.out.println(myRectangle.computeArea());
        System.out.print("Rectangle perimeter is: ");
        System.out.println(myRectangle.computePerimeter());
    }
}
