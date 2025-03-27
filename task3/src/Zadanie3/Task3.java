package Zadanie3;
import Zadanie3.Student;
import Zadanie3.StudentGroup;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "s11111", "s11111@mail.com", "Warszawa");
        Student student2 = new Student("Anna", "Nowak", "s11112", "s11112@mail.com", "Kraków");
        Student student3 = new Student("Marcin", "Kaczyński", "s11113", "s11113@mail.com", "Lublin");

        Student student4 = new Student("Jan", "Kowalski", "s11114", "s11114@mail.com", "Warszawa");
        Student student5 = new Student("Anna", "Nowak", "s11115", "s11115@mail.com", "Kraków");
        Student student6 = new Student("Marcin", "Kaczyński", "s11116", "s11116@mail.com", "Lublin");

        Student student7 = new Student("Jan", "Kowalski", "s11117", "s11117@mail.com", "Warszawa");
        Student student8 = new Student("Anna", "Nowak", "s11118", "s11118@mail.com", "Kraków");
        Student student9 = new Student("Marcin", "Kaczyński", "s11119", "s11119@mail.com", "Lublin");

        Student student10 = new Student("Jan", "Kowalski", "s11120", "s11120@mail.com", "Warszawa");
        Student student11 = new Student("Anna", "Nowak", "s11121", "s11121@mail.com", "Kraków");
        Student student12 = new Student("Marcin", "Kaczyński", "s11122", "s11122@mail.com", "Lublin");

        Student student13 = new Student("Jan", "Kowalski", "s11123", "s11123@mail.com", "Warszawa");
        Student student14 = new Student("Anna", "Nowak", "s11124", "s11124@mail.com", "Kraków");
        Student student15 = new Student("Marcin", "Kaczyński", "s11125", "s11125@mail.com", "Lublin");




        StudentGroup group1 = new StudentGroup("Grupa1");
        group1.assignStudent(student1);
        group1.assignStudent(student2);
        group1.assignStudent(student3);
        group1.assignStudent(student4);
        group1.assignStudent(student5);
        group1.assignStudent(student6);
        group1.assignStudent(student7);
        group1.assignStudent(student8);
        group1.assignStudent(student9);
        group1.assignStudent(student10);
        group1.assignStudent(student11);
        group1.assignStudent(student12);
        group1.assignStudent(student13);
        group1.assignStudent(student14);
        group1.assignStudent(student15);




        student1.addGrade(3.0);
        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student1.addGrade(2.0);
        student1.addGrade(3.0);
        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student1.addGrade(2.0);
        student1.addGrade(3.0);
        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student1.addGrade(2.0);
        student1.addGrade(3.0);
        student1.addGrade(3.5);
        student1.addGrade(4.0);
        student1.addGrade(2.0);
        student1.addGrade(3.0);
        student1.addGrade(3.5);
        student1.addGrade(4.0);


        student2.addGrade(3.0);
        student2.addGrade(3.5);

        student3.addGrade(4.0);
        student3.addGrade(2.0);
        student3.addGrade(3.0);
        student3.addGrade(3.5);

        student4.addGrade(4.0);

        student5.addGrade(2.0);

        student6.addGrade(3.0);
        student6.addGrade(3.5);
        student6.addGrade(4.0);

        student7.addGrade(2.0);

        student8.addGrade(3.0);
        student8.addGrade(3.5);

        student9.addGrade(4.0);
        student9.addGrade(2.0);

        student10.addGrade(3.0);
        student10.addGrade(3.5);
        student10.addGrade(4.0);

        student11.addGrade(2.0);

        student12.addGrade(3.0);
        student12.addGrade(3.5);

        student13.addGrade(4.0);
        student13.addGrade(2.0);
        student13.addGrade(3.0);
        student13.addGrade(3.5);

        student14.addGrade(4.0);

        student15.addGrade(2.0);



        System.out.println("Grupa: " + group1.nazwa + " ma studentów:");
        for (Student s : group1.students) {
            System.out.println(s.fname + " " + s.lname + " Średnia: " + s.calculateAverage());

        }
    }

}