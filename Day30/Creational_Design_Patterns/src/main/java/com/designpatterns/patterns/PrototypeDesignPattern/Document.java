package com.designpatterns.patterns.PrototypeDesignPattern;

/**
 * The type Document.
 */
abstract class Document implements Cloneable {
    /**
     * The Content.
     */
    protected String content;

    /**
     * Display.
     */
    public abstract void display();

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
