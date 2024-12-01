package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.advice;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.exection.CourseNotFoundException;
import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.utils.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleCourseNotFoundException(CourseNotFoundException exception,
                                                                      WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
                webRequest.getDescription(false), String.valueOf(HttpStatus.BAD_REQUEST.value()));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
