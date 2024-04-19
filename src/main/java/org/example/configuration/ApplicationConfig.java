package org.example.configuration;

import org.example.dao.InMemoryStudentRepository;
import org.example.dao.StudentRepository;
import org.example.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }

    @Bean
    @Primary
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean

    public StudentService studentServiceMock() {
        return new StudentServiceMock();
    }
}