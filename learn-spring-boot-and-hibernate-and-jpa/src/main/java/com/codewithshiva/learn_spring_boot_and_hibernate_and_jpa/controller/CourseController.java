package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.controller;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseRequestDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto.CourseResponseDto;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model.Course;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getAllCourse")
    public ResponseEntity<List<CourseResponseDto>> findAll() {
        List<CourseResponseDto> courseResponseDto = courseService.getAllCourses();
        courseResponseDto.forEach(courseResponse -> courseResponse.setHttpStatus(String.valueOf(HttpStatus.OK.value())));
        return new ResponseEntity<>(courseResponseDto, HttpStatus.OK);
    }

    @PostMapping("addCourse")
    public ResponseEntity<CourseResponseDto> addCourse(@RequestBody CourseRequestDto course) throws UnknownHostException {
        return new ResponseEntity<>(courseService.addCourse(course), HttpStatus.OK);
    }

    @PutMapping("/update/{coursId}")
    public ResponseEntity<CourseResponseDto> updateCourse(@PathVariable Long coursId, @RequestBody CourseRequestDto course) throws UnknownHostException {
        CourseResponseDto courseResponseDto = courseService.updateCourse(course, coursId);
        return new ResponseEntity<>(courseResponseDto, HttpStatus.OK);
    }

    @GetMapping("/findByCourseId/{courseId}")
    public ResponseEntity<CourseResponseDto> getCourse(@PathVariable Long courseId) {
        CourseResponseDto courseResponseDto = courseService.getCourseByCourseId(courseId);
        return new ResponseEntity<>(courseResponseDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{courseId}")
    public ResponseEntity<CourseResponseDto> deleteCourse(@PathVariable Long courseId) {
        CourseResponseDto courseResponseDto = courseService.deleteCourse(courseId);
        return new ResponseEntity<>(courseResponseDto, HttpStatus.OK);
    }
}
