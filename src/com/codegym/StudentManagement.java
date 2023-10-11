package com.codegym;

public class StudentManagement {

    public static void main(String[] args) {
        C09Student s1 = new C09Student(1, "Tý", 19, true);
        C09Student s2 = new C09Student(2, "Tèo", 18, true);
        C09Student s3 = new C09Student(3, "Tồ", 20, true);

        C09Student[] c09Students = new C09Student[3];
        c09Students[0] = s1;
        c09Students[1] = s2;
        c09Students[2] = s3;

        for (C09Student student : c09Students) {
            System.out.println(student);
        }
    }
}
