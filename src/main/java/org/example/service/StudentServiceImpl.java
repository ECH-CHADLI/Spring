package org.example.service;

import org.example.dao.StudentRepository;
import org.example.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayAllStudents() {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}