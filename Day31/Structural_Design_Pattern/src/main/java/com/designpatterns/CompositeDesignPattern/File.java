package com.designpatterns.CompositeDesignPattern;

/**
 * The type File.
 */
class File implements FileSystemComponent {
    private String name;
    private int size;

    /**
     * Instantiates a new File.
     *
     * @param name the name
     * @param size the size
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void showDetails() {
        System.out.println("File: " + name + ", Size: " + size + "KB");
    }
}
