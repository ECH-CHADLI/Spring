package org.example.service;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private List<Student> students = new ArrayList<>();

    @Override
    public void createStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}