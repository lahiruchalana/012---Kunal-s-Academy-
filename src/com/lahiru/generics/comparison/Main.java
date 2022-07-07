package com.lahiru.generics.comparison;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student lahiru = new Student(12,79.2f);
        Student kasun = new Student(15, 69.7f);
        Student isuru = new Student(11, 99.9f);

        Student[] studentList = {lahiru, kasun, isuru};

        System.out.println(Arrays.toString(studentList));

        // using marks, comparing and sorting happen
//        Arrays.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int) (o1.marks - o2.marks);
//            }
//        });

        // using marks, comparing and sorting happen
        Arrays.sort(studentList, (o1, o2) -> (int) (o1.marks - o2.marks));

        System.out.println(Arrays.toString(studentList));

//        if (lahiru.compareTo(kasun) < 0 ) {
//            System.out.println("Kasun has more marks than lahiru");
//            System.out.println(lahiru.compareTo(kasun));
//        }
//        if (lahiru.compareTo(isuru) < 0 ) {
//            System.out.println("Isuru has more marks than lahiru");
//        }
    }
}
