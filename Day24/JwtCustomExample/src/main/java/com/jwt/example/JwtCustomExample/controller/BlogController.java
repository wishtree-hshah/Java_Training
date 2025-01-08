package com.jwt.example.JwtCustomExample.controller;

import com.jwt.example.JwtCustomExample.entity.Blog;
import com.jwt.example.JwtCustomExample.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * The type Blog controller.
 */
@Controller
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    /**
     * Create blog response entity.
     *
     * @param blog the blog
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<?> createBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.createBlog(blog), HttpStatus.CREATED);
    }

    /**
     * Get all blogs response entity.
     *
     * @return the response entity
     */
    @GetMapping
    public ResponseEntity<?> getAllBlogs(){
        return new ResponseEntity<>(blogService.getAllBlogs(),HttpStatus.OK);
    }

    /**
     * Get blog by id response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getBlogById(@PathVariable long id){
        return new ResponseEntity<>(blogService.getBlogById(id),HttpStatus.OK);
    }

    /**
     * Delete blog response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable long id){
        return new ResponseEntity<>(blogService.deleteBlog(id),HttpStatus.OK);
    }
}
