package com.company;

import java.util.Comparator;

public class studentChecker implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getCgpa() == o2.getCgpa()){
            if(o1.getFname().equalsIgnoreCase(o2.getFname())){
                return o2.getId() - o1.getId();
            }
            return o1.getFname().compareToIgnoreCase(o2.getFname());

        }

        return Double.compare(o2.getCgpa(),o1.getCgpa());
    }
}

