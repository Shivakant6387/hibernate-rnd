package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseRequestDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseResponseDto;

import java.util.List;

public interface CourseService {
    CourseResponseDto addCourse(CourseRequestDto courseRequestDto);

    CourseResponseDto updateCourse(CourseRequestDto courseRequestDto, Long courseId);

    CourseResponseDto deleteCourse(Long courseId);

    List<CourseResponseDto> getAllCourses();

    CourseResponseDto getCourseByCourseId(Long courseId);
}
