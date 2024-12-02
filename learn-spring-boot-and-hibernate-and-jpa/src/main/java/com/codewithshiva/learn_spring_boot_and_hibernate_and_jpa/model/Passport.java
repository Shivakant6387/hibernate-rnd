package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passport_id")
    private long passportId;
    @Column(name = "passport_number", unique = true, nullable = false, length = 20)
    @Size(min = 8, max = 20, message = "Passport number must be between 8 and 20 characters")
    @Pattern(regexp = "^[A-Z0-9]+$", message = "Passport number must be alphanumeric")
    private String passportNumber;
    @OneToOne(mappedBy = "passport", fetch = FetchType.LAZY)
    private Student student;
}
