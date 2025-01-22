package com.designpatterns.patterns.PrototypeDesignPattern;

/**
 * The type Word document.
 */
class WordDocument extends Document {
    /**
     * Instantiates a new Word document.
     *
     * @param content the content
     */
    public WordDocument(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Displaying Word Document: " + content);
    }
}
