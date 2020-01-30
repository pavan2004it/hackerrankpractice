package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentChecker studentChecker = new studentChecker();
        studentList.add(new Student(33,"Rumpa",3.68));
        studentList.add(new Student(85,"Ashis",3.85));
        studentList.add(new Student(56,"Samiha",3.75));
        studentList.add(new Student(190,"Samiha",3.75));
        studentList.add(new Student(22,"Fahim",3.76));

        studentList.sort(studentChecker);

        for(Student st:studentList){
            System.out.println(st.getFname() + " " + st.getId());
        }

    }
}
