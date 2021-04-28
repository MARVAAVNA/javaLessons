package Lesson6.service;

import Lesson6.model.Student;

public class StudentService {

    public static void printFullName(Student student) {
        System.out.printf("%s %s\n", student.getFirstName(), student.getLastName());
    }

    public static void printAllMale(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'm') {
                student.printInfo();
            }
        }
    }

    public static void printAllFemaleMakeGreater504(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                student.printInfo();
            }
        }
    }

    public static void printStudentInfoWithMinimalMark(Student[] students) {
        Student min = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() < min.getMark()) {
                min = students[i];
            }
        }

        min.printInfo();
    }

    public static void printBiggestMaleStudentInfo(Student[] students) {
        Student biggestStudent = null;

        for (Student student : students) {
            if (student.getGender() == 'm') {
                if (biggestStudent == null) {
                    biggestStudent = student;
                } else if (student.getYear() < biggestStudent.getYear()) {
                    biggestStudent = student;
                }
            }
        }

        if (biggestStudent == null) {
            System.out.println("There were no boys among the students");
        } else {
            biggestStudent.printInfo();
        }
    }

    public static void sortStudentsByMark(Student[] students) {
        boolean check = true;
        int count = 0;

        while (check) {
            check = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i + 1].getMark() < students[i].getMark()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
            count++;
        }

        for (Student student : students) {
            student.printInfo();
        }
    }

    public static void printFemaleStudentsSortedByYear(Student[] students) {
        boolean check = true;
        int count = 0;

        while (check) {
            check = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i + 1].getYear() < students[i].getYear()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                }
            }
            count++;
        }

        for (Student student : students) {
            if (student.getGender() == 'f') {
                student.printInfo();
            }
        }
    }
}
