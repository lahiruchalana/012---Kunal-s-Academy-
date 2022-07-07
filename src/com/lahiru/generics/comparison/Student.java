package com.lahiru.generics.comparison;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("checking comapareTo method");
        int difference = (int) (this.marks - o.marks);

        return difference;
    }
}
