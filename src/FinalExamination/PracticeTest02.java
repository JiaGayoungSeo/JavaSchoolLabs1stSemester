package FinalExamination;

public class PracticeTest02 {
    public static void main(String[] args){
        Student myStudent = new Student();
        myStudent.setName("Gerry");
        myStudent.setId(8888);
        myStudent.setMidterm(78);
        myStudent.setFinalScore(83);
        myStudent.setAssignment(82);
        double finalGrade;
        finalGrade = myStudent.getMidterm()*0.35+myStudent.getFinalScore()*0.45+myStudent.getAssignment()*0.2;
        System.out.printf("%.2f",finalGrade);
    }

}
