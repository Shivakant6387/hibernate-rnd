package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CourseRequestDto {
    private String courseName;
    private String author;
}
