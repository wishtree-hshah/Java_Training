package com.jwt.example.JwtCustomExample.repository;

import com.jwt.example.JwtCustomExample.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Blog repository.
 */
public interface BlogRepository extends JpaRepository<Blog, Long> {}

