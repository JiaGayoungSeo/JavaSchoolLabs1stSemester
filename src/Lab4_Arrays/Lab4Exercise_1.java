package Lab4_Arrays;

public class Lab4Exercise_1 {
    public static int[] populate(int a){
       int[] array = new int[a];
       for(int i=0;i<array.length;i++){
           array[i] = (int)(Math.random()*100);
       }
       return array;
    }
    public static int average(int[] num){
        int sum=0;
        int average=0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        average = sum/num.length;
        return average;

    }
    public static int getAbove(int[] array){
        int count =0;
        for(int i=0;i<array.length;i++){
            if(array[i]>average(array)) count++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(getAbove(populate(20)));
    }

}
