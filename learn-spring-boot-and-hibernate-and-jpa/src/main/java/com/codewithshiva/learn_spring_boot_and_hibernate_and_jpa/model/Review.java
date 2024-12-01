package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;
    @Column(name = "description", length = 200)
    private String description;
    @Column(name = "rating", length = 10)
    private String rating;
}
