package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponseDto {
    private String courseName;
    private String author;
    private long courseId;
    private String message;
    private String httpStatus;
}
