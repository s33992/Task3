package Zadanie3;
import java.util.ArrayList;
import java.util.List;

public class Student {

    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> grades;
    public List<StudentGroup> groups;


    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void assignToGroup(StudentGroup group) {
        if (!groups.contains(group)) {
            groups.add(group);
        }

    }

    public  double calculateAverage(){
        if (grades.isEmpty()){
            throw new IllegalArgumentException("Student nie posiada żadnych ocen.");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        double[] allowedGrades = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double roundedAverage = 0;
        double diff;
        double maxDiff = 5;

        for (double value : allowedGrades) {
            diff = Math.abs(average-value);
            if (diff < maxDiff ) {
                maxDiff = diff;
                roundedAverage = value;
            }
        }
        return roundedAverage;
    }

    public void addGrade(Double grade) {
        if (grades.size() >= 20) {
        throw new IllegalStateException("Student może mieć maksymalnie 20 ocen.");
        }
            grades.add(grade);
        }

}
