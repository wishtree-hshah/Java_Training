package com.designpatterns.patterns.PrototypeDesignPattern;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws CloneNotSupportedException the clone not supported exception
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        WordDocument originalDoc = new WordDocument("Original Content");
        originalDoc.display();

        WordDocument clonedDoc = (WordDocument) originalDoc.clone();
        clonedDoc.setContent("Cloned Content");
        clonedDoc.display();

        System.out.println(originalDoc == clonedDoc);
    }
}
