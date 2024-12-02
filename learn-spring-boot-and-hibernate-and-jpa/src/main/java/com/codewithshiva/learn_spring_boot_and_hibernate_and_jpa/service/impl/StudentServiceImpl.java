package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.impl;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model.Student;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student getStudentById(long studentId) {
        return null;
    }

    @Override
    public Student updateStudent(long studentId, Student student) {
        return null;
    }

    @Override
    public void deleteStudent(long studentId) {

    }
}
