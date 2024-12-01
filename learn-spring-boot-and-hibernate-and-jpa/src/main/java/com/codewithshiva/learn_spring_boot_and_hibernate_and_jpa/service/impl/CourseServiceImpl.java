package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.impl;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseRequestDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseResponseDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.exection.CourseNotFoundException;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model.Course;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.repository.CourseRepository;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CourseResponseDto addCourse(CourseRequestDto courseRequestDto) throws UnknownHostException {
        Course course = modelMapper.map(courseRequestDto, Course.class);
        course.setCreateDateTime(LocalDateTime.now());
        course.setUpdateDateTime(null);
        course.setIpAddress(Inet4Address.getLocalHost().getHostAddress());
        Course saveCourse = courseRepository.save(course);
        CourseResponseDto courseResponseDto = modelMapper.map(saveCourse, CourseResponseDto.class);
        courseResponseDto.setMessage("Course added successfully");
        courseResponseDto.setHttpStatus(String.valueOf(HttpStatus.OK.value()));
        return courseResponseDto;
    }

    @Override
    public CourseResponseDto updateCourse(CourseRequestDto courseRequestDto, Long courseId) throws UnknownHostException {
        Course course = this.courseRepository.findById(courseId).orElseThrow(() -> new CourseNotFoundException("Course not found in DB :" + courseId, HttpStatus.NOT_FOUND));
        modelMapper.map(courseRequestDto, course);
        course.setUpdateDateTime(LocalDateTime.now());
        course.setIpAddress(Inet4Address.getLocalHost().getHostAddress());
        Course saveCourse = this.courseRepository.save(course);
        CourseResponseDto courseResponseDto = this.modelMapper.map(saveCourse, CourseResponseDto.class);
        courseResponseDto.setMessage("Course updated successfully");
        courseResponseDto.setHttpStatus(String.valueOf(HttpStatus.OK.value()));
        return courseResponseDto;
    }

    @Override
    public CourseResponseDto deleteCourse(Long courseId) {
        Course course = this.courseRepository.findById(courseId).orElseThrow(() -> new CourseNotFoundException("Course not found in DB :" + courseId, HttpStatus.NOT_FOUND));
        CourseResponseDto courseResponseDto = modelMapper.map(course, CourseResponseDto.class);
        courseResponseDto.setHttpStatus(String.valueOf(HttpStatus.OK.value()));
        courseResponseDto.setMessage("Course deleted successfully");
        return courseResponseDto;
    }

    @Override
    public List<CourseResponseDto> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map(course -> modelMapper.map(course, CourseResponseDto.class)).collect(Collectors.toList());
    }

    @Override
    public CourseResponseDto getCourseByCourseId(Long courseId) {
        Course course = this.courseRepository.findById(courseId).orElseThrow(() -> new CourseNotFoundException("Course not found in DB :" + courseId, HttpStatus.NOT_FOUND));
        CourseResponseDto courseResponseDto = modelMapper.map(course, CourseResponseDto.class);
        courseResponseDto.setHttpStatus(String.valueOf(HttpStatus.OK.value()));
        return courseResponseDto;
    }
}
