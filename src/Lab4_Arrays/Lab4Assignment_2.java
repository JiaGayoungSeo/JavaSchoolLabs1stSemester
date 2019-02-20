package Lab4_Arrays;

public class Lab4Assignment_2 {
    public static double[] getFinalGrade(int[] mid,int[] fin,int[]ass){
        double[] finalGrade = new double[mid.length];
        int number = mid.length;
        for(int i=0;i<number;i++){
            finalGrade[i] = ass[i]*0.15+mid[i]*0.4+fin[i]*0.45;
        }
        return finalGrade;
    }

    public static int getLowest(double[] grade){
        int minIndex =0;
        double min = grade[0];
        for(int i=0; i<grade.length;i++){
            if(grade[i]<min){
                min = grade[i];
                minIndex = i;
            }
        }
            return minIndex;
    }

    public static int getHighest(double[] grade){
        int maxIndex =0;
        double max = grade[0];
        for (int i=0;i<grade.length;i++){
            if(grade[i]>max){
                max = grade[i];
                maxIndex = i;
            }
        }
        return  maxIndex;
    }

    public  static int findFrequency(double[] array, int Value){
        int frequency = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=Value) frequency++;
        }
        return frequency;
    }

    public static void main(String[] args){
        String name[] = {"Robin", "Jo", "Kelly", "Jaimie"};
        int midtermScore[] = {28, 78, 92, 83};
        int finalScore[] = {58, 75, 96, 79};
        int assignmentGrade[] = {33, 80, 90, 83};
        double sum = 0;
        double average;
        //a
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+"\t"+midtermScore[i]+"\t"+finalScore[i]+"\t"+assignmentGrade[i]);
            System.out.println();
        }

        double[] array = getFinalGrade(midtermScore,finalScore,assignmentGrade);

        for(int i=0;i<4;i++){
            System.out.println(name[i]+"\t"+"got "+"\t"+array[i]+"\t"+"for a final grade");
        }

        //d
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        average = sum/array.length;

        System.out.println("The average of final grade for "+array.length+" students is "+ average);

        //e
        String newName[] = {"Robin", "Jo", "Kelly", "Jaimie","Terry","Kerry"};
        int newMidScore[]= {28, 78, 92, 83, 86, 71};
        int newFinalScore[] = {58, 75, 96, 79, 76,75};
        int newAssignment[] = {33, 80, 90, 83, 91, 78};
        double newFinalGrade[] = getFinalGrade(newMidScore,newFinalScore,newAssignment);
        double newSum = 0;
        double newAverage;
        //g
        for(int i=0;i<newName.length;i++){
            System.out.print(newName[i]+"\t"+newMidScore[i]+"\t"+newFinalScore[i]+"\t"+newAssignment[i]);
            System.out.println();
        }

        //h
        for(int i=0;i<newName.length;i++){
            newSum = newSum + newFinalGrade[i];
        }
        newAverage = newSum/newName.length;
        System.out.println("The average of all final grade is  "+ newAverage);

        //i
        System.out.println(newName[getLowest(newFinalGrade)]+" got the lowest score: "+newFinalGrade[getLowest(newFinalGrade)]);
        System.out.println(newName[getHighest(newFinalGrade)]+" got the highest score: "+newFinalGrade[getHighest(newFinalGrade)]);

        //k
        System.out.println(findFrequency(newFinalGrade,60)+" are passed this class");




    }


}
