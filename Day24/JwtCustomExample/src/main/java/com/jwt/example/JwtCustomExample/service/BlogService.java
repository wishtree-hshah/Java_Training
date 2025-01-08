package com.jwt.example.JwtCustomExample.service;

import com.jwt.example.JwtCustomExample.entity.Blog;

import java.util.List;
import java.util.Optional;

/**
 * The interface Blog service.
 */
public interface BlogService {
    /**
     * Create blog blog.
     *
     * @param blog the blog
     * @return the blog
     */
    public Blog createBlog(Blog blog);

    /**
     * Gets all blogs.
     *
     * @return the all blogs
     */
    public List<Blog> getAllBlogs();

    /**
     * Gets blog by id.
     *
     * @param id the id
     * @return the blog by id
     */
    public Optional<Blog> getBlogById(long id);

    /**
     * Delete blog string.
     *
     * @param id the id
     * @return the string
     */
    public String deleteBlog(long id);
}
