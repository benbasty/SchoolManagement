package com.projects;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher kate = new Teacher(00002, "Kate", 12000);
        Teacher alla = new Teacher(00001, "Alla", 11500);
        Teacher karl = new Teacher(00004, "Karl", 13000);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(kate);
        teachers.add(alla);
        teachers.add(karl);

        Student ken = new Student(100000,"Ken",2);
        Student ana = new Student(100500,"Ana",1);
        Student ann = new Student(100200,"Ann", 5);
        List<Student> students = new ArrayList<>();
        students.add(ken);
        students.add(ana);
        students.add(ann);

        School ICTA = new School(teachers, students);

        ana.payFees(5000);
        ana.payFees(6000);

        System.out.println("ICTA has earned $" + ICTA.getTotalMoneyEarned());



    }
}
