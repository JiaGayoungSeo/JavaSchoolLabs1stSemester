package Lab4_Arrays;

public class Lab4Exercise_5 {
    public static int getMinIndex(int[] array){
        int min = array[0];
        int minIndex = 0;
        for(int i=0;i<array.length;i++){
            if (array[i]<min) minIndex = i;
        }
        return minIndex;
    }

    public static void main(String[] args){
        int[] numbers = {12, 56, 454,3,56,1};
        System.out.println(getMinIndex(numbers));
    }

}
