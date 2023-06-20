package com.blogapp.blogapp.service;
import com.blogapp.blogapp.DTO.BlogDto;
import com.blogapp.blogapp.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;


public class BlogService {
    @Autowired
    BlogRepo blogRepo;

    public ResponseEntity<BlogDto> saveBlogs(@RequestBody BlogDto blogDto) {
        return ResponseEntity.ok(blogRepo.save(blogDto));
    }
}
