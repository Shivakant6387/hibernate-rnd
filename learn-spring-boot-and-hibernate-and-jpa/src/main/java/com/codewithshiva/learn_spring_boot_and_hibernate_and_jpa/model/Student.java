package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model;

import jakarta.persistence.*;
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
    @Column(name = "student_name", length = 50)
    private String studentName;
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "passport_id", nullable = false)
//    private Passport passport;
}
