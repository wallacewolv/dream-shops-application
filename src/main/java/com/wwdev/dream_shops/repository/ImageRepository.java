package com.wwdev.dream_shops.repository;

import com.wwdev.dream_shops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
