package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(long studentId);

    Student updateStudent(long studentId, Student student);

    void deleteStudent(long studentId);
}
