package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    @NotBlank(message = "Student name is mandatory")
    @Column(name = "student_name", length = 50)
    private String studentName;
    @NotBlank(message = "Student Surname is mandatory")
    @Column(name = "student_surname", length = 30)
    private String studentSurname;
    @NotBlank(message = "Mobile number is mandatory")
    @Size(max = 10, min = 10, message = "Mobile number must be 10 digits")
    @Pattern(
            regexp = "^[6-9]\\d{9}",
            message = "Mobile number must be 10 digits long and start with 6, 7, 8, or 9"
    )
    @Column(name = "mobile_number", unique = true, length = 10)
    private String mobileNumber;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id", nullable = false)
    private Passport passport;
}
