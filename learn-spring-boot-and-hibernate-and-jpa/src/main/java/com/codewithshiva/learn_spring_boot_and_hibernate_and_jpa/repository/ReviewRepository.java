package com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.repository;

import com.codewithshiva.learn_spring_boot_and_hibernate_and_jpa.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
