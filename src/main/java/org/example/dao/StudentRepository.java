package org.example.dao;

import org.example.entity.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
}
