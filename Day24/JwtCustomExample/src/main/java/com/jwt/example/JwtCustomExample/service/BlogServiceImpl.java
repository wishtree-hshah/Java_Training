package com.jwt.example.JwtCustomExample.service;

import com.jwt.example.JwtCustomExample.entity.Blog;
import com.jwt.example.JwtCustomExample.filter.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Blog service.
 */
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog createBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> getBlogById(long id) {
        return blogRepository.findById(id);
    }

    @Override
    public String deleteBlog(long id) {
        blogRepository.deleteById(id);
        return "Blog with id: " + id + " is deleted";
    }
}
