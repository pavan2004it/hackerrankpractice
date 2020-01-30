package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityStu {
    public void getStudents (List<String> events){
        PriorityQueue<StudentPriority> pq = new PriorityQueue<>(Comparator.comparingDouble(StudentPriority::getCgpa).thenComparing(StudentPriority::getName).thenComparing(StudentPriority::getId));
        System.out.println(pq);
    }

}
