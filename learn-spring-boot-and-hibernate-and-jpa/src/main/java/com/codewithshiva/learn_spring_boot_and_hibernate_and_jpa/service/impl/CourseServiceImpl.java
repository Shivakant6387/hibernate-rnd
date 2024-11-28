package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.impl;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseRequestDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseResponseDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.repository.CourseRepository;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CourseResponseDto addCourse(CourseRequestDto courseRequestDto) {
        return null;
    }

    @Override
    public CourseResponseDto updateCourse(CourseRequestDto courseRequestDto, Long courseId) {
        return null;
    }

    @Override
    public CourseResponseDto deleteCourse(Long courseId) {
        return null;
    }

    @Override
    public List<CourseResponseDto> getAllCourses() {
        return List.of();
    }

    @Override
    public CourseResponseDto getCourseByCourseId(Long courseId) {
        return null;
    }
}
