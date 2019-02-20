package Lab4_Arrays;

public class Lab4Exercise_2 {
    public static int[] random(int a){
        int[] array = new int[a];
        for(int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }
    public static void reverse(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[array.length-1-i]);
        }
    }

    public static void main(String[] args){
       reverse(random(3));
    }
}
