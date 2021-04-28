package Lesson6.main;

import Lesson6.model.Student;
import Lesson6.service.StudentService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\students.txt");
        String fileContent = Files.readString(Paths.get(file.getPath()));

        if (fileContent.isEmpty()) {
            System.out.println("File is empty");
            return;
        }

        String[] fileLines = fileContent.split("\\n");
        Student[] students = new Student[fileLines.length];

        int i = 0;
        for (String line : fileLines) {
            String[] data = line.split(",");

            Student student = new Student(data[0], data[1], Short.parseShort(data[3]));
            student.setGender(data[2].charAt(0));
            student.setMark(Double.parseDouble(data[4]));
            students[i++] = student;
        }

        StudentService.printFullName(students[2]);
        StudentService.printAllFemaleMakeGreater504(students);
        StudentService.printAllMale(students);
        StudentService.printBiggestMaleStudentInfo(students);
        StudentService.sortStudentsByMark(students);
        StudentService.printFemaleStudentsSortedByYear(students);
        StudentService.printStudentInfoWithMinimalMark(students);
    }
}
