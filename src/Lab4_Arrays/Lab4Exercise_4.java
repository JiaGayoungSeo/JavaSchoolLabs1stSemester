package Lab4_Arrays;

public class Lab4Exercise_4 {
    public static int getMinValue(int[] array){
        int min;
        min = array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]<min) min = array[i];
        }
        return min;
    }

    public static void main(String[] args){
        int[] array = {10,45,23,45};
        System.out.print(getMinValue(array));

    }
}

