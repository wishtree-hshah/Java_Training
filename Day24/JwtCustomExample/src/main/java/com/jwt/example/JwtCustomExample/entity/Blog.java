package com.jwt.example.JwtCustomExample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * The type Blog.
 */
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    /**
     * Instantiates a new Blog.
     */
    public Blog() {}

    /**
     * Instantiates a new Blog.
     *
     * @param title   the title
     * @param content the content
     */
    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() { return id; }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() { return title; }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() { return content; }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) { this.content = content; }
}
