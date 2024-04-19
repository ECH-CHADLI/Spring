package org.example.service;

import org.example.entity.Student;

public interface StudentService {
    void createStudent(Student student);
    Student getStudentById(Integer id);
    void displayAllStudents();
}

