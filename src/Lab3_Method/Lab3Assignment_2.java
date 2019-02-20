package Lab3_Method;

public class Lab3Assignment_2 {
    public static void reverse (int a){
        while(a>0){
            int number = 0;
            number = a%10;
            System.out.println(number);
            a = a/10;
        }
    }
    public static void main(String[] argas){
        reverse(6789);
    }
}
