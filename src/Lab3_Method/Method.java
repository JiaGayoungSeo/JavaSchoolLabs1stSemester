package Lab3_Method;

public class Method {
    public static double celsius(double f){
        double celsius=0;
        celsius = 5.0/9.0*(f-32);
        return celsius;
    }

    public static double fahrenheit(double c){
        double fahrenheit=0;
        fahrenheit = 9.0/5.0*(c+32);
        return fahrenheit;
    }


}
