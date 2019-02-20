package FinalExamination;

public class PracticeTest01 {
    public static void main(String[] args){

        String [] names = {"Gerry", "Lindsey", "Erin", "Brett"};

        double [] hours = {40.0, 38.25, 39.50, 18.75};

        double [] rate = {15.67, 8.90, 8.90, 12.33};

        //a)Display the name and number of hours for the employee who worked the most hours during the week.
        double maxHours = 0;

        for(int i=0; i<names.length; i++){
            maxHours = hours[0];
            if(hours[i]>maxHours){
                maxHours = hours[i];
            }
        }
        System.out.println(maxHours);

        //c)	Display the elements of the array you created in the previous question
        for(int i =0; i<rate.length;i++){
            System.out.println(calculatePay(rate,hours)[i]);
        }

        //e)Use the method you created in the previous question to change the value of index 2 to 40.0 in the hours array.
        setElement(2,40,hours);
        for(int i =0; i<hours.length; i++){
            System.out.println(hours[i]);
        }


    }

    //b)	Write a method called calculatePay( ) that accepts two arrays type double as parameters.
    // The first parameter is an array that holds the hourly pay rate of each employee.
    // The second parameter is an array with the number of hours worked by each employee.
    // This method creates and returns a populated array called weeklyPay with the amount of money each employee earned during the last week.

    public static double[] calculatePay(double[] rate, double[] hours){
        double[] weeklyPay = new double[4];
        for(int i=0; i<rate.length; i++){
            weeklyPay[i] = rate[i]*hours[i];
        }
        return weeklyPay;
    }

    //d)	Write a method called setElement( ). Its first parameter, an int called index, is the index of the array.
    // The second parameter, a double called value, is the value to be placed in the position of the array specified by index.
    // The third parameter is an array type double. Be sure to check that index is not out of bounds.

    public static void setElement(int index, double value, double[] bound){
        bound[index] = value;
    }









}
