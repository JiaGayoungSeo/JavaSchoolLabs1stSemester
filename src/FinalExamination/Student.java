package FinalExamination;

public class Student {
    private int id;
    private String name;
    private int midterm;
    private int finalScore;
    private int assignment;

    Student(int id, String name, int midterm, int finalScore, int assignment){
       this.id = id;
       this.name = name;
       this.midterm =midterm;
       this.finalScore = finalScore;
       this.assignment = assignment;
    }
    Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        if(midterm<0){
            System.out.println("Can't use negative value");
        }
        else this.midterm = midterm;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        if(finalScore<0){
            System.out.println("Can't use negative value");
        }
        else this.finalScore = finalScore;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        if(assignment<0){
            System.out.println("Can't use negative value");
        }
        else this.assignment = assignment;
    }
}
