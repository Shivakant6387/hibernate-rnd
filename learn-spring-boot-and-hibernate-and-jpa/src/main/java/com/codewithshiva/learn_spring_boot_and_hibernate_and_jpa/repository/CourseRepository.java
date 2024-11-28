package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.repository;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
