package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model;

import jakarta.persistence.*;
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
    private long passportId;
    @Column(name = "passport_number", length = 20)
    private String number;
}
