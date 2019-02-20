package Lab2_Whileandfor;

public class NestedLoop_example {
    public static void main(String[] args){

            for(int j=0;j<=2;j++) {
                for (int i = 0; i <= 3; i++) {
                    //print만 넣으면 가로로 나온다
                    System.out.print("7");
                }
                //println으로 하면 세로로 나온다
                System.out.println("3");
            }
    }
}
