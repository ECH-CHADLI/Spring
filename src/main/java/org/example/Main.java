package org.example;

import org.example.configuration.ApplicationConfig;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        StudentService studentService = context.getBean(StudentService.class);

        Student student1 = new Student(1, "Romero Benson", 20);
        Student student2 = new Student(2, "Clint Scott", 19);
        Student student3 = new Student(3, "Maria Murphy", 21);
        Student student4 = new Student(4, "Blaine Maddison", 22);

        studentService.createStudent(student1);
        studentService.createStudent(student2);
        studentService.createStudent(student3);
        studentService.createStudent(student4);

        studentService.displayAllStudents();

        Student studentById = studentService.getStudentById(3);
        System.out.println("Student found by Id passed is: " + studentById);
    }
}



