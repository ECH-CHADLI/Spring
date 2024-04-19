package org.example.dao;

import org.example.dao.StudentRepository;
import org.example.entity.Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryStudentRepository implements StudentRepository {
    private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }
}