package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Billy", "Mays", 0, 1));
        students.add(new Student("Roger", "Clemmons", 1, 1));
        students.add(new Student("Big", "Bawss", 2, 1));
        students.add(new Student("Yolo", "Baggins", 3, 1));
        students.add(new Student("Harry", "Styles", 4, 1));
        students.add(new Student("Mufasa", "Lion", 5, 1));
        students.add(new Student("Billy", "Ray", 6, 1));
        students.add(new Student("Yama", "Slamma", 7, 1));
        students.add(new Student("Rex", "Tillerson", 8, 1));
        students.add(new Student("Wyatt", "Erp", 9, 1));
        students.add(new Student("Fleetwood", "Mac", 10, 1));
        students.add(new Student("Simba", "Lion", 11, 1));
        students.add(new Student("Hamlin", "Juza", 12, 1));
        students.add(new Student("Jacky", "Kennedy", 13, 1));
        students.add(new Student("Old", "Greg", 14, 1));

        HashSet<Student> class1 = new HashSet<>();
        class1.add(students.get( 0 ));
        class1.add(students.get( 1 ));
        class1.add(students.get( 2 ));
        class1.add(students.get( 3 ));
        class1.add(students.get( 4 ));

        HashSet<Student> class2 = new HashSet<>();
        class2.add(students.get( 5 ));
        class2.add(students.get( 6 ));
        class2.add(students.get( 7 ));
        class2.add(students.get( 8 ));
        class2.add(students.get( 9 ));

        HashSet<Student> class3 = new HashSet<>();
        class3.add(students.get( 10 ));
        class3.add(students.get( 11 ));
        class3.add(students.get( 12 ));
        class3.add(students.get( 13 ));
        class3.add(students.get( 14 ));

        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher("Big", "Bawss", 20, 1));
        teachers.add(new Teacher("Tom", "Clancy", 21, 1));
        teachers.add(new Teacher("Bill", "Thompson", 22, 1));


        HashMap<Teacher, HashSet> rollCall = new HashMap<>();
        rollCall.put(teachers.get(0), class1);
        rollCall.put(teachers.get(1), class2);
        rollCall.put(teachers.get(2), class3);

        for (Teacher educators : rollCall.keySet()) {
            System.out.println( educators );
        }

        for (HashSet educated : rollCall.values()) {
            System.out.println( educated );

        }

    }
}