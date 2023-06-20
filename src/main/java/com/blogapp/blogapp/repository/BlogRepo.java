package com.blogapp.blogapp.repository;

import com.blogapp.blogapp.DTO.BlogDto;
import com.blogapp.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<BlogDto, Integer> {
}
