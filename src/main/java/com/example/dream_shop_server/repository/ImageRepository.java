package com.example.dream_shop_server.repository;

import com.example.dream_shop_server.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
