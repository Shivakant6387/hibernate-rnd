package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.controller;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
}
