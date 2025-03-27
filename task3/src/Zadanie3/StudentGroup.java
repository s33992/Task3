package Zadanie3;
import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String nazwa;
    public List<Student> students;

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.students = new ArrayList<>();
    }

    public void assignStudent(Student student) {

        for (Student s : students) {
            if (s.indexNumber.equals(student.indexNumber) || s.email.equals(student.email )) {
                throw new IllegalStateException("Nie można dodać tego samego studenta dwa razy.");
            }
        }

        if (students.size() >= 15) {

            throw new IllegalStateException("Nie można dodać więcej niż 15 osób do grupy.");

        }
            students.add(student);
            student.assignToGroup(this);

    }

}

